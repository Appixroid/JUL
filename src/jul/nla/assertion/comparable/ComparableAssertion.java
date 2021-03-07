package jul.nla.assertion.comparable;

import jul.nla.assertion.Assertion;

public interface ComparableAssertion<T extends Comparable<T>> extends Assertion<T>
{
	public abstract boolean isGreaterThan(T value);
	public abstract boolean isGreaterOrEqualTo(T value);
	
	public abstract boolean isLessThan(T value);
	public abstract boolean isLessOrEqualTo(T value);
	
	@Override
	public default ComparableAssertion<T> not()
	{
		return new ComparableNotAssertion<T>(this);
	}
}
