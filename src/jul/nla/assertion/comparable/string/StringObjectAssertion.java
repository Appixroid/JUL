package jul.nla.assertion.comparable.string;

import jul.nla.assertion.comparable.ComparableObjectAssertion;

public class StringObjectAssertion extends ComparableObjectAssertion<String> implements StringAssertion
{
	public StringObjectAssertion(String value)
	{
		super(value);
	}

	@Override
	public boolean startsWith(String prefix)
	{
		return this.get().startsWith(prefix);
	}

	@Override
	public boolean endsWith(String suffix)
	{
		return this.get().endsWith(suffix);
	}

	@Override
	public boolean contains(String str)
	{
		return this.get().contains(str);
	}

}
