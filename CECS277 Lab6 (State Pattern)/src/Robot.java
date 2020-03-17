
public class Robot implements Mood
{
	private Mood m;
	
	public void setMood(Mood m)
	{
		this.m = m;
	}
	
	public Mood getMood()
	{
		return m;
	}
	
	@Override
	public void doAction() 
	{
		m.doAction();
	}

}
