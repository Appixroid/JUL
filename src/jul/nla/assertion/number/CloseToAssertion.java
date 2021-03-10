package jul.nla.assertion.number;

import jul.nla.Assertion;

public class CloseToAssertion<T extends Number & Comparable<T>> implements Assertion
{
	private T value;
	private T rounded;
	
	public CloseToAssertion(T value, T rounded)
	{
		this.value = value;
		this.rounded = rounded;
	}
	
	@Override
	public boolean isValid()
	{
		double delta = this.value.doubleValue() - this.rounded.doubleValue();
		return delta > -1 && delta < 1;
	}
	
	@Override
	public String getMessage()
	{
		return this.value.toString() + " is not close to " + this.rounded.toString();
	}
}
