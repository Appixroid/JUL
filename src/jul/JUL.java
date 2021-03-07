package jul;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

import jul.annotations.AfterAll;
import jul.annotations.AfterEach;
import jul.annotations.BeforeAll;
import jul.annotations.BeforeEach;
import jul.annotations.Test;
import jul.annotations.TestSet;
import jul.exception.JULException;
import jul.exception.MethodReflectionException;
import jul.reflection.Classes;
import jul.reflection.Methods;
import jul.result.TestResult;
import jul.result.TestSetResult;
import jul.result.TestSetResults;
import jul.result.type.ErrorType;
import jul.result.type.FailedType;
import jul.result.type.PassedType;
import jul.result.type.ResultType;

public class JUL
{
	public static void main(String[] args) throws ClassNotFoundException, IOException
	{
		System.out.println(JUL.test());
	}

	public static TestSetResults test()
	{
		ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
		TestSetResults result = new TestSetResults();
		
		for(Class<?> c : Classes.getAnnotatedClasses(TestSet.class))
		{
			try
			{
				TestSetResult testSetResults = JUL.executeTestSet(c);
				result.add(testSetResults);
			}
			catch(JULException e)
			{
				e.printStackTrace();
			}
		}
		
		return result;
	}

	private static TestSetResult executeTestSet(Class<?> testClass) throws JULException
	{
		try
		{
			TestSetResult result = new TestSetResult(testClass.getName());
			Object testInstance = testClass.getConstructor().newInstance();
			
			JUL.executeBeforeAll(testClass, testInstance);
			Collection<TestResult> testResults = JUL.executeTests(testClass, testInstance);
			JUL.executeAfterAll(testClass, testInstance);
			
			result.addAll(testResults);
			return result;
		}
		catch(InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | JULException e)
		{
			throw new JULException("Cannot run testSet(" + testClass.getName() + ") because : " + e.getMessage());
		}
	}

	private static void executeBeforeAll(Class<?> testClass, Object testInstance) throws JULException
	{
		try
		{
			JUL.executeAllAnnotatedMethods(testClass, testInstance, BeforeAll.class);
		}
		catch(MethodReflectionException e)
		{
			throw new JULException("Cannot run BeforeAll(" + e.getSource().getName() + ") because : " + e.getMessage());
		}
	}

	private static Collection<TestResult> executeTests(Class<?> testClass, Object testInstance) throws JULException
	{		
		Collection<TestResult> results = new ArrayList<TestResult>();
		
		for(Method test : Methods.getAnnotatedMethods(testClass, Test.class))
		{
			
			JUL.executeBeforeEach(testClass, testInstance);
			ResultType result = JUL.executeTest(test, testInstance);
			JUL.executeAfterEach(testClass, testInstance);

			results.add(new TestResult(test.getName(), result));
		}
		
		return results;
	}

	private static void executeBeforeEach(Class<?> testClass, Object testInstance) throws JULException
	{
		try
		{
			JUL.executeAllAnnotatedMethods(testClass, testInstance, BeforeEach.class);
		}
		catch(MethodReflectionException e)
		{
			throw new JULException("Cannot run BeforeEach(" + e.getSource().getName() + ") because : " + e.getMessage());
		}
	}

	private static ResultType executeTest(Method test, Object testInstance) throws JULException
	{
		try
		{
			test.invoke(testInstance);			
			return new PassedType();
		}
		catch(InvocationTargetException e)
		{
			if(e.getCause() instanceof AssertionError)
			{
				return new FailedType(e.getCause().getMessage());
			}
			else
			{
				return new ErrorType(e.getCause().getMessage());
			}
		}
		catch(IllegalAccessException | IllegalArgumentException e)
		{
			throw new JULException("Cannot run test(" + test.getName() + ") because : " + e.getMessage());
		}
	}

	private static void executeAfterEach(Class<?> testClass, Object testInstance) throws JULException
	{
		try
		{
			JUL.executeAllAnnotatedMethods(testClass, testInstance, AfterEach.class);
		}
		catch(MethodReflectionException e)
		{
			throw new JULException("Cannot run AfterEach(" + e.getSource().getName() + ") because : " + e.getMessage());
		}
	}

	private static void executeAfterAll(Class<?> testClass, Object testInstance) throws JULException
	{
		try
		{
			JUL.executeAllAnnotatedMethods(testClass, testInstance, AfterAll.class);
		}
		catch(MethodReflectionException e)
		{
			throw new JULException("Cannot run AfterAll(" + e.getSource().getName() + ") because : " + e.getMessage());
		}
	}

	private static void executeAllAnnotatedMethods(Class<?> testClass, Object testInstance, Class<?> annotation) throws MethodReflectionException
	{
		for(Method method : Methods.getAnnotatedMethods(testClass, annotation))
		{
			try
			{
				method.invoke(testInstance);
			}
			catch(IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
			{
				throw new MethodReflectionException(method, e.getMessage());
			}
		}
	}
}
