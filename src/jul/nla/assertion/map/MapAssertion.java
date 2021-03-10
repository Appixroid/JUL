package jul.nla.assertion.map;

import java.util.Map;

import jul.nla.Assertion;
import jul.nla.assertion.ObjectAssertion;

public class MapAssertion extends ObjectAssertion
{
	private Map<?, ?> value;
	
	public MapAssertion(Map<?, ?> value)
	{
		super(value);
		this.value = value;
	}
	
	public Assertion hasEntry(Object key, Object value)
	{
		return new HasEntryAssertion(this.value, key, value);
	}
	
	public Assertion hasKey(Object key)
	{
		return new HasKeyAssertion(this.value, key);
	}
	
	public Assertion hasValue(Object value)
	{
		return new HasValueAssertion(this.value, value);
	}
}
