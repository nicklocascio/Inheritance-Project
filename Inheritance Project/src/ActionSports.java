
abstract class ActionSports extends ProfessionalAthletes
	{
	protected String country;
	
	protected abstract void tricks();
	
	protected void makeMoney()
		{
		System.out.println(name + " makes money through winning major contests such as the X Games and the Dew Tour. The higher you place the more money you walk away with. Sponsorships also account for numerous expenses.");
		}
	
	protected void train()
		{
		System.out.println("For training, " + name + " rides as much as possible, and with the help of a coach, works on progression and new tricks.");
		}
	
	protected void injuries()
		{
		System.out.println("Injuries are quite common in action sports, as they have very high impacts with high consequences.");
		}
	
	protected void winMedals()
		{
		System.out.println(name + " is one of the best " + sport + "s in the world, illustrated by their numerous X Games and Dew Tour medals.");
		}
	
	protected void represents()
		{
		System.out.println(name + " represents " + country + " in his competitions.");
		}
	}
