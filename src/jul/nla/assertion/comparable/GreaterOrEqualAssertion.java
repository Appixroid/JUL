package jul.nla.assertion.comparable;

import jul.nla.Assertion;

public class GreaterOrEqualAssertion<T extends Comparable<T>> implements Assertion
{
	private T left;
	private T right;
	
	public GreaterOrEqualAssertion(T left, T right)
	{
		this.left = left;
		this.right = right;
	}
	
	@Override
	public boolean isValid()
	{
		return this.left.compareTo(this.right) >= 0;
	}
	
	@Override
	public String getMessage()
	{
		return this.left.toString() + " is not greater or equal to " + this.right.toString();
	}
}