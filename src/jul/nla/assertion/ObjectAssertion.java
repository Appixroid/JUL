package jul.nla.assertion;

import jul.nla.Assertion;

public class ObjectAssertion implements Assertion
{
	private Object value;
	
	public ObjectAssertion(Object value)
	{
		this.value = value;
	}
	
	public Assertion isEqualTo(Object value)
	{
		return new EqualAssertion(this.value, value);
	}

	public Assertion isIn(Object... values)
	{
		return new InAssertion(this.value, values);
	}

	public Assertion isNullValue()
	{
		return new NullAssertion(this.value);
	}

	public Assertion isInstanceOf(Class<?> classValue)
	{
		return new InstanceOfAssertion(this.value, classValue);
	}

	public Assertion isSameInstance(Object value)
	{
		return new SameInstanceAssertion(this.value, value);
	}

	public Assertion hasToString(String str)
	{
		return new ToStringAssertion(this.value, str);
	}
	
	@Override
	public boolean isValid()
	{
		return true;
	}
	
	@Override
	public String getMessage()
	{
		return "";
	}
}
