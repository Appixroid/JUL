package jul.nla.assertion.number;

import jul.nla.Assertion;
import jul.nla.assertion.comparable.ComparableAssertion;

public class NumberAssertion<T extends Number & Comparable<T>> extends ComparableAssertion<T>
{
	private T value;
	
	public NumberAssertion(T value)
	{
		super(value);
		this.value = value;
	}
	
	public Assertion isCloseTo(T value)
	{
		return new CloseToAssertion<T>(this.value, value);
	}
}
