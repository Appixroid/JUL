package jul.nla.assertion.collection;

import java.util.Collection;

import jul.nla.Assertion;
import jul.nla.assertion.ObjectAssertion;

public class CollectionAssertion extends ObjectAssertion
{
	private Collection<?> value;
	
	public CollectionAssertion(Collection<?> value)
	{
		super(value);
		this.value = value;
	}
	
	public Assertion hasItem(Object value)
	{
		return new HasItemAssertion(this.value, value);
	}
	
	public Assertion isEmpty()
	{
		return new IsEmptyAssertion(this.value);
	}
}
