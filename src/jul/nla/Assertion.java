package jul.nla;

import jul.exception.JULAssertException;
import jul.nla.assertion.AndAssertion;
import jul.nla.assertion.ImplyAssertion;
import jul.nla.assertion.NotAssertion;
import jul.nla.assertion.OrAssertion;

public interface Assertion
{
	public abstract boolean isValid();
	public abstract String getMessage();
	
	public default void validate() throws JULAssertException
	{
		if(!this.isValid())
		{
			throw new JULAssertException(this.getMessage());
		}
	}
	
	public default Assertion and(Assertion assertion)
	{
		return new AndAssertion(this, assertion);
	}
	
	public default Assertion or(Assertion assertion)
	{
		return new OrAssertion(this, assertion);
	}
	
	public default Assertion invert()
	{
		return new NotAssertion(this);
	}
	
	public default Assertion imply(Assertion assertion)
	{
		return new ImplyAssertion(this, assertion);
	}
}
