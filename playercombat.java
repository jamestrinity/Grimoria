import java.util.*;
public class playercombat
{
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void playerTurn(player player, enemy enemy)
    {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println();
                    System.out.println(player.getName() + "'s Stats: " + player.getHealth() + "/" + player.getmaxHealth()+ " HP|" + player.getFortitude() + " FTD|" + player.getStrength() + " ATK|" + player.getAgility() + " AGI|" + player.getMagic() + " MAG|"+ player.getCrit() + " CRT|");
                    System.out.println();
                    System.out.println("1. Attack !");
                    System.out.println("2. Defend !");	
                    System.out.println("3. Heal !");	
                    if (player.getMagic() > 0){
                        System.out.println("4. Magic Attack !");
                    }	
                    int input = scanner.nextInt();	
                    System.out.println("");
                    //player attack
                    if(input == 1)
                    {
                        int hit = (int)(Math.random() * 100);
                        if (hit + player.getAgility() > 20)
                        {
                            System.out.println(player.getName() + " attacks the " + enemy.getType() + "!");
                            if(enemy.getDefending())
                            {
                                enemy.takeDamage(1);
                                System.out.println(enemy.getType() + " takes 1 damage !" );
                                enemy.setDefending(false);
                            }
                            else
                            {
                                int crit = (int)(Math.random() * 155);
                                if (player.getCrit()>crit)
                                {
                                    System.out.println(ANSI_RED+"CRITICAL HIT !!!"+ANSI_RESET);
                                    enemy.takeDamage((player.getStrength() * 2) - enemy.getFortitude());
                                    System.out.println(enemy.getType() + " takes " + ((player.getStrength() * 2) - enemy.getFortitude()) + " damage !" );
                                }
                                else
                                {
                                    enemy.takeDamage(player.getStrength() - enemy.getFortitude());
                                    if((player.getStrength() - enemy.getFortitude()) >= 0){
                                        System.out.println(enemy.getType() + " takes " + (player.getStrength() - enemy.getFortitude()) + " damage !" );
                                    }
                                    else
                                    {
                                        System.out.println(enemy.getType() + " takes 1 damage !" );
                                    }
                                }
                                
                            }
                            System.out.println(enemy.getType() + " has " + enemy.getHealth() + "/" + enemy.getmaxHealth() +  " Health Remaining");
                        }
                        else 
                        {
                            System.out.println(player.getName() + " attacks the " + enemy.getType() + "!");
                            System.out.println(player.getName() + " MISSES !!!");
                            System.out.println(enemy.getType() + " has " + enemy.getHealth() + "/" + enemy.getmaxHealth() +  " Health Remaining");
                        }
                    }
                    else if (input == 4)
                    {
                        System.out.println("1. Magic Missle (Armor Piercing)");
                        System.out.println("2. Fireball (Chance to cause BURN)");
                        System.out.println("3. Frostbreath (Chance to cause FROZEN)");	
                        System.out.println("4. Zap (High Critical Damage)");
                        int magInput = scanner.nextInt();
                        if (magInput == 1)
                        {
                            System.out.println("You cast a Magic Missle spell on " + enemy.getType());
                            enemy.takeDamage(((3 * player.getMagic()) / 4) - (enemy.getFortitude() / 2));
                            if(((3 * player.getMagic()) / 4) - (enemy.getFortitude() / 2) >= 0){
                                System.out.println(enemy.getType() + " takes " + ((3 * player.getMagic() /4) - (enemy.getFortitude() / 2)) + " damage !" );
                            }
                            else
                            {
                                System.out.println(enemy.getType() + " takes 1 damage !" );
                            }
                            System.out.println(enemy.getType() + " has " + enemy.getHealth() + "/" + enemy.getmaxHealth() +  " Health Remaining");
                        }
                        if (magInput == 2)
                        {
                            System.out.println("You cast a Fireball on " + enemy.getType());
                            enemy.takeDamage((2 * player.getMagic() / 3) - enemy.getFortitude());
                            if((2 * player.getMagic() / 3) - enemy.getFortitude() >= 0){
                                System.out.println(enemy.getType() + " takes " + ((2 * player.getMagic() / 3) - enemy.getFortitude()) + " damage !" );
                            }
                            else
                            {
                                System.out.println(enemy.getType() + " takes 1 damage !" );
                            }
                            System.out.println(enemy.getType() + " has " + enemy.getHealth() + "/" + enemy.getmaxHealth() +  " Health Remaining");
                            int burn = (int)(Math.random() * 100);
                            if (burn > 75)
                            {
                                System.out.println(enemy.getType() + "Has been Burned!");
                                enemy.setBurnCounter(3);
                            }   
                        }
                        if (magInput == 3)
                        {
                            System.out.println("You cast Frostbreath on " + enemy.getType());
                            enemy.takeDamage((2/5 * player.getMagic()) - enemy.getFortitude());
                            if((2/5 * player.getMagic()) - enemy.getFortitude() >= 0){
                                System.out.println(enemy.getType() + " takes " + ((2 * player.getMagic() / 5) - (enemy.getFortitude())) + " damage !" );
                            }
                            else
                            {
                                System.out.println(enemy.getType() + " takes 1 damage !" );
                            }
                            System.out.println(enemy.getType() + " has " + enemy.getHealth() + "/" + enemy.getmaxHealth() +  " Health Remaining");
                            int frz = (int)(Math.random() * 100);
                            if (frz > 80)
                            {
                                System.out.println(enemy.getType() + "Has been Frozen!");
                                enemy.setFrozenCounter(1);
                            }
                        }
                        if (magInput == 4 & player.getMagic() > 0)
                        {
                            int critM = (int)(Math.random() * 155);
                                if (player.getCrit() + player.getMagic()>critM)
                                {
                                    System.out.println(ANSI_RED+"CRITICAL HIT !!!"+ANSI_RESET);
                                    enemy.takeDamage((player.getMagic() * 3) - enemy.getFortitude());
                                    if ((player.getMagic() * 3) - enemy.getFortitude() >= 0){
                                        System.out.println(enemy.getType() + " takes " + ((player.getMagic() * 3) - (enemy.getFortitude())) + " damage !" );
                                    }
                                    else
                                    {
                                        System.out.println(enemy.getType() + " takes 1 damage !" );
                                    }
                                    System.out.println(enemy.getType() + " has " + enemy.getHealth() + "/" + enemy.getmaxHealth() +  " Health Remaining");
                                }
                                else
                                {
                                    enemy.takeDamage((player.getMagic() / 2) - enemy.getFortitude());
                                    if ((player.getMagic() / 2) - enemy.getFortitude() >= 0){
                                        System.out.println(enemy.getType() + " takes " + ((player.getMagic() / 2) - (enemy.getFortitude())) + " damage !" );
                                    }
                                    else
                                    {
                                        System.out.println(enemy.getType() + " takes 1 damage !" );
                                    }

                                    System.out.println(enemy.getType() + " has " + enemy.getHealth() + "/" + enemy.getmaxHealth() +  " Health Remaining");
                                }
                        }

                    }
                    //player defend
                    else if(input == 2)
                    {
                        System.out.println(player.getName() + " defends against the " + enemy.getType() + "!");
                        System.out.println(player.getName() + " is preparing to block the " + enemy.getType() + "'s next attack !");
                        player.setDefending(true);
                    }
                    //player heal
                    else if(input == 3)
                    {
                        System.out.println(player.getName() + " heals " + player.getFortitude() +" health");
                        player.heal(player.getFortitude());
                        System.out.println(player.getName() + " has " + player.getHealth() + "/" + player.getmaxHealth()+ " Health Remaining");
                    }
                    else{
                        System.out.println("Invalid Input");
                    }
                   
    }
            
}
