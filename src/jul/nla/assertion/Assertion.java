package jul.nla.assertion;

public interface Assertion<T>
{
	public abstract T get();

	public abstract boolean isEqualTo(T value);

	public abstract boolean isAllOf(@SuppressWarnings("unchecked") T... values);

	public abstract boolean isIn(@SuppressWarnings("unchecked") T... values);

	public abstract boolean isNullValue();

	public abstract boolean isInstanceOf(Class<?> classValue);

	public abstract boolean isSameInstance(T value);

	public abstract boolean hasToString(String str);

	public default Assertion<T> not()
	{
		return new NotAssertion<T>(this);
	}
}
