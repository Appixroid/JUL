package jul.nla.assertion.map;

import java.util.Map;

import jul.nla.Assertion;

public class HasEntryAssertion implements Assertion
{
	private Map<?, ?> map;
	private Object key;
	private Object value;
	
	public HasEntryAssertion(Map<?, ?> collection, Object key, Object value)
	{
		this.map = collection;
		this.key = key;
		this.value = value;
	}
	
	@Override
	public boolean isValid()
	{
		Object value = this.map.get(this.key);
		
		if(value == null)
		{
			return false;
		}
		else
		{
			return value.equals(this.value);
		}
	}
	
	@Override
	public String getMessage()
	{
		return this.map.toString() + " doesn't contain the entry (" + this.key.toString() + ", " + this.value.toString() + ")";
	}
}
