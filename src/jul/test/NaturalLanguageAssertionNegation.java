package jul.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jul.annotations.Test;
import jul.annotations.TestSet;
import static jul.nla.Asserts.*;

@TestSet
public class NaturalLanguageAssertionNegation
{
	@Test
	public void isNotEqualTo()
	{
		asserts(not(that(5).isEqualTo(6)));
	}

	@Test
	public void isNotGreaterThan()
	{
		asserts(not(that(5).isGreaterThan(10)));
	}

	@Test
	public void isNotGreaterOrEqualTo()
	{
		asserts(not(that(5).isGreaterOrEqualTo(10)));
	}

	@Test
	public void isNotLessThan()
	{
		asserts(not(that(5).isLessThan(1)));
	}

	@Test
	public void isNotLessOrEqualTo()
	{
		asserts(not(that(5).isLessOrEqualTo(1)));
	}

	@Test
	public void isNotCloseTo()
	{
		asserts(not(that(5.1).isCloseTo(8d)));
	}

	@Test
	public void isNotIn()
	{
		asserts(not(that(5).isIn(1, 9)));
	}

	@Test
	public void isNotNullValue()
	{
		asserts(not(that(5).isNullValue()));
	}

	@Test
	public void isNotIntanceOf()
	{
		asserts(not(that(5).isInstanceOf(String.class)));
	}

	@Test
	public void isNotSameInstance()
	{
		asserts(not(that(new Object()).isSameInstance(new Object())));
	}

	@Test
	public void hasNotToString()
	{
		asserts(not(that(5).hasToString("6")));
	}

	@Test
	public void hasNotItem()
	{
		List<Integer> l = new ArrayList<Integer>() {
			private static final long serialVersionUID = 1L;
			{
				this.add(1);
			}
		};

		asserts(not(that(l).hasItem(5)));
	}

	@Test
	public void hasNotEntry()
	{
		Map<Integer, String> m = new HashMap<Integer, String>() {
			private static final long serialVersionUID = 1L;
			{
				this.put(1, "1");
			}
		};
		asserts(not(that(m).hasEntry(5, "5")));
	}

	@Test
	public void hasNotKey()
	{
		Map<Integer, String> m = new HashMap<Integer, String>() {
			private static final long serialVersionUID = 1L;
			{
				this.put(1, "1");
			}
		};
		asserts(not(that(m).hasKey(5)));
	}

	@Test
	public void hasNotValue()
	{
		Map<Integer, String> m = new HashMap<Integer, String>() {
			private static final long serialVersionUID = 1L;
			{
				this.put(1, "1");
			}
		};
		asserts(not(that(m).hasValue("5")));
	}

	@Test
	public void startsNotWith()
	{
		asserts(not(that("12345").startsWith("5")));
	}

	@Test
	public void endsNotWith()
	{
		asserts(not(that("12345").endsWith("1")));
	}

	@Test
	public void notContains()
	{
		asserts(not(that("12345").contains("8")));
	}
}
