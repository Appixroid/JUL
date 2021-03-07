package jul.nla;

import java.util.Collection;
import java.util.Map;

import jul.nla.assertion.Assertion;
import jul.nla.assertion.ObjectAssertion;
import jul.nla.assertion.collection.CollectionAssertion;
import jul.nla.assertion.collection.CollectionObjectAssertion;
import jul.nla.assertion.comparable.ComparableAssertion;
import jul.nla.assertion.comparable.ComparableObjectAssertion;
import jul.nla.assertion.comparable.number.NumberAssertion;
import jul.nla.assertion.comparable.number.NumberObjectAssertion;
import jul.nla.assertion.comparable.string.StringAssertion;
import jul.nla.assertion.comparable.string.StringObjectAssertion;
import jul.nla.assertion.map.MapAssertion;
import jul.nla.assertion.map.MapObjectAssertion;

public class Asserts
{
	public static StringAssertion that(String value)
	{
		return new StringObjectAssertion(value);
	}
	
	public static <T extends Number & Comparable<T>> NumberAssertion<T> that(T value)
	{
		return new NumberObjectAssertion<T>(value);
	}
	
	public static <T extends Map<?, ?>> MapAssertion<T> that(T value)
	{
		return new MapObjectAssertion<T>(value);
	}
	
	public static <T extends Collection<?>> CollectionAssertion<T> that(T value)
	{
		return new CollectionObjectAssertion<T>(value);
	}
	
	public static <T extends Comparable<T>> ComparableAssertion<T> that(T value)
	{
		return new ComparableObjectAssertion<T>(value);
	}
	
	public static <T> Assertion<T> that(T value)
	{
		return new ObjectAssertion<T>(value);
	}
}
