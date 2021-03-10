package jul.nla.assertion;

import jul.nla.Assertion;

public class SameInstanceAssertion implements Assertion
{
	private Object value;
	private Object otherValue;
	
	public SameInstanceAssertion(Object value, Object otherValue)
	{
		this.value = value;
		this.otherValue = otherValue;
	}
	
	@Override
	public boolean isValid()
	{
		return this.value == this.otherValue;
	}
	
	@Override
	public String getMessage()
	{
		return this.value.toString() + " is not the same instance of " + this.otherValue.toString();
	}
}
