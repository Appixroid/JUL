package jul.nla.assertion.comparable.number;

import jul.nla.assertion.comparable.ComparableNotAssertion;

public class NumberNotAssertion<T extends Number & Comparable<T>> extends ComparableNotAssertion<T> implements NumberAssertion<T>
{
	private NumberAssertion<T> inner;
	
	public NumberNotAssertion(NumberAssertion<T> inner)
	{
		super(inner);
		this.inner = inner;
	}
	
	@Override
	protected NumberAssertion<T> inside()
	{
		return this.inner;
	}

	@Override
	public boolean isCloseTo(T value)
	{
		return !this.inner.isCloseTo(value);
	}

}
