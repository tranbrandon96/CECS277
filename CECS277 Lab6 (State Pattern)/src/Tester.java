
public class Tester
{
	public static void main(String[] args)
	{
		Robot r = new Robot();
		
		RobotHappyMood rhm = new RobotHappyMood();
		RobotBoringMood rbm = new RobotBoringMood();
		
		r.setMood(rhm);
		r.doAction();
		
		r.setMood(rbm);
		r.doAction();
		
		if(r.getMood() instanceof RobotBoringMood)
		{
			r.setMood(rhm);
			r.doAction();
		}
	}
}
