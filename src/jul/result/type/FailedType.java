package jul.result.type;

public class FailedType implements ResultType
{
	private static final String FAILED_TYPE = "FAILED";
	
	private String cause;
	
	public FailedType(String cause)
	{
		this.cause = cause;
	}
	
	@Override
	public String getType()
	{
		return FAILED_TYPE;
	}
	
	@Override
	public String getCause()
	{
		return this.cause;
	}

	@Override
	public boolean isSuccess()
	{
		return false;
	}

	@Override
	public String toString()
	{
		return FAILED_TYPE;
	}
}
