package jul.nla.assertion.map;

import java.util.Map;

import jul.nla.assertion.Assertion;

public interface MapAssertion<T extends Map<?, ?>> extends Assertion<T>
{
	public abstract boolean hasEntry(Object key, Object value);

	public abstract boolean hasKey(Object key);

	public abstract boolean hasValue(Object value);

	@Override
	public default MapAssertion<T> not()
	{
		return new MapNotAssertion<>(this);
	}
}
