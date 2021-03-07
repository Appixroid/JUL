# JUL

Java Unit Libraries (JUL) is a unit test framework.

## About

JUL is strongly inspired by JUnit. It does nothing more than JUnit and should not be used instead of JUnit. This project is mainly an experiment on how to do a unit test framework.

## Installation

Simply add the last released jar to your classpath project.

## Usage

### ExecuteTests

To execute the tests simply call :

```JAVA
JUL.test();
```

You can also print the result of this method if you want a resume of the tests.

### Annotations

JUL is annotation based, here is a summary of these.

```JAVA
@TestSet
```
Can be place on a class to make it testable.

--------------------------------------------

```JAVA
@BeforeAll
@AfterAll
```
Can be place on void returning methods of TestSet. It's executed once for the set.

--------------------------------------------

```JAVA
@BeforeEach
@AfterEach
```
Can be place on void returning methods of TestSet. It's executed before and after each test of the set.

--------------------------------------------

```JAVA
@Test
```
Can be place on void returning methods of TestSet. It represents a test of the set and generally contains an assertion.

### Assertion

The native assertion can be use for the tests. JUL provide the NLA module to make the assertion more readable.

### NLA

Natural Language Assertion (NLA) is a module to use method call instead of symbols in assertion.
For example :

```JAVA
import static jul.nla.Asserts.*; // Use to remove the 'Asserts.' prefix before each 'that()'

assert that(5).isEqualTo(5);
```

There are 6 assertions type to add test methods following the type in the that call;

#### Object Assertion

This is the generic assertion providing these test methods :

```JAVA
assert that(5).isEqualTo(5);

assert that(5).isAllOf(5, 5, 5);
assert that(5).isIn(1, 2, 3, 4, 5);

assert that((Ojbect) null).isNullValue();

assert that(5).isInstanceOf(Number.class);

Object o = new Object();
assert that(o).isSameInstance(o);

assert that(5).hasToString("5");

assert that(5).not().isEqualTo(6);
```
--------------------------------------------

#### Collection Assertion

Appends the Object Assertion with this method for Collections :

```JAVA
Collection<Integer> col = new ArrayList<Integer>();
col.add(5):
assert that(col).hasItem(5);
```

--------------------------------------------

#### Map Assertion

Appends the Object Assertion with these methods for Maps :

```JAVA
Map<Integer, String> map = new HashMap<Integer, String>();
map.put(5, "5");

assert that(map).hasEntry(5, "5");
assert that(map).hasKey(5);
assert that(map).hasValue("5");
```

--------------------------------------------

#### Comparable Assertion

Appends the Object Assertion with these methods for Object that implements Comparable :

```JAVA
assert that(5).isGreaterThan(1);
assert that(5).isGreaterOrEqualTo(1);
	
assert that(5).isLessThan(10);
assert that(5).isLessOrEqualTo(10);
```

--------------------------------------------

#### Number Assertion

Appends the Comparable Assertion with this method for Numbers like double, float, int, long :

```JAVA
assert that(5.3d).isCloseTo(5d);
````

--------------------------------------------

#### String Assertion

Appends the Comparable Assertion with these methods for String :

```JAVA
assert that("Hello World").startsWith("Hello");
assert that("Hello World").endsWith("World");
assert that("Hello World").contains("lo Wo");
```
