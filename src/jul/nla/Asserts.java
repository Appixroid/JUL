package jul.nla;

import java.util.Collection;
import java.util.Map;

import jul.nla.assertion.NotAssertion;
import jul.nla.assertion.ObjectAssertion;
import jul.nla.assertion.collection.CollectionAssertion;
import jul.nla.assertion.comparable.ComparableAssertion;
import jul.nla.assertion.map.MapAssertion;
import jul.nla.assertion.number.NumberAssertion;
import jul.nla.assertion.string.StringAssertion;

public class Asserts
{
	public static StringAssertion that(String value)
	{
		return new StringAssertion(value);
	}
	
	public static <T extends Number & Comparable<T>> NumberAssertion<T> that(T value)
	{
		return new NumberAssertion<T>(value);
	}
	
	public static <T extends Comparable<T>> ComparableAssertion<T> that(T value)
	{
		return new ComparableAssertion<T>(value);
	}
	
	public static MapAssertion that(Map<?, ?> value)
	{
		return new MapAssertion(value);
	}
	
	public static CollectionAssertion that(Collection<?> value)
	{
		return new CollectionAssertion(value);
	}
	
	public static ObjectAssertion that(Object value)
	{
		return new ObjectAssertion(value);
	}
	
	public static Assertion not(Assertion assertion)
	{
		return new NotAssertion(assertion);
	}
	
	public static void asserts(Assertion assertion)
	{
		assertion.validate();
	}

	public static void main(String[] args)
	{
		asserts(that(5).isGreaterThan(1).and(that(5).isLessThan(10)));
	}
}
