import java.util.*;
public class dead 
{
    public static boolean areEnemiesAlive(ArrayList<enemy> a) 
    {
        for (enemy enemy : a) {
            if (enemy.getHealth() > 0) {
                return true;
            }
        }
        return false;
    }

    public static void playerDead()
    {   
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println();
        System.out.println("");
        System.out.println("You have been defeated! The Land of Grimmoria remains in chaos");
        System.out.println("Hopefully one day an adventurer as brave as you will take on the mantle and save the world. Until then...");
        System.out.println("THANKS FOR PLAYING! Let each death be a lesson for future warriors.");
        System.out.println("");
        System.out.println("===GAME OVER!===");
        scanner.nextLine();
        System.exit(0);
    }
}
