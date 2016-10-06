
abstract class TraditionalSports extends ProfessionalAthletes
	{
	protected String position;
	protected String team;
	
	protected abstract void plays();
	
	protected abstract void injuries();
	
	protected void tricks()
		{
		
		}
	
	protected void makeMoney()
		{
		System.out.println("Unlike action sports athletes, " + name + " doesn't make money for winning games. Instead he have a massive yearly salary that he is paid by his team, in addition to sponsorship money.");	
		}
	
	protected void train()
		{
		System.out.println("For training, " + name + " has practice almost every day in order to prepare for the game.");
		}
	
	protected void winRings()
		{
		System.out.println(sport + " players win championship rings rather than medals." + name + " has numerous rings, as they are one of the best in their sport.");
		}
	
	protected void represents()
		{
		System.out.println(name + " plays for the " + team + " as the " + position + ".");
		}
	}
