package jul.nla.assertion.comparable.string;

import jul.nla.assertion.comparable.ComparableNotAssertion;

public class StringNotAssertion extends ComparableNotAssertion<String> implements StringAssertion
{
	private StringAssertion inner;

	public StringNotAssertion(StringAssertion inner)
	{
		super(inner);
		this.inner = inner;
	}

	@Override
	protected StringAssertion inside()
	{
		return this.inner;
	}

	@Override
	public boolean startsWith(String prefix)
	{
		return !this.inside().startsWith(prefix);
	}

	@Override
	public boolean endsWith(String suffix)
	{
		return !this.inside().endsWith(suffix);
	}

	@Override
	public boolean contains(String str)
	{
		return !this.inside().contains(str);
	}

}
