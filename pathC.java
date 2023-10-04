import java.util.*;
public class pathC
{
    public static void startStory(player player) 
    {
        boolean turn = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You spot a nearby tree with branches low enough to climb");
        scanner.nextLine();
        System.out.println("You pull yourself up, searching for a foothold at the top of the tree to look around.");
        scanner.nextLine();
        System.out.println("You reach the top, and as you look in the distance and see a castle, a loud screech interrupts you.");
        scanner.nextLine();
        System.out.println("A harpy swoops down with claws as sharp as razors. You barely manage to duck in time before");
        scanner.nextLine();
        shop shop = new shop();
        enemy harpy = new enemy("Harpy", 25, 25, 7, 3, false, false, 0, 0, 0);
    	enemy dragon = new enemy("Wounded Dragon", 150, 42, 12, 3, false, false, 0, 0, 0);
	    enemy griffin = new enemy("Griffin", 65, 65, 15, 5, false, false, 0, 0, 0);
	
        while (harpy.getHealth() > 0 && player.getHealth() > 0) 
        {
            while (turn == true)
            {
                playercombat.playerTurn(player, harpy);
                turn = false;
            }
            //harpy turn
            while (turn == false)
            {
                if (harpy.getBurnCounter() > 0)
                {
                    harpy.takeDamage(player.getMagic() / 4 );
                    System.out.println(harpy.getType() + "Takes " + (player.getMagic() / 4) + "Damage from Burning");
                    harpy.setBurnCounter(harpy.getBurnCounter()-1);
                }
                if (harpy.getFrozenCounter() > 0)
                {
                    System.out.println(harpy.getType() + " is frozen solid from ice magic!");
                    harpy.setFrozenCounter(harpy.getFrozenCounter()-1);
                }
                else 
                {
                    System.out.println("");
                    harpy.enemyTurn(player);
                    System.out.println("");
                    
                }
                turn = true;     
            }
        }
        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("");
        int gold = 0;
        gold = ((int)(Math.random() * 10) + 5)*3;
        afterbattle.afterBattle(player, gold);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("");
        scanner.nextLine();
        System.out.println("You triumphantly walk through the forest surrounded by large trees till finally you see it, the castle!! +5 crit chance");
        player.increaseCrit(5);
        scanner.nextLine();
        System.out.println("However you notice something upon walking closer to the castle, the castle is in ruin.");
        scanner.nextLine();
        System.out.println("You cross the drawbridge that remains fallen as chipped walls and a destoryed gate greet you");
        scanner.nextLine();
        System.out.println("Charred courpses and blood stained walls greet you, however something is off the courpses are still hot and the blood still fresh");
        scanner.nextLine();
        System.out.println("You hear an ear pircing roar from behind you as you see a dragon covered in weapons and blood rear their head at you");
        scanner.nextLine();
        System.out.println("You duck just in time, narrowly dodging the huge dragon");
        scanner.nextLine();
        //Wounded Dragon Fight Fight
         while (dragon.getHealth() > 0 && player.getHealth() > 0) 
        {
            while (turn == true)
            {
                playercombat.playerTurn(player, dragon);
                turn = false;
            }
            //dragon turn
            while (turn == false)
            {
                if (dragon.getBurnCounter() > 0)
                {
                    dragon.takeDamage(player.getMagic() / 4 );
                    System.out.println(dragon.getType() + "Takes " + (player.getMagic() / 4) + "Damage from Burning");
                    dragon.setBurnCounter(dragon.getBurnCounter()-1);
                }
                if (dragon.getFrozenCounter() > 0)
                {
                    System.out.println(dragon.getType() + " is frozen solid from ice magic!");
                    dragon.setFrozenCounter(dragon.getFrozenCounter()-1);
                }
                else 
                {
                    System.out.println("");
                    dragon.enemyTurn(player);
                    System.out.println("");
                    
                }
                turn = true;     
            }
        }
        scanner.nextLine();
       	System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("");
        gold = 0;
        gold = ((int)(Math.random() * 10) + 5)*3;
        afterbattle.afterBattle(player, gold);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        scanner.nextLine();
        shop.enter(player);
        System.out.println("");
        System.out.println("You traverse further into the decrepit castle till you happen acrossa large balocony the size of a ballroom");
        scanner.nextLine();
        System.out.println("The floor is perfectly clean with no bodies anywhere near this area of the castle +15 agility");
        player.increaseAgility(15);
        scanner.nextLine();
        System.out.println("A powerful roar eminates from the sky, when you look up you see a griffin land right in front of you");
        scanner.nextLine();
        System.out.println("You lock eyes with the powerful beast when finally he charges you.");
        scanner.nextLine();
        //Griffin Fight
        while (griffin.getHealth() > 0 && player.getHealth() > 0) 
        {
            while (turn == true)
            {
                playercombat.playerTurn(player, griffin);
                turn = false;
            }
            //griffin turn
            while (turn == false)
            {
                if (griffin.getBurnCounter() > 0)
                {
                    griffin.takeDamage(player.getMagic() / 4 );
                    System.out.println(griffin.getType() + "Takes " + (player.getMagic() / 4) + "Damage from Burning");
                    griffin.setBurnCounter(griffin.getBurnCounter()-1);
                }
                if (griffin.getFrozenCounter() > 0)
                {
                    System.out.println(griffin.getType() + " is frozen solid from ice magic!");
                    griffin.setFrozenCounter(griffin.getFrozenCounter()-1);
                }
                else 
                {
                    System.out.println("");
                    griffin.enemyTurn(player);
                    System.out.println("");
                    
                }
                turn = true;     
            }
        }
        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("");
        System.out.println("With a final, mighty blow, your weapon strikes true, finding its mark on the griffin's vulnerable spot.");
        scanner.nextLine();
        System.out.println("The majestic creature lets out a final, piercing screech, its golden eyes dimming as life escapes its body.");
        scanner.nextLine();
        System.out.println("Feathers scatter through the air, carried by a gentle breeze, as the griffin collapses to the ground, defeated.");
        scanner.nextLine();
        gold = 0;
        gold = ((int)(Math.random() * 10) + 5)*3;
        afterbattle.afterBattle(player, gold);
        scanner.nextLine();
        System.out.println("A mix of exhaustion and exhilaration fills the air, as the echoes of the intense battle slowly fade away.");
        scanner.nextLine();
        System.out.println("You stand amidst the aftermath of the grueling fight, your heart pounding with a sense of triumph. + 20 max health");
        player.increaseHealth(20);
        scanner.nextLine();
        System.out.println("The memory of this epic encounter will forever be etched in your mind, a testament to your bravery and skill.");
        System.out.println("As the lifeless body of the griffin lies before you, the winds carry a chilling presence, stirring the air around you.");
        scanner.nextLine();
        System.out.println("A shiver runs down your spine as an ominous figure steps out from the shadows, its form towering and imposing.");
        scanner.nextLine();
        System.out.println("The griffin's defeat was merely a prelude to the true challenge that awaits you within the depths of the castle.");
        scanner.nextLine();
        System.out.println("With a deep breath, you brace yourself for the upcoming clash, fully aware that the mini boss will test your mettle like never before.");
        scanner.nextLine();
        System.out.println("The echoes of the griffin's final cry fade into the distance, replaced by an unsettling silence, fueling your determination.");
        scanner.nextLine();
        System.out.println("You step forward, adrenaline coursing through your veins, ready to face this new formidable opponent and prove your worth once more.");
        scanner.nextLine();
        System.out.println("As you approach the towering figure known as the Blighted Sentinel, a palpable tension fills the air, crackling with anticipation.");
        scanner.nextLine();
        System.out.println("Its massive form looms before you, emanating an aura of dark energy and malevolence, ready to test your skills and resolve.");
        scanner.nextLine();
        System.out.println("The clash of steel echoes through the chamber as you engage in a fierce battle with the Blighted Sentinel, a creature born from darkness itself.");
        scanner.nextLine();
        enemy blightedsentinel = new enemy("Blighted Sentinel",  165, 165, 51, 5, false, false, 0, 0, 0);
        
        while (blightedsentinel.getHealth() > 0 && player.getHealth() > 0) 
        {
            while (turn == true)
            {
                playercombat.playerTurn(player, blightedsentinel);
                turn = false;
            }
            //blightedsentinel turn
            while (turn == false)
            {
                if (blightedsentinel.getBurnCounter() > 0)
                {
                    blightedsentinel.takeDamage(player.getMagic() / 4 );
                    System.out.println(blightedsentinel.getType() + "Takes " + (player.getMagic() / 4) + "Damage from Burning");
                    blightedsentinel.setBurnCounter(blightedsentinel.getBurnCounter()-1);
                }
                if (blightedsentinel.getFrozenCounter() > 0)
                {
                    System.out.println(blightedsentinel.getType() + " is frozen solid from ice magic!");
                    blightedsentinel.setFrozenCounter(blightedsentinel.getFrozenCounter()-1);
                }
                else 
                {
                    System.out.println("");
                    blightedsentinel.enemyTurn(player);
                    System.out.println("");
                    
                }
                turn = true;     
            }
        }
        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("With one final strike, your weapon finds its mark, piercing through the heart of the blighted sentinel.");
        scanner.nextLine();
        System.out.println("A deafening roar of agony fills the air as the blighted sentinel collapses to the ground, its once formidable presence reduced to mere dust and remnants of its former glory.");
        scanner.nextLine();
        System.out.println("A profound sense of satisfaction washes over you, knowing that you have overcome this mighty adversary. +20 strength");
        player.increaseStrength(20);
        scanner.nextLine();
        System.out.println("The room is filled with a hushed silence, broken only by your steady breaths as you take a moment to catch your breath.");
        scanner.nextLine();
        gold = 0;
        gold = ((int)(Math.random() * 10) + 5)*3;
        afterbattle.afterBattle(player, gold);
        System.out.println("With this victory, you stand as a beacon of hope amidst the shadows that loom within the castle walls.");
        scanner.nextLine();
        System.out.println("But the journey is far from over, and greater challenges await you as you continue your quest.");
        scanner.nextLine();
        System.out.println("With renewed confidence, you press on, ready to face whatever lies ahead with unwavering resolve.");
        scanner.nextLine();
        shop.enter(player);
    }
}