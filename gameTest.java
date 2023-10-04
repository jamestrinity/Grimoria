import java.util.*;
public class gameTest 
{
    public static void main(String[] args) 
    {		
			boolean dialouge = true;
			System.out.print("\033[H\033[2J");
			System.out.flush();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome to the game :) press ENTER to continue");
			scanner.nextLine();
			System.out.print("\033[H\033[2J");
			System.out.flush();
			System.out.println("");
			System.out.println("In the land of Grimmoria, darkness had consumed everything.");
			scanner.nextLine();
			System.out.println("The once-beautiful kingdom was now overrun by monsters and dark magic.");
			scanner.nextLine();
			System.out.println("The people had fled or been turned into mindless creatures, and the only hope left was a legendary artifact known as...");
			scanner.nextLine();
			System.out.println("");
			System.out.println("the Heart of Light");
			System.out.println("");
			scanner.nextLine();
			System.out.print("\033[H\033[2J");
			System.out.flush();
			System.out.println("You wake up and hear a mysterious voice");
			System.out.println("'What is your name stranger?' The voice says...");
			System.out.println("");
			System.out.println("Enter your name: ");
			System.out.println("");
			String name = scanner.nextLine();

			int maxPoints = 25;

			int strength = 0;
        	int magic = 0;
        	int agility = 0;
        	int fortitude = 0;

			while (maxPoints > 0) {
				System.out.println("");
				System.out.println("Available points: " + maxPoints);
				System.out.println("Allocated points will go towards | STRENGTH | MAGIC | AGILITY | FORTITUDE |");
				System.out.println("");
		
				//strength
				System.out.print("Allocate points to strength: ");
				int strengthPoints = scanner.nextInt();

				if (strengthPoints > maxPoints) {
					System.out.println("Invalid input! Please allocate fewer points.");
					continue;
				}

				//magic
				System.out.print("Allocate points to magic: ");
				int magicPoints = scanner.nextInt();

				if (magicPoints > maxPoints) {
					System.out.println("Invalid input! Please allocate fewer points.");
					continue;
				}

				System.out.print("Allocate points to agility: ");
				int agilityPoints = scanner.nextInt();

				if (agilityPoints > maxPoints) {
					System.out.println("Invalid input! Please allocate fewer points.");
					continue;
				}

				System.out.print("Allocate points to fortitude: ");
				int fortitudePoints = scanner.nextInt();

				if (fortitudePoints > maxPoints) {
					System.out.println("Invalid input! Please allocate fewer points.");
					continue;
				}

				if (strengthPoints < 0 || magicPoints < 0 || agilityPoints < 0 || fortitudePoints < 0) {
					System.out.println("Invalid input! Please allocate non-negative points.");
					continue;
				}

				int totalPoints = strengthPoints + magicPoints + agilityPoints + fortitudePoints;
				if (totalPoints > maxPoints) {
					System.out.println("Invalid input! Please allocate fewer points.");
					continue;
				}

				strength += strengthPoints;
        	    magic += magicPoints;
        	    agility += agilityPoints;
        	    fortitude += fortitudePoints;
				maxPoints -= totalPoints;
			}
			System.out.print("\033[H\033[2J");
			System.out.flush();
			while (dialouge)
			{
				player player = new player(name, 50, 50, strength, 0, magic, agility, fortitude, 0, false, false, 0, null);
				System.out.println("");
				System.out.println("You awaken in a forest clearing, with nothing but your goal in mind. 'Find the Heart of Light' whispers a voice in your head.");
				System.out.println("You prepare to set off on your journey. What action do you take?");
				System.out.println("");
				System.out.println("1. Follow a well worn Dirt road and look for a way out");
				System.out.println("2. Investigate the whispers ushering you deeper into the forest");
				System.out.println("3. Climb a nearby tree to examine the area");
			
				int choice = scanner.nextInt();
				if (choice == 1) 
				{
						System.out.print("\033[H\033[2J");
						System.out.flush();
						pathA.startStory(player);
						dialouge = false;
				}
				else if	(choice ==  2)
				{
						System.out.print("\033[H\033[2J");
						System.out.flush();
						pathB.startStory(player);
						dialouge = false;
						continue;
				}
				else if (choice == 3)
				{
						System.out.print("\033[H\033[2J");
						System.out.flush();
						pathC.startStory(player);
						dialouge = false;
						continue;
				}
				else
				{
					System.out.println("INVALID INPUT PRESS ENTER TO TRY AGAIN");
					scanner.nextLine();
					scanner.nextLine();
					System.out.print("\033[H\033[2J");
					System.out.flush();
				}
			}
			scanner.close();
     }
}
