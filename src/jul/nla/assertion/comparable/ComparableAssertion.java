package jul.nla.assertion.comparable;

import jul.nla.Assertion;
import jul.nla.assertion.ObjectAssertion;

public class ComparableAssertion<T extends Comparable<T>> extends ObjectAssertion
{
	private T value;

	public ComparableAssertion(T value)
	{
		super(value);
		this.value = value;
	}
	
	public Assertion isGreaterThan(T value)
	{
		return new GreaterAssertion<T>(this.value, value);
	}

	public Assertion isGreaterOrEqualTo(T value)
	{
		return new GreaterOrEqualAssertion<T>(this.value, value);
	}

	public Assertion isLessThan(T value)
	{
		return new LesserAssertion<T>(this.value, value);
	}

	public Assertion isLessOrEqualTo(T value)
	{
		return new LesserOrEqualAssertion<T>(this.value, value);
	}
}
