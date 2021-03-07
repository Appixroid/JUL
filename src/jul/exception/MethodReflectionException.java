package jul.exception;

import java.lang.reflect.Method;

public class MethodReflectionException extends Exception
{
	private static final long serialVersionUID = -2187657104213644401L;

	private Method source;

	public MethodReflectionException(Method source, String message)
	{
		super(message);
	}

	public Method getSource()
	{
		return this.source;
	}
}
