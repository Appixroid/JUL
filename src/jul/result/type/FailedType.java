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
		return FailedType.FAILED_TYPE;
	}

	@Override
	public String getCause()
	{
		if(this.cause != null)
		{
			return this.cause.replace("\n", "\\n").replace("\t", "\\t");
		}
		else
		{
			return "Unknow";
		}
	}

	@Override
	public boolean isSuccess()
	{
		return false;
	}

	@Override
	public String toString()
	{
		return FailedType.FAILED_TYPE + " because " + this.getCause();
	}
}
