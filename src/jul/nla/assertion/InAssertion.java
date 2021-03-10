package jul.nla.assertion;

import java.util.Arrays;

import jul.nla.assertion.collection.HasItemAssertion;

public class InAssertion extends HasItemAssertion
{	
	public InAssertion(Object value, Object... values)
	{
		super(Arrays.asList(values), value);
	}
}
