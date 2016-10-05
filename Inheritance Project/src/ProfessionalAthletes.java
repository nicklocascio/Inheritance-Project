
public abstract class ProfessionalAthletes
	{
	protected String name;
	protected String sport;
	protected int age;
	protected String height;
	
	public abstract void makeMoney();
	
	public abstract void train();
	
	public abstract void injuries();
	
	public void getSponsored()	
		{
		System.out.println("As a professional athlete, he has received numerous sponsorship deals from major companies as a result of their success in his sport.");
		}
	
	public void stats()
		{
		System.out.println(name + " is " + age + " years old and " + height + " tall.");	
		}
	}
