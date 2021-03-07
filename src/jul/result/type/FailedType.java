package jul.result.type;

public class FailedType implements ResultType
{
	private static final String FAILED_TYPE = "FAILED";
	
	@Override
	public String getType()
	{
		return FAILED_TYPE;
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
