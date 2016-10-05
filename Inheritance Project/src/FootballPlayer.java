
public class FootballPlayer extends TraditionalSports
	{
	public FootballPlayer()
		{
		name = "Peyton Manning";
		sport = "Football";
		height = "6'5";
		age = 40;

		}

	@Override
	public void plays()
		{
		System.out.println("As a quarterback, " + name.substring(0, 6) + " is the key playmaker. After the snap, he either hands it off to the running back, or he uses his cannon of an arm to throw one deep.");
		}

	@Override
	public void injuries()
		{
		System.out.println("In " + sport + ", injuries are also quite common. There is a lot of hitting in this sport, and if " + name + " is not protected well enough, he can get very hurt.");
		}
	}
