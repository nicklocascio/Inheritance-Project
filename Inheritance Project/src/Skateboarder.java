
public class Skateboarder extends ActionSports
	{
	public Skateboarder()
		{
		name = "Nyjah Huston";
		sport = "Skateboarding";
		age = 21;
		height = "5'9";
		}

	@Override
	public void tricks()
		{
		System.out.println(name.substring(0, 5) + " can skate just about anything. He is a great vert skater and he can skate any handrail in the park or streets.");			
		}
	}
