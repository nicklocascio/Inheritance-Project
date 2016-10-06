import java.util.ArrayList;

class Runner
	{
	public static void main(String[] args)
		{
		ArrayList <ProfessionalAthletes> athletes = new ArrayList <ProfessionalAthletes>();
		
		athletes.add(new Skateboarder());
		athletes.add(new Snowboarder());
		athletes.add(new FootballPlayer());
		athletes.add(new BasketballPlayer());
		
		for(ProfessionalAthletes a : athletes)
			{
			a.stats();
			a.represents();
			a.getSponsored();
			a.makeMoney();
			a.train();
			a.tricks();
			a.plays();
			a.injuries();
			System.out.println("");
			}
		}
	}
