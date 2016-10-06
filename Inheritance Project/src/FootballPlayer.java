
class FootballPlayer extends TraditionalSports
	{
	protected FootballPlayer()
		{
		name = "Peyton Manning";
		sport = "Football";
		height = "6'5";
		age = 40;
		team = "Broncos";
		position = "Quarterback";
		}

	@Override
	protected void plays()
		{
		System.out.println("As a " + position + ", " + name.substring(0, 6) + " is the key playmaker. After the snap, he either hands it off to the running back, or he uses his cannon of an arm to throw one deep.");
		}

	@Override
	protected void injuries()
		{
		System.out.println("In " + sport + ", injuries are also quite common. There is a lot of hitting in this sport, and if " + name + " is not protected well enough, he can get very hurt.");
		}
	}
