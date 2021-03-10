package jul.nla.assertion.string;

import jul.nla.Assertion;

public class StartWithAssertion implements Assertion
{
	private String value;
	private String prefix;
	
	public StartWithAssertion(String value, String prefix)
	{
		this.value = value;
		this.prefix = prefix;
	}
	
	@Override
	public boolean isValid()
	{
		return this.value.startsWith(this.prefix);
	}
	
	@Override
	public String getMessage()
	{
		return this.value + " doesn't start with " + this.prefix;
	}
}
