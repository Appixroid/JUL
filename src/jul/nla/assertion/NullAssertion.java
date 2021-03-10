package jul.nla.assertion;

import jul.nla.Assertion;

public class NullAssertion implements Assertion
{
	private Object value;
	
	public NullAssertion(Object value)
	{
		this.value = value;
	}
	
	@Override
	public boolean isValid()
	{
		return this.value == null;
	}
	
	@Override
	public String getMessage()
	{
		return this.value.toString() + " is not null";
	}
}
