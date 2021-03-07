package jul.result;

import jul.result.type.ResultType;

public class TestResult
{
	private String name;
	private ResultType type;
	
	public TestResult(String name, ResultType type)
	{
		this.name = name;
		this.type = type;
	}
	
	public boolean isSuccess()
	{
		return this.type.isSuccess();
	}
	
	@Override
	public String toString()
	{
		return this.name + " : " + this.type.toString();
	}
}
