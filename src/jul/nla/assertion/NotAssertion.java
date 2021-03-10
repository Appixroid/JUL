package jul.nla.assertion;

import jul.nla.Assertion;

public class NotAssertion implements Assertion
{
	private Assertion toNegate;
	
	public NotAssertion(Assertion toNegate)
	{
		this.toNegate = toNegate;
	}
	
	@Override
	public boolean isValid()
	{
		return !this.toNegate.isValid();
	}
	
	@Override
	public String getMessage()
	{
		return "Opposite of ( " + this.toNegate.getMessage() + " )";
	}
}
