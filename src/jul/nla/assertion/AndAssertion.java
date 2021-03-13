package jul.nla.assertion;

import jul.nla.Assertion;

public class AndAssertion implements Assertion
{
	private Assertion left;
	private Assertion right;
	
	public AndAssertion(Assertion left, Assertion right)
	{
		this.left = left;
		this.right = right;
	}
	
	@Override
	public boolean isValid()
	{
		return this.left.isValid() && this.right.isValid();
	}
	
	@Override
	public String getMessage()
	{
		return this.left.getMessage() + " or " + this.right.getMessage();
	}
}
