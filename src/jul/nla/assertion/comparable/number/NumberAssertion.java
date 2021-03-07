package jul.nla.assertion.comparable.number;

import jul.nla.assertion.comparable.ComparableAssertion;

public interface NumberAssertion<T extends Number & Comparable<T>> extends ComparableAssertion<T>
{
	public abstract boolean isCloseTo(T value);
	
	@Override
	default NumberAssertion<T> not()
	{
		return new NumberNotAssertion<>(this);
	}
}
