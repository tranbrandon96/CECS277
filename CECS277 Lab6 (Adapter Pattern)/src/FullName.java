
public class FullName implements FullNameInterface
{
	String firstName;
	String lastName;
	
	public FullName()
	{
		firstName = " ";
		lastName = " ";
	}
	
	public FullName(String n)
	{
		firstName = n.substring(0, n.indexOf(" "));
		lastName = n.substring(n.indexOf(" ") + 1);
	}
	
	@Override
	public void setFirstName(String f) 
	{
		
		firstName = f;
	}

	@Override
	public void setLastName(String l)
	{
		lastName = l;
		
	}

	@Override
	public String getFirstName() {
		
		return firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

}
