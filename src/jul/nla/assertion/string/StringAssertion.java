package jul.nla.assertion.string;

import jul.nla.Assertion;
import jul.nla.assertion.comparable.ComparableAssertion;

public class StringAssertion extends ComparableAssertion<String>
{
	private String value;
	
	public StringAssertion(String value)
	{
		super(value);
		this.value = value;
	}
	
	public Assertion startsWith(String prefix)
	{
		return new StartWithAssertion(this.value, prefix);
	}
	
	public Assertion endsWith(String suffix)
	{
		return new EndWithAssertion(this.value, suffix);
	}
	
	public Assertion contains(String content)
	{
		return new ContainAssertion(this.value, content);
	}
}
