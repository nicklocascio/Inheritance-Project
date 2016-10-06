
class Snowboarder extends ActionSports
	{
	protected Snowboarder()
		{
		name = "Torstein Horgmo";
		sport = "Snowboarding";
		height = "5'8";
		age = 29;
		country = "Norway";
		}

	@Override
	protected void tricks()
		{
		System.out.println(name.substring(0, 8) + " is one of the most well-rounded people in " + sport + ". He is a great street rail rider, has put out some amazing backcountry parts, and is the most stylish park rider around.");			
		}

	@Override
	protected void plays()
		{
	
		}
	}
