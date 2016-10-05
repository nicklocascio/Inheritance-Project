import java.util.ArrayList;

public class Runner
	{
	public static void main(String[] args)
		{
		ArrayList <ProfessionalAthletes> athletes = new ArrayList <ProfessionalAthletes>();
		
		athletes.add(new Skateboarder());
		athletes.add(new Snowboarder());
		athletes.add(new FootballPlayer());
		
		for(int i = 0; i < athletes.size(); i++)
			{
			athletes.get(i).stats();
			athletes.get(i).getSponsored();
			athletes.get(i).makeMoney();
			athletes.get(i).train();
			athletes.get(i).injuries();	
			System.out.println("");
			}
		}
	}
