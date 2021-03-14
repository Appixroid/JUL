package jul.result.type;

public class ErrorType implements ResultType
{
	private static final String ERROR_TYPE = "ERROR";

	private String exceptionName;
	private String cause;

	public ErrorType(String exceptionName, String cause)
	{
		this.exceptionName = exceptionName;
		this.cause = cause;
	}

	@Override
	public String getType()
	{
		return ErrorType.ERROR_TYPE;
	}
	
	public String getExceptionName()
	{
		return this.exceptionName;
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
		return ErrorType.ERROR_TYPE + " threw " + this.getExceptionName() + " : " + this.getCause();
	}
}
