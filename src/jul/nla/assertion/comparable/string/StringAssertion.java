package jul.nla.assertion.comparable.string;

import jul.nla.assertion.comparable.ComparableAssertion;

public interface StringAssertion extends ComparableAssertion<String>
{
	public abstract boolean startsWith(String prefix);

	public abstract boolean endsWith(String suffix);

	public abstract boolean contains(String str);

	@Override
	default StringAssertion not()
	{
		return new StringNotAssertion(this);
	}
}
