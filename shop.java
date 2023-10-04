import java.util.*;


public class shop {
    private ArrayList<Item> inventory;
    int act = 0;
    // Create a list of weapons for loot table
    

    public void enter(player player) 
    {
        player.lvUp(player.getLv()+1);
        if(player.getLv() == 3){inventory = lootTable.createLootTablelv3();}
        if(player.getLv() == 6){inventory = lootTable.createLootTablelv6();}
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        if (act == 0)
        {
            System.out.println("Tired from your journey, you seek refuge to rest for a bit. You spot a lit torch and the distance, and decide to go towards it");
            scanner.nextLine();
            System.out.println("As you head closer, you spot a cloaked figure with various items laid out on an ornate red tablecloth");
            scanner.nextLine();
            System.out.println("As you approach, he beckons to you 'come on over stranger, only the finest wares in my shop.'");
            scanner.nextLine();
            System.out.println("Perplexed, you give him a confused look, hand ready to pull out your weapon if necessary.");
            scanner.nextLine();
            System.out.println("He laughs, and says 'I wouldn't do that if I were you, I am but a humble merchant with valuable wares to trade with you.'");
            scanner.nextLine();
            System.out.println("Hesitantly, you examine each item, with a crudely drawn number attched next to it, likely displaying its price.");
            scanner.nextLine();
            System.out.println("You ease off, letting your hand fall from your hilt, and peruse what items you may need for your journey");
            scanner.nextLine();
            System.out.println("As you step into the merchant's humble shop, a warm, soothing light envelops you, instantly mending your wounds and revitalizing your weary body. +10 HP");
            player.heal(10);
            scanner.nextLine();

            act = 1;
        }
        else
        {
            System.out.println("As you near the journeys end, you here a familiar voice calling out to you.");
            scanner.nextLine();
            System.out.println("'Over ere' stranger!' The merchant waves at you, gesturing for you to come closer");
            scanner.nextLine();
            System.out.println("'Seems our business here will be ending soon one way or another'");
            scanner.nextLine();
            System.out.println("'Oh and don't ask how I got here, a merchant needs his secret' he laughts to himself");
            scanner.nextLine();
            System.out.println("'Anyways... feel free to take a last look around, I have a feeling you may need something here.");
            scanner.nextLine();
            System.out.println("As you step into the merchant's humble shop, a warm, soothing light envelops you, instantly mending your wounds and revitalizing your weary body. +10 HP");
            player.heal(10);
            scanner.nextLine();
        }

        while (true) 
        {
            System.out.println("What would you like to do?");
            System.out.println(player.getName()+" has " + player.getGold() + " gold coins");
            System.out.println("1. Buy an item");
            System.out.println("2. Leave the shop");

            int choice = scanner.nextInt();
            if (choice == 1)
            {
                System.out.println("'Whaddya Buyin', stranger?'");
                for (int i = 0; i < inventory.size(); i++) {
                    Item item = inventory.get(i);
                    System.out.println((i + 1) + ". " + item.getName() + " (" + item.getPrice() + " gold)");
                    System.out.println(item.getItemDesc()); 
                }
                System.out.println("");
                System.out.println("press "+ (inventory.size()+1) +" to exit");

                int itemChoice = scanner.nextInt() - 1;
                 
                if (itemChoice == inventory.size())
                {
                    System.out.println("");
                    continue;
                }
                else if (itemChoice < 0 || itemChoice >= inventory.size()) 
                {
                    System.out.println("");
                    System.out.println("Invalid choice");
                    System.out.println("");
                }
                else 
                {
                    Item item = inventory.get(itemChoice);
                    if (player.getGold() < item.getPrice()) 
                    {
                        System.out.println("");
                        System.out.println("'HAH, Trust me, owing me debt is not a good decision.'");
                        System.out.println("");
                    }
                    else 
                    {
                        System.out.println("");
                        player.subtractGold(item.getPrice());
                        System.out.println("You bought a " + item.getName() + " for " + item.getPrice() + " gold");
                        player.addItem(item);
                        System.out.println("");
                    }
                }
                
            } 
            else if (choice == 2)
            {
                System.out.println("'Come back again stranger!'");
                scanner.nextLine();
                if (player.getLv() == 6){
                FinalBoss.bossBattle(player);
                }
                else{
                break;
                }
            }
            else {
                System.out.println("Invalid choice");
            }
        }
    }
}
