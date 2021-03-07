package jul.nla.assertion.comparable;

import jul.nla.assertion.ObjectAssertion;

public class ComparableObjectAssertion<T extends Comparable<T>> extends ObjectAssertion<T> implements ComparableAssertion<T>
{	
	public ComparableObjectAssertion(T value)
	{
		super(value);
	}
	
	@Override
	public boolean isGreaterThan(T value)
	{
		return this.get().compareTo(value) > 0;
	}

	@Override
	public boolean isGreaterOrEqualTo(T value)
	{
		return this.get().compareTo(value) >= 0;
	}

	@Override
	public boolean isLessThan(T value)
	{
		return this.get().compareTo(value) < 0;
	}

	@Override
	public boolean isLessOrEqualTo(T value)
	{
		return this.get().compareTo(value) <= 0;
	}
}
