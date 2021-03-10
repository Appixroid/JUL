package jul.nla.assertion.string;

import jul.nla.Assertion;

public class EndWithAssertion implements Assertion
{
	private String value;
	private String suffix;
	
	public EndWithAssertion(String value, String suffix)
	{
		this.value = value;
		this.suffix = suffix;
	}
	
	@Override
	public boolean isValid()
	{
		return this.value.endsWith(this.suffix);
	}
	
	@Override
	public String getMessage()
	{
		return this.value + " doesn't end with " + this.suffix;
	}
}
