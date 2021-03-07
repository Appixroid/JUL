package jul.result.type;

public interface ResultType
{
	public abstract String getType();
	public abstract String toString();
	public abstract String getCause();
	
	public abstract boolean isSuccess();
}
