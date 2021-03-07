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
		assert that(5).isEqualTo(5);
	}

	@Test
	public void isGreaterThan()
	{
		assert that(5).isGreaterThan(1);
	}

	@Test
	public void isGreaterOrEqualTo()
	{
		assert that(5).isGreaterOrEqualTo(1);
	}

	@Test
	public void isLessThan()
	{
		assert that(5).isLessThan(10);
	}

	@Test
	public void isLessOrEqualTo()
	{
		assert that(5).isLessOrEqualTo(10);
	}

	@Test
	public void isCloseTo()
	{
		assert that(5.1d).isCloseTo(5d);
	}

	@Test
	public void isAllOf()
	{
		assert that(5).isAllOf(5, 5, 5);
	}

	@Test
	public void isIn()
	{
		assert that(5).isIn(1, 5, 9);
	}

	@Test
	public void isNullValue()
	{
		assert that((Object) null).isNullValue();
	}

	@Test
	public void isIntanceOf()
	{
		assert that(5).isInstanceOf(Integer.class);
	}

	@Test
	public void isSameInstance()
	{
		Object o = new Object();
		assert that(o).isSameInstance(o);
	}

	@Test
	public void hasToString()
	{
		assert that(5).hasToString("5");
	}

	@Test
	public void hasItem()
	{
		List<Integer> l = new ArrayList<Integer>() {
			private static final long serialVersionUID = 1L;
			{
				add(5);
			}
		};

		assert that(l).hasItem(5);
	}

	@Test
	public void hasEntry()
	{
		Map<Integer, String> m = new HashMap<Integer, String>() {
			private static final long serialVersionUID = 1L;
			{
				put(5, "5");
			}
		};
		assert that(m).hasEntry(5, "5");
	}

	@Test
	public void hasKey()
	{
		Map<Integer, String> m = new HashMap<Integer, String>() {
			private static final long serialVersionUID = 1L;
			{
				put(5, "5");
			}
		};
		assert that(m).hasKey(5);
	}

	@Test
	public void hasValue()
	{
		Map<Integer, String> m = new HashMap<Integer, String>() {
			private static final long serialVersionUID = 1L;
			{
				put(5, "5");
			}
		};
		assert that(m).hasValue("5");
	}

	@Test
	public void startsWith()
	{
		assert that("12345").startsWith("1");
	}

	@Test
	public void endsWith()
	{
		assert that("12345").endsWith("5");
	}

	@Test
	public void contains()
	{
		assert that("12345").contains("5");
	}
}
