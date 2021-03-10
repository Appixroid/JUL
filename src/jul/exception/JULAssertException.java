package jul.exception;

public class JULAssertException extends AssertionError
{
	private static final long serialVersionUID = 2884007352784934592L;
	
	public JULAssertException(String message)
	{
		super(message);
	}
}
