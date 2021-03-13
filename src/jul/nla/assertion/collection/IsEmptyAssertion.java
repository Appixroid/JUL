package jul.nla.assertion.collection;

import java.util.Collection;

import jul.nla.Assertion;

public class IsEmptyAssertion implements Assertion
{
	private Collection<?> collection;	
	
	public IsEmptyAssertion(Collection<?> collection)
	{
		this.collection = collection;
	}
	
	@Override
	public boolean isValid()
	{
		return this.collection.isEmpty();
	}
	
	@Override
	public String getMessage()
	{
		return this.collection.toString() + " is not empty";
	}
}