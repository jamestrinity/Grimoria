import java.util.Random;
import java.util.Scanner;

public class FinalBoss{

    public static void bossBattle(player player) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean dialouge = true;
        boolean turn = true;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("As you delve deeper into the castle, your footsteps reverberate through the dimly lit corridors."); 
        scanner.nextLine();
        System.out.println("The air grows heavy with anticipation, and a sense of gravity settles upon your shoulders.");
        scanner.nextLine();
        System.out.println("The castle's ancient walls seem to whisper secrets of forgotten kings and lost battles as you navigate the labyrinthine passages.");
        scanner.nextLine();
        System.out.println("With each turn, you find yourself drawn closer to the heart of the castle, a place where the echoes of power resonate."); 
        scanner.nextLine();
        System.out.println("The scent of aged stone and candle wax fills the air, mingling with an unmistakable aura of malevolence.");
        scanner.nextLine(); 
        System.out.println("You steel your resolve, knowing that within these walls lies the final challenge you must face.");
        scanner.nextLine();
        System.out.println("As you explore the twisting hallways, your intuition leads you to a chamber unlike any other.");
        scanner.nextLine(); 
        System.out.println("The door before you looms tall and imposing, adorned with intricate carvings and sigils that seem to pulse with an otherworldly energy.");
        scanner.nextLine(); 
        System.out.println("The air crackles with anticipation, and a palpable sense of destiny fills the room.");
        scanner.nextLine();
        System.out.println("You reach out to grasp the door's handle, its cold touch sending a shiver down your spine.");
        scanner.nextLine(); 
        System.out.println("With a deep breath, you push open the door, revealing a room of grandeur and dread."); 
        scanner.nextLine();
        System.out.println("The chamber is vast, its high ceilings obscured by swirling mist and ethereal shadows that dance with malevolence.");
        scanner.nextLine();
        System.out.println("As the door creaks closed behind you, you feel a surge of determination."); 
        scanner.nextLine();
        System.out.println("This is the culmination of your journey, the ultimate clash between light and shadow, where legends are made and destinies are forged.");
        scanner.nextLine();
        System.out.println("With your heart pounding and your weapon at the ready, you step forward to meet your destiny head-on.");
        scanner.nextLine();
        System.out.println("The room is charged with a tense silence, broken only by the sound of your footsteps echoing across the chamber.");
        scanner.nextLine();
        System.out.print("\033[H\033[2J");
		System.out.flush();

        // Create final boss
        String[] bossNames = {"Shadow Queen Amara", "Emperor Kael'Thar", "Void Guardian Xalathor", "High Priestess Nephara", "Archmage Zarek", "Dark Overlord Malakar", "Celestial Guardian Seraphim", "Necromancer-King Zoltar", "Demon Hunter Astrid", "Chaos Lord Azazel"};
        int bossHealth = 750;
        int bossAttack = 75;
        int bossDefense = 30;
        String bossDesc = "";
        String bossName = bossNames[random.nextInt(bossNames.length)];
        if (bossName == "Shadow Queen Amara")
        {
            bossDesc = " A powerful sorceress who has been corrupted by the darkness that seeks to claim the Heart of Light for her own purposes.";
        }
        else if (bossName == "Emperor Kael'Thar")
        {
            bossDesc = " A ruthless conqueror who seeks to wield the power of the Heart of Light to expand his empire and crush all who oppose him";
        }
        else if (bossName == "Void Guardian Xalathor")
        {
            bossDesc = " A demonic entity from the depths of the Void, who seeks to use the Heart of Light to bring about the end of all things.";
        }
        else if (bossName == "High Priestess Nephara")
        {
            bossDesc = " The leader of a fanatical cult that worships the power of the Heart of Light, and seeks to use it to usher in a new era of divine rule.";
        }
        else if (bossName == "Archmage Zarek")
        {
            bossDesc = " A brilliant wizard who believes that he alone is worthy of wielding the power of the Heart of Light, and will stop at nothing to claim it for himself.";
        }
        else if (bossName == "Dark Overlord Malakar")
        {
            bossDesc = " A powerful demon lord who seeks to use the Heart of Light to break free of his prison and wreak havoc upon the mortal realm.";
        }
        else if (bossName == "Celestial Guardian Seraphim")
        {
            bossDesc = " An angelic being charged with protecting the Heart of Light, who will only allow the purest of heart to claim its power.";
        }
        else if (bossName == "Necromancer-King Zoltar")
        {
            bossDesc = " A master of dark magic and the undead, who seeks to use the power of the Heart of Light to raise an army of unstoppable zombies";
        }
        else if (bossName == "Demon Hunter Astrid")
        {
            bossDesc = " A fierce warrior who has dedicated her life to hunting down demons and other dark creatures, and who sees the Heart of Light as the ultimate weapon in her crusade.";
        }
        else if (bossName == "Chaos Lord Azazel")
        {
            bossDesc = " A mysterious figure who seeks to use the Heart of Light to unleash untold chaos and destruction upon the world, and who may not be entirely human.";
        }
        
        enemy boss = new enemy(bossName, bossHealth, bossHealth, bossAttack, bossDefense, false, false, 0, 0, 0);

        scanner.nextLine();
        System.out.print("\033[H\033[2J");
		System.out.flush();

        System.out.println("As you step further into the chamber, the faint glow at the end of the room grows brighter.");
        scanner.nextLine();
        System.out.println("Suddenly, with a deafening roar, the light expands, illuminating the entire chamber.");
        scanner.nextLine();
        System.out.println("The throne at the far end is now bathed in a blinding white light, and you can just make out the form of ");
        scanner.nextLine();
        System.out.println(bossName+bossDesc);
        scanner.nextLine();
        System.out.println(bossName + " rises towering over you, their form wreathed in shadow and smoke.");
        scanner.nextLine();
        System.out.println("As you steel yourself for the coming battle, you can feel the raw power emanating from " + bossName);
        scanner.nextLine();
        System.out.println("This is no mere enemy - it is a force of nature, a being of immense power and malevolent intent. You draw your weapon and take up a defensive stance, ready to face the final boss and emerge victorious, or die trying");
        scanner.nextLine();
        System.out.print("\033[H\033[2J");
		System.out.flush();

        // Battle loop
        while (player.getHealth() > 0 && boss.getHealth() > 0) 
        {
            while (turn == true)
            {
                playercombat.playerTurn(player, boss);
                turn = false;
            }
            //boss turn
            while (turn == false)
            {
                if (boss.getBurnCounter() > 0)
                {
                    boss.takeDamage(player.getMagic() / 4 );
                    System.out.println(boss.getType() + "Takes " + (player.getMagic() / 4) + "Damage from Burning");
                    boss.setBurnCounter(boss.getBurnCounter()-1);
                }
                if (boss.getFrozenCounter() > 0)
                {
                    System.out.println(boss.getType() + " is frozen solid from ice magic!");
                    boss.setFrozenCounter(boss.getFrozenCounter()-1);
                }
                else 
                {
                    System.out.println("");
                    boss.enemyTurn(player);
                    System.out.println("");
                    
                }
                turn = true;     
            }
        }
        
        // End of battle
        if (player.getHealth() == 0) 
        {
            dead.playerDead();
        } 
        else if (boss.getHealth() == 0)
        {
            System.out.println("As the final blow lands, the final boss lets out a piercing scream before collapsing to the ground, defeated."); 
            System.out.flush();
            System.out.println("You survey the chamber, taking in the shattered remnants of the battle, the twisted metal and shattered stone testament to the struggle that has just taken place."); 
            System.out.flush();
            System.out.println("Then, your eyes alight on the prize - the Heart of Light, pulsing with an ethereal glow in the center of the room."); 
            System.out.flush();
            System.out.println("You move towards it, feeling a sense of awe at its power.");
            System.out.flush();
            System.out.println("As you reach out to claim the Heart of Light, a sense of foreboding washes over you."); 
            System.out.flush();
            System.out.println("This artifact holds immense power, and with great power comes great responsibility."); 
            System.out.println("Will you take it and wield its might, or will you leave it be and let fate decide its fate?");
            System.out.println("");
            System.out.println("");
            System.out.println("1. Take the Heart of Light");
            System.out.println("2. Leave the Heart of Light behind");
            int choice = scanner.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            while(dialouge == true){
                if (choice == 1)
                {
                    System.out.println("You take hold of the Heart of Light, feeling its power course through your veins.");
                    scanner.nextLine();
                    System.out.println("As you clasp it tightly, you feel a sense of responsibility to use it for good.");
                    scanner.nextLine();
                    System.out.println("With this artifact in your possession, you know that you have the power to shape the world as you see fit.");
                    scanner.nextLine();
                    System.out.println("You leave the chamber, feeling a renewed sense of purpose and a determination to use the Heart of Light's power to make the world a better place.");                
                    dialouge = false;
                    
                }
                else if (choice == 2)
                {
                    System.out.println("You hesitate for a moment before turning away from the Heart of Light."); 
                    scanner.nextLine();
                    System.out.println("It may hold great power, but it also holds great danger."); 
                    scanner.nextLine();
                    System.out.println("You decide that it is better left untouched, and that fate will decide the future of Grimmoria.");
                    scanner.nextLine();
                    System.out.println("As you leave the chamber, you feel a sense of relief wash over you. You know that with great power comes great responsibility, and you are content to leave the Heart of Light's power to someone else.");
                    dialouge = false;
                }
                else
                {
                    System.out.println("Invalid input try again");
                }
                System.out.print("\033[H\033[2J");
		        System.out.flush();
                System.out.println("THE END! Thank you for playing!");
                System.out.println("Created by James Lee, Seven Aguirre, and Thomas Hoggatt");
            }
        }
        scanner.nextLine();
        scanner.close();
    }

}
