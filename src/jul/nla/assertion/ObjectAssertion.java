package jul.nla.assertion;

import java.util.Arrays;

public class ObjectAssertion<T> implements Assertion<T>
{
	protected T value;
	
	public ObjectAssertion(T value)
	{
		this.value = value;
	}

	@Override
	public T get()
	{
		return this.value;
	}
	
	@Override
	public boolean isEqualTo(T value)
	{
		return this.get().equals(value);
	}

	@Override
	public boolean isAllOf(@SuppressWarnings("unchecked") T... values)
	{
		boolean allEquals = true;
		
		for(T value : values)
		{
			allEquals &= this.get().equals(value);
		}
		
		return allEquals;
	}

	@Override
	public boolean isIn(@SuppressWarnings("unchecked") T... values)
	{
		return Arrays.asList(values).contains(this.get());
	}

	@Override
	public boolean isNullValue()
	{
		return this.get() == null;
	}

	@Override
	public boolean isInstanceOf(Class<?> classValue)
	{
		return this.get().getClass().equals(classValue);
	}

	@Override
	public boolean isSameInstance(T value)
	{
		return this.get() == value;
	}
	
	@Override
	public boolean hasToString(String str)
	{
		return this.get().toString().equals(str);
	}
}
