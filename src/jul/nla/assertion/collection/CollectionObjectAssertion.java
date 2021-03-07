package jul.nla.assertion.collection;

import java.util.Collection;

import jul.nla.assertion.ObjectAssertion;

public class CollectionObjectAssertion<T extends Collection<?>> extends ObjectAssertion<T> implements CollectionAssertion<T>
{	
	public CollectionObjectAssertion(T value)
	{
		super(value);
	}

	@Override
	public boolean hasItem(Object value)
	{
		return this.get().contains(value);
	}
}
