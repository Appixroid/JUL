package jul.nla.assertion.map;

import java.util.Map;

import jul.nla.assertion.ObjectAssertion;

public class MapObjectAssertion<T extends Map<?, ?>> extends ObjectAssertion<T> implements MapAssertion<T>
{	
	public MapObjectAssertion(T value)
	{
		super(value);
	}
	
	@Override
	public boolean hasEntry(Object key, Object value)
	{
		Object x = this.get().get(key);
		
		if(x != null)
		{
			return x.equals(value);
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean hasKey(Object key)
	{
		return this.get().containsKey(key);
	}

	@Override
	public boolean hasValue(Object value)
	{
		return this.get().containsValue(value);
	}

}
