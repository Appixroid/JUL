package jul.nla.assertion.string;

import jul.nla.Assertion;

public class ContainAssertion implements Assertion
{
	private String value;
	private String content;
	
	public ContainAssertion(String value, String content)
	{
		this.value = value;
		this.content = content;
	}
	
	@Override
	public boolean isValid()
	{
		return this.value.contains(this.content);
	}
	
	@Override
	public String getMessage()
	{
		return this.value + " doesn't contain " + this.content;
	}
}
