package jul.result;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

public class TestSetResults implements Iterable<TestSetResult>
{
	private Collection<TestSetResult> results;
	
	public TestSetResults()
	{
		this.results = new ArrayList<TestSetResult>();
	}
	
	public void add(TestSetResult result)
	{
		this.results.add(result);
	}
	
	public void addAll(Collection<TestSetResult> results)
	{
		this.results.addAll(results);
	}
	
	public boolean allPassed()
	{
		return this.getPassedTest() == this.getTotalTests();
	}
	
	public int getPassedTest()
	{
		return this.results.stream().map(result -> {
			return result.getPassedTest();
		}).collect(Collectors.summingInt(i -> {
			return i;
		}));
	}
	
	public int getTotalTests()
	{
		return this.results.stream().map(result -> {
			return result.getTotalTests();
		}).collect(Collectors.summingInt(i -> {
			return i;
		}));
	}
	
	@Override
	public String toString()
	{
		String str = "";
		
		for(TestSetResult result : this.results)
		{
			str += result.toString() + "\n\n";
		}
		
		str += "Final : " + this.getPassedTest() + " / " + this.getTotalTests() + " PASSED";
		
		return str;
	}

	@Override
	public Iterator<TestSetResult> iterator()
	{
		return this.results.iterator();
	}
}
