package jul.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jul.annotations.Test;
import jul.annotations.TestSet;
import static jul.nla.Asserts.*;

@TestSet
public class NaturalLanguageAssertion
{
	@Test
	public void isEqualTo()
	{
		asserts(that(5).isEqualTo(5));
	}

	@Test
	public void isGreaterThan()
	{
		asserts(that(5).isGreaterThan(1));
	}

	@Test
	public void isGreaterOrEqualTo()
	{
		asserts(that(5).isGreaterOrEqualTo(1));
	}

	@Test
	public void isLessThan()
	{
		asserts(that(5).isLessThan(10));
	}

	@Test
	public void isLessOrEqualTo()
	{
		asserts(that(5).isLessOrEqualTo(10));
	}

	@Test
	public void isCloseTo()
	{
		asserts(that(5.1d).isCloseTo(5d));
	}

	@Test
	public void isIn()
	{
		asserts(that(5).isIn(1, 5, 9));
	}

	@Test
	public void isNullValue()
	{
		asserts(that((Object) null).isNullValue());
	}

	@Test
	public void isIntanceOf()
	{
		asserts(that(5).isInstanceOf(Integer.class));
	}

	@Test
	public void isSameInstance()
	{
		Object o = new Object();
		asserts(that(o).isSameInstance(o));
	}

	@Test
	public void hasToString()
	{
		asserts(that(5).hasToString("5"));
	}

	@Test
	public void hasItem()
	{
		List<Integer> l = new ArrayList<Integer>() {
			private static final long serialVersionUID = 1L;
			{
				this.add(5);
			}
		};

		asserts(that(l).hasItem(5));
	}

	@Test
	public void hasEntry()
	{
		Map<Integer, String> m = new HashMap<Integer, String>() {
			private static final long serialVersionUID = 1L;
			{
				this.put(5, "5");
			}
		};
		asserts(that(m).hasEntry(5, "5"));
	}

	@Test
	public void hasKey()
	{
		Map<Integer, String> m = new HashMap<Integer, String>() {
			private static final long serialVersionUID = 1L;
			{
				this.put(5, "5");
			}
		};
		asserts(that(m).hasKey(5));
	}

	@Test
	public void hasValue()
	{
		Map<Integer, String> m = new HashMap<Integer, String>() {
			private static final long serialVersionUID = 1L;
			{
				this.put(5, "5");
			}
		};
		asserts(that(m).hasValue("5"));
	}

	@Test
	public void startsWith()
	{
		asserts(that("12345").startsWith("1"));
	}

	@Test
	public void endsWith()
	{
		asserts(that("12345").endsWith("5"));
	}

	@Test
	public void contains()
	{
		asserts(that("12345").contains("5"));
	}
}
