
abstract class ProfessionalAthletes
	{
	protected String name;
	protected String sport;
	protected int age;
	protected String height;
	
	protected abstract void makeMoney();
	
	protected abstract void train();
	
	protected abstract void injuries();
	
	protected abstract void tricks();
	
	protected abstract void plays();
	
	protected abstract void represents();
		
	protected void getSponsored()	
		{
		System.out.println("As a professional athlete, he has received numerous sponsorship deals from major companies as a result of their success in his sport.");
		}
	
	protected void stats()
		{
		System.out.println(name + " is " + age + " years old and " + height + " tall.");	
		}
	}
