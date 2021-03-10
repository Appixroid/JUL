package jul.nla.assertion;

import jul.nla.Assertion;

public class InstanceOfAssertion implements Assertion
{
	private Object value;
	private Class<?> classValue;
	
	public InstanceOfAssertion(Object value, Class<?> classValue)
	{
		this.value = value;
		this.classValue = classValue;
	}
	
	@Override
	public boolean isValid()
	{
		return this.value.getClass().equals(this.classValue);
	}
	
	@Override
	public String getMessage()
	{
		return this.value.toString() + " is instance of " + this.value.getClass().getTypeName() + " instead of " + this.classValue.getTypeName();
	}
}
