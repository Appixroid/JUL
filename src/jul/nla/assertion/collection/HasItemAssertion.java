package jul.nla.assertion.collection;

import java.util.Collection;

import jul.nla.Assertion;

public class HasItemAssertion implements Assertion
{
	private Collection<?> collection;
	private Object value;
	
	
	public HasItemAssertion(Collection<?> collection, Object value)
	{
		this.collection = collection;
		this.value = value;
	}
	
	@Override
	public boolean isValid()
	{
		return this.collection.contains(this.value);
	}
	
	@Override
	public String getMessage()
	{
		return this.collection.toString() + " doesn't contain " + this.value.toString();
	}
}
