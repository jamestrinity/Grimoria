import java.util.*;
public class afterbattle 
{
    public static void afterBattle(player player, int gold)
    {
        int choice = 0;
        
        player.lvUp(player.getLv()+1);
        Scanner scanner = new Scanner(System.in);
            Item randomWeapon = null;
            if (player.getLv() == 1){randomWeapon = lootTable.getRandomWeapon_lv1();}
            else if (player.getLv() == 2){randomWeapon = lootTable.getRandomWeapon_lv2();}
            else if (player.getLv() == 3){randomWeapon = lootTable.getRandomWeapon_lv3();}
            else if (player.getLv() == 4){randomWeapon = lootTable.getRandomWeapon_lv4();}
            else if (player.getLv() == 5){randomWeapon = lootTable.getRandomWeapon_lv5();}
            System.out.println(player.getName() + " found  " + gold + " gold coin(s) and a " +  randomWeapon.getName());
            System.out.println(randomWeapon.getItemDesc());
            scanner.nextLine();
            player.addGold(gold);
            System.out.println(player.getName() + " now has " + player.getGold() + " gold coin(s) " );
            while(true){
                System.out.println("would you like to equip "+  randomWeapon.getName());
                if (player.getItem() != null){System.out.println("You currently have " + player.getItem().getName() + " equipped");}
                else{System.out.println("You currently have nothing equipped");}
                System.out.println("1.Yes");
                System.out.println("2.No");
                choice = scanner.nextInt();
                if(choice == 1)
                {
                    player.addItem(randomWeapon);
                    System.out.println("You equip the " + randomWeapon.getName());
                    break;
                    
                }
                else if(choice == 2)
                {
                    System.out.println("You decide to leave the "+ randomWeapon.getName() + " on the ground.");
                    break;
                }
                else
                {
                    System.out.println("Invalid choice");
                    choice = 0;
                }
            }
            System.out.println("");
    }
        

}
