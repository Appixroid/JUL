package jul.nla.assertion.map;

import java.util.Map;

import jul.nla.Assertion;

public class HasKeyAssertion implements Assertion
{
	private Map<?, ?> map;
	private Object key;
	
	
	public HasKeyAssertion(Map<?, ?> map, Object key)
	{
		this.map = map;
		this.key = key;
	}
	
	@Override
	public boolean isValid()
	{
		return this.map.containsKey(this.key);
	}
	
	@Override
	public String getMessage()
	{
		return this.map.toString() + " doesn't contain key : " + this.key.toString();
	}
}