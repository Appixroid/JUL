package jul.nla.assertion.map;

import java.util.Map;

import jul.nla.assertion.NotAssertion;

public class MapNotAssertion<T extends Map<?, ?>> extends NotAssertion<T> implements MapAssertion<T>
{
	private MapAssertion<T> inner;

	public MapNotAssertion(MapAssertion<T> inner)
	{
		super(inner);
		this.inner = inner;
	}

	@Override
	protected MapAssertion<T> inside()
	{
		return this.inner;
	}

	@Override
	public boolean hasEntry(Object key, Object value)
	{
		return !this.inside().hasEntry(key, value);
	}

	@Override
	public boolean hasKey(Object key)
	{
		return !this.inside().hasKey(key);
	}

	@Override
	public boolean hasValue(Object value)
	{
		return !this.inside().hasValue(value);
	}
}
