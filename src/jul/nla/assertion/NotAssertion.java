package jul.nla.assertion;

public class NotAssertion<T> implements Assertion<T>
{
	private Assertion<T> inner;
	
	public NotAssertion(Assertion<T> inner)
	{
		this.inner = inner;
	}
	
	protected Assertion<T> inside()
	{
		return this.inner;
	}
	
	@Override
	public T get()
	{
		return this.inside().get();
	}
	
	@Override
	public boolean isEqualTo(T value)
	{
		return !this.inside().isEqualTo(value);
	}

	@Override
	public boolean isAllOf(@SuppressWarnings("unchecked") T... values)
	{
		return !this.inside().isAllOf(values);
	}

	@Override
	public boolean isIn(@SuppressWarnings("unchecked") T... values)
	{
		return !this.inside().isIn(values);
	}

	@Override
	public boolean isNullValue()
	{
		return !this.inside().isNullValue();
	}

	@Override
	public boolean isInstanceOf(Class<?> classValue)
	{
		return !this.inside().isInstanceOf(classValue);
	}

	@Override
	public boolean isSameInstance(T value)
	{
		return !this.inside().isSameInstance(value);
	}
	
	@Override
	public boolean hasToString(String str)
	{
		return !this.inside().hasToString(str);
	}
}
