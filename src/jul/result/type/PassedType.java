package jul.result.type;

public class PassedType implements ResultType
{
	private static final String PASSED_TYPE = "PASSED";

	@Override
	public String getType()
	{
		return PASSED_TYPE;
	}

	@Override
	public boolean isSuccess()
	{
		return true;
	}

	@Override
	public String toString()
	{
		return PASSED_TYPE;
	}
}
