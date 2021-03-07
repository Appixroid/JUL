package jul.nla.assertion.comparable;

import jul.nla.assertion.NotAssertion;

public class ComparableNotAssertion<T extends Comparable<T>> extends NotAssertion<T> implements ComparableAssertion<T>
{
	private ComparableAssertion<T> inner;

	public ComparableNotAssertion(ComparableAssertion<T> inner)
	{
		super(inner);
		this.inner = inner;
	}

	@Override
	protected ComparableAssertion<T> inside()
	{
		return this.inner;
	}

	@Override
	public boolean isGreaterThan(T value)
	{
		return !this.inside().isGreaterThan(value);
	}

	@Override
	public boolean isGreaterOrEqualTo(T value)
	{
		return !this.inside().isGreaterOrEqualTo(value);
	}

	@Override
	public boolean isLessThan(T value)
	{
		return !this.inside().isLessThan(value);
	}

	@Override
	public boolean isLessOrEqualTo(T value)
	{
		return !this.inside().isLessOrEqualTo(value);
	}
}
