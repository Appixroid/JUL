package jul.nla.assertion.collection;

import java.util.Collection;

import jul.nla.assertion.Assertion;

public interface CollectionAssertion<T extends Collection<?>> extends Assertion<T>
{
	public abstract boolean hasItem(Object value);
	
	@Override
	public default CollectionAssertion<T> not()
	{
		return new CollectionNotAssertion<T>(this);
	}
}
