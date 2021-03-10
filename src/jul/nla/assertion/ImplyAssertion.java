package jul.nla.assertion;

import jul.nla.Assertion;

public class ImplyAssertion implements Assertion
{
	private Assertion left;
	private Assertion right;
	
	public ImplyAssertion(Assertion left, Assertion right)
	{
		this.left = left;
		this.right = right;
	}
	
	@Override
	public boolean isValid()
	{
		return !this.left.isValid() || this.right.isValid();
	}
	
	@Override
	public String getMessage()
	{
		return this.right.getMessage();
	}
}
