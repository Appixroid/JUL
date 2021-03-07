package jul.result;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

public class TestSetResult implements Iterable<TestResult>
{
	private String name;
	private Collection<TestResult> results;

	public TestSetResult(String name)
	{
		this.name = name;
		this.results = new ArrayList<TestResult>();
	}

	public void add(TestResult result)
	{
		this.results.add(result);
	}

	public void addAll(Collection<TestResult> results)
	{
		this.results.addAll(results);
	}

	public String getName()
	{
		return this.name;
	}

	public boolean allPassed()
	{
		return this.getPassedTest() == this.getTotalTests();
	}

	public int getPassedTest()
	{
		return this.results.stream().filter(result -> {
			return result.isSuccess();
		}).collect(Collectors.counting()).intValue();
	}

	public int getTotalTests()
	{
		return this.results.size();
	}

	@Override
	public String toString()
	{
		String str = "Testing " + this.name + " : \n";

		for(TestResult result : this.results)
		{
			str += "\t" + result.toString() + "\n";
		}

		str += "Total : " + this.getPassedTest() + " / " + this.getTotalTests() + " PASSED";

		return str;
	}

	@Override
	public Iterator<TestResult> iterator()
	{
		return this.results.iterator();
	}
}
