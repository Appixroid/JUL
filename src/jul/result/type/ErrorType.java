package jul.result.type;

public class ErrorType implements ResultType
{
	private static final String ERROR_TYPE = "ERROR";

	private String cause;

	public ErrorType(String cause)
	{
		this.cause = cause;
	}

	@Override
	public String getType()
	{
		return ErrorType.ERROR_TYPE;
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
		return ErrorType.ERROR_TYPE + " threw " + this.getCause();
	}
}
