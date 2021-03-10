package jul.nla.assertion;

import jul.nla.Assertion;

public class ToStringAssertion implements Assertion
{
	private Object value;
	private String str;
	
	public ToStringAssertion(Object value, String str)
	{
		this.value = value;
		this.str = str;
	}
	
	@Override
	public boolean isValid()
	{
		return this.value.toString().equals(this.str);
	}
	
	@Override
	public String getMessage()
	{
		return this.value.toString() + " is toString result instead of " + this.str;
	}
}
