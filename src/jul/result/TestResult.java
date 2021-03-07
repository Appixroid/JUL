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
	
	public String getName()
	{
		return this.name;
	}
	
	public String getType()
	{
		return this.type.getType();
	}
	
	public String getCause()
	{
		return this.type.getCause();
	}
	
	@Override
	public String toString()
	{
		return this.name + " : " + this.type.toString();
	}
}
