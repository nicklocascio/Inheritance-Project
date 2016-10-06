
class Skateboarder extends ActionSports
	{
	protected Skateboarder()
		{
		name = "Nyjah Huston";
		sport = "Skateboarding";
		age = 21;
		height = "5'9";
		country = "USA";
		}

	@Override
	protected void tricks()
		{
		System.out.println(name.substring(0, 5) + " can skate just about anything. He is a great vert skater and he can skate any handrail in the park or streets.");			
		}

	@Override
	protected void plays()
		{

		}
	}
