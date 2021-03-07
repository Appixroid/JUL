package jul.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jul.annotations.Test;
import jul.annotations.TestSet;
import jul.nla.Asserts;

@TestSet
public class NaturalLanguageAssertionNegation
{
	@Test
	public void isNotEqualTo()
	{
		assert Asserts.that(5).not().isEqualTo(6);
	}

	@Test
	public void isNotGreaterThan()
	{
		assert Asserts.that(5).not().isGreaterThan(10);
	}

	@Test
	public void isNotGreaterOrEqualTo()
	{
		assert Asserts.that(5).not().isGreaterOrEqualTo(10);
	}

	@Test
	public void isNotLessThan()
	{
		assert Asserts.that(5).not().isLessThan(1);
	}

	@Test
	public void isNotLessOrEqualTo()
	{
		assert Asserts.that(5).not().isLessOrEqualTo(1);
	}

	@Test
	public void isNotCloseTo()
	{
		assert Asserts.that(5.1).not().isCloseTo(8d);
	}

	@Test
	public void isNotAllOf()
	{
		assert Asserts.that(5).not().isAllOf(5, 4, 5);
	}

	@Test
	public void isNotIn()
	{
		assert Asserts.that(5).not().isIn(1, 9);
	}

	@Test
	public void isNotNullValue()
	{
		assert Asserts.that(5).not().isNullValue();
	}

	@Test
	public void isNotIntanceOf()
	{
		assert Asserts.that(5).not().isInstanceOf(String.class);
	}

	@Test
	public void isNotSameInstance()
	{
		assert Asserts.that(new Object()).not().isSameInstance(new Object());
	}

	@Test
	public void hasNotToString()
	{
		assert Asserts.that(5).not().hasToString("6");
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

		assert Asserts.that(l).not().hasItem(5);
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
		assert Asserts.that(m).not().hasEntry(5, "5");
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
		assert Asserts.that(m).not().hasKey(5);
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
		assert Asserts.that(m).not().hasValue("5");
	}

	@Test
	public void startsNotWith()
	{
		assert Asserts.that("12345").not().startsWith("5");
	}

	@Test
	public void endsNotWith()
	{
		assert Asserts.that("12345").not().endsWith("1");
	}

	@Test
	public void notContains()
	{
		assert Asserts.that("12345").not().contains("8");
	}
}
