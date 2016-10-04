
public abstract class ProfessionalAthletes
	{
	protected String name;
	protected String sport;
	protected int age;
	protected int height;
	
	public abstract void makeMoney();
	
	public abstract void train();
	
	public abstract void injuries();
	
	public void getSponsored()	
		{
		System.out.println("As a professional athlete, they have received numerous sponsorship deals from major companies as a result of their success in their sport.");
		}
	}
