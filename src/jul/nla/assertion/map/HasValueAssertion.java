package jul.nla.assertion.map;

import java.util.Map;

import jul.nla.Assertion;

public class HasValueAssertion implements Assertion
{
	private Map<?, ?> map;
	private Object value;
	
	
	public HasValueAssertion(Map<?, ?> map, Object value)
	{
		this.map = map;
		this.value = value;
	}
	
	@Override
	public boolean isValid()
	{
		return this.map.containsValue(this.value);
	}
	
	@Override
	public String getMessage()
	{
		return this.map.toString() + " doesn't contain value : " + this.value.toString();
	}
}
