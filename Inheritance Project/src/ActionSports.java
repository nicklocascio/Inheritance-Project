
public abstract class ActionSports extends ProfessionalAthletes
	{
	protected String country;
	
	public abstract void tricks();
	
	public void makeMoney()
		{
		System.out.println(name + " makes money through winning major contests such as the X Games and the Dew Tour. The higher you place the more money you walk away with. Sponsorships also account for numerous expenses.");
		}
	
	public void train()
		{
		System.out.println("For training, " + name + " rides as much as possible, and with the help of a coach, works on progression and new tricks.");
		}
	
	public void injuries()
		{
		System.out.println("Injuries are quite common in action sports, as they have very high impacts with high consequences.");
		}
	
	public void winMedals()
		{
		System.out.println(name + " is one of the best " + sport + "s in the world, illustrated by their numerous X Games and Dew Tour medals.");
		}
	}
