
class BasketballPlayer extends TraditionalSports
	{
	protected BasketballPlayer()
		{
		name = "Steph Curry";
		sport = "Basketball";
		height = "6'3";
		age = 28;
		team = "Golden State Warriors";
		position = "Guard";
		}

	@Override
	protected void plays()
		{
		System.out.println("As a " + position + ", " + name + " is the best ball-handler and passer on the team. He is also able to make threes from way downtown.");
		}

	@Override
	protected void injuries()
		{
		System.out.println("Injuries may not be as common in " + sport + ", but they can get hurt from coming down from a high jump in a weird way, or charging into another player.");
		}

	
	}
