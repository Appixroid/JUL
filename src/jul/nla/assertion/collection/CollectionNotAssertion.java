package jul.nla.assertion.collection;

import java.util.Collection;

import jul.nla.assertion.NotAssertion;

public class CollectionNotAssertion<T extends Collection<?>> extends NotAssertion<T> implements CollectionAssertion<T>
{
	private CollectionAssertion<T> inner;
	
	public CollectionNotAssertion(CollectionAssertion<T> inner)
	{
		super(inner);
		this.inner = inner;
	}
	
	@Override
	protected CollectionAssertion<T> inside()
	{
		return this.inner;
	}

	@Override
	public boolean hasItem(Object value)
	{
		return !this.inside().hasItem(value);
	}

}
