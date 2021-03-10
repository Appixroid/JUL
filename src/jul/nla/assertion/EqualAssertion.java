package jul.nla.assertion;

import jul.nla.Assertion;

public class EqualAssertion implements Assertion
{
	private Object left;
	private Object right;
	
	public EqualAssertion(Object left, Object right)
	{
		this.left = left;
		this.right = right;
	}
	
	@Override
	public boolean isValid()
	{
		return this.left.equals(this.right);
	}
	
	@Override
	public String getMessage()
	{
		return this.left.toString() + " is not equal to " + this.right.toString();
	}
}
