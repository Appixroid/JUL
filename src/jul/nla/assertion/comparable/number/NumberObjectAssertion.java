package jul.nla.assertion.comparable.number;

import jul.nla.assertion.comparable.ComparableObjectAssertion;

public class NumberObjectAssertion<T extends Number & Comparable<T>> extends ComparableObjectAssertion<T> implements NumberAssertion<T>
{
	public NumberObjectAssertion(T value)
	{
		super(value);
	}

	@Override
	public boolean isCloseTo(T value)
	{
		double delta = this.get().doubleValue() - value.doubleValue();
		return (delta > -1d) && (delta < 1d);
	}

}
