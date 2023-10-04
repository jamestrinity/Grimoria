import java.util.*;
public class pathA
{
    public static void startStory(player player) 
    {
        
        boolean turn = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You continue down the dirt road.");
        scanner.nextLine();
        System.out.println("After some time, you come across a path leading towards what appears to be a castle.");
        scanner.nextLine();
        System.out.println("As you walk down the path, you hear rustling in the bushes.");
        scanner.nextLine();
        System.out.println("A golbin jumps out and attacks you!");
        scanner.nextLine();
        enemy golbin = new enemy("goblin", 50, 50, 8, 4, false, false, 0, 0, 0);
       
        while (golbin.getHealth() > 0 && player.getHealth() > 0) 
        {
            if (player.getHealth() <= 0){dead.playerDead();}
            while (turn == true)
            {
                playercombat.playerTurn(player, golbin);
                turn = false;
            }
            //golbin turn
            while (turn == false)
            {
                if (golbin.getBurnCounter() > 0)
                {
                    golbin.takeDamage(player.getMagic() / 4 );
                    System.out.println(golbin.getType() + "Takes " + (player.getMagic() / 4) + " damage from Burning");
                    golbin.setBurnCounter(golbin.getBurnCounter()-1);
                }
                if (golbin.getFrozenCounter() > 0)
                {
                    System.out.println(golbin.getType() + " is frozen solid from ice magic!");
                    golbin.setFrozenCounter(golbin.getFrozenCounter()-1);
                }
                else 
                {
                    if (golbin.getHealth() > 0)
                    {
                        System.out.println("");
                        golbin.enemyTurn(player);
                        System.out.println("");
                    }
                    else
                    {
                        break;
                    }
                }
                turn = true;     
            }
        }
        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("");
        shop shop = new shop();
        //after battle phase
        
        System.out.println("");
        System.out.println("With a mighty swing of your weapon, you strike down the goblin that stood in your path on the dusty dirt road.");
        scanner.nextLine();
        System.out.println("The creature lets out a final yelp before collapsing to the ground, its malevolent presence vanquished.");
        scanner.nextLine();
        System.out.println("The air is thick with the scent of battle and the sounds of nature gradually reclaiming the serenity of the road.");
        scanner.nextLine();
        System.out.println("Sunlight filters through the canopy above, casting a warm glow on the aftermath of the confrontation.");
        scanner.nextLine();
        System.out.println("The defeated goblin lies motionless, its twisted form a stark reminder of the dangers lurking in these lands.");
        scanner.nextLine();
        int gold = 0;
        gold = (int)(Math.random() * 10) + 5;
        afterbattle.afterBattle(player, gold);
        scanner.nextLine();
        System.out.println("The silence is broken by a gentle breeze that rustles the leaves of nearby trees, as if nature itself celebrates your triumph. +5 strength");
        player.increaseStrength(5);
        scanner.nextLine();
        System.out.println("The dirt road stretches ahead, beckoning you onward on your journey.");
        scanner.nextLine();
        System.out.println("With newfound determination, you resume your path, aware that more challenges and discoveries lie ahead.");
        scanner.nextLine();
        System.out.println("As you leave the fallen goblin behind, you carry with you the knowledge that you can overcome adversity and protect those who depend on your strength.");
        scanner.nextLine();
        System.out.println("The winding path eventually leads you to the towering gates of a long-forgotten castle.");
        scanner.nextLine();
        System.out.println("The heavy gates creak open, revealing a courtyard bathed in moonlight, its stone statues standing at attention.");
        scanner.nextLine();
        System.out.println("As you traverse the desolate courtyard, your senses heighten, attuned to the slightest movement or sound.");
        scanner.nextLine();
        System.out.println("Suddenly, a menacing figure materializes before you—a castle sentinel, clad in ancient armor and wielding a wickedly sharp sword.");
        scanner.nextLine();
        System.out.println("Its hollow eyes lock onto you with a soulless gaze, ready to defend the castle's forbidden depths.");
        scanner.nextLine();
        System.out.println("The sentinel charges, its sword gleaming in the pale moonlight.");
        scanner.nextLine();
        enemy sentinel = new enemy("castle sentinel", 75, 75, 20, 5, false, false, 0, 0, 0);
        while (sentinel.getHealth() > 0 && player.getHealth() > 0) 
        {
            if (player.getHealth() <= 0){dead.playerDead();}
            while (turn == true & sentinel.getHealth() > 0)
            {
                playercombat.playerTurn(player, sentinel);
                if (sentinel.getHealth() <= 37){System.out.println(""); System.out.println("With skillful strikes and swift dodges, you engage in a deadly dance, parrying its attacks and seeking weaknesses in its defenses.");}
                if (sentinel.getHealth() <= 10){System.out.println(""); System.out.println("The clash of metal reverberates through the courtyard as you strive to overcome this formidable guardian.");}
                turn = false;     
            }
            //enemy turn
            while (turn == false & sentinel.getHealth() > 0)
            {
                if (sentinel.getBurnCounter() > 0)
                {
                    sentinel.takeDamage(player.getMagic() / 4 );
                    System.out.println(sentinel.getType() + "Takes " + (player.getMagic() / 4) + "Damage from Burning");
                    sentinel.setBurnCounter(sentinel.getBurnCounter()-1);
                }
                if (sentinel.getFrozenCounter() > 0)
                {
                    System.out.println(sentinel.getType() + " is frozen solid from ice magic!");
                    sentinel.setFrozenCounter(sentinel.getFrozenCounter()-1);
                }
                else 
                {
                    if (sentinel.getHealth() > 0)
                    {
                        System.out.println("");
                        sentinel.enemyTurn(player);
                        System.out.println("");
                    }
                    else 
                    {
                        break;
                    }
                    
                }
                turn = true;     
            }
        }
        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("");
        System.out.println("With a final, resounding blow, your weapon strikes true, cleaving through the ancient armor of the castle sentinel.");
        scanner.nextLine();
        System.out.println("The once-mighty guardian staggers, its life force fading with each labored breath.");
        scanner.nextLine();
        System.out.println("In its dying moments, the sentinel's hollow eyes meet yours, a flicker of recognition passing through its gaze. +10 max health");
        player.increaseHealth(10);
        scanner.nextLine();
        System.out.println("As the sentinel collapses to the ground, defeated and lifeless, an eerie silence settles upon the chamber.");
        scanner.nextLine();
        System.out.println("The weight of the encounter lifts from your shoulders, replaced by a profound sense of accomplishment and relief.");
        scanner.nextLine();
        System.out.println("You stand amidst the remnants of the sentinel's ancient armor, a testament to your skill, determination, and unwavering spirit.");
        scanner.nextLine();
        gold = 0;
        gold = ((int)(Math.random() * 10) + 5) * 3;
        afterbattle.afterBattle(player, gold);
        System.out.println("The castle's corridors now lay open before you, beckoning you deeper into its mysterious depths.");
        scanner.nextLine();
        System.out.println("Step by cautious step, you venture forth, prepared to face the challenges and secrets that await within.");
        scanner.nextLine();
        shop.enter(player);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("As you navigate the winding corridors of the castle, your steps guided by a mixture of curiosity and trepidation, you come across a peculiar phenomenon.");
        scanner.nextLine();
        System.out.println("A faint, ethereal glow begins to illuminate the dimly lit passageway, drawing your attention like a moth to a flame.");
        scanner.nextLine();
        System.out.println("Intrigued by this mysterious light, you follow its radiant path, your heart quickening with anticipation.");
        scanner.nextLine();
        System.out.println("The glow intensifies with each step, leading you deeper into the labyrinthine castle, until you find yourself standing before a grand chamber bathed in a soft, pulsating light.");
        scanner.nextLine();
        System.out.println("The air within crackles with arcane energy, and the faint whisper of ancient incantations fills your ears.");
        scanner.nextLine();
        System.out.println("In the center of the chamber, a towering figure clad in dark armor awaits, its eyes burning with an otherworldly fire.");
        scanner.nextLine();
        System.out.println("You have stumbled upon a Soul Knight, a guardian of the castle's inner sanctum, whose power resonates through the very walls.");
        scanner.nextLine();
        System.out.println("Drawing upon your strength and resolve, you prepare to face this formidable foe, knowing that the outcome will shape your destiny.");
        scanner.nextLine();
        System.out.println("The Soul Knight brandishes its gleaming blade, ready to test your worthiness and determination.");
        scanner.nextLine();
        System.out.println("Heart pounding and adrenaline coursing through your veins, you engage in a battle of wills and skill, striving to emerge victorious.");
        scanner.nextLine();
        System.out.println("Defeat the Soul Knight, and you shall claim the right to uncover the secrets and treasures that lie within the castle's final chamber.");
        scanner.nextLine();
        System.out.println("Fail, and your soul shall be forever trapped within the castle's walls, a prisoner of the Soul Knight's dark magic.");
        enemy soulknight = new enemy("soul knight", 100, 100, 40, 10, false, false, 0, 0, 0);
        while (soulknight.getHealth() > 0 && player.getHealth() > 0) 
        {
            if (player.getHealth() <= 0){dead.playerDead();}
            while (turn == true & soulknight.getHealth() > 0)
            {
                playercombat.playerTurn(player, soulknight);
                if (soulknight.getHealth() <= 37){System.out.println(""); System.out.println("As your strikes land with precision, the Soul Knight's once-imposing figure begins to waver, its movements growing more labored.");}
                if (soulknight.getHealth() <= 10){System.out.println(""); System.out.println("With each passing moment, the flickering light within its eyes dims, revealing cracks in its invincible facade. Victory is within reach!");}
                turn = false;     
            }
            //enemy turn
            while (turn == false & soulknight.getHealth() > 0)
            {
                if (soulknight.getBurnCounter() > 0)
                {
                    soulknight.takeDamage(player.getMagic() / 4 );
                    System.out.println(soulknight.getType() + "Takes " + (player.getMagic() / 4) + "Damage from Burning");
                    soulknight.setBurnCounter(soulknight.getBurnCounter()-1);
                }
                if (soulknight.getFrozenCounter() > 0)
                {
                    System.out.println(soulknight.getType() + " is frozen solid from ice magic!");
                    soulknight.setFrozenCounter(soulknight.getFrozenCounter()-1);
                }
                else 
                {
                    if (soulknight.getHealth() > 0)
                    {
                        System.out.println("");
                        soulknight.enemyTurn(player);
                        System.out.println("");
                    }
                    else 
                    {
                        break;
                    }
                    
                }
                turn = true;     
            }
        }
        scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("With a final, devastating strike, you unleash your full strength upon the Soul Knight, shattering its armor and breaking its ethereal bond.");
        scanner.nextLine();
        System.out.println("The once-mighty warrior staggers, its dark aura dissipating, leaving only an echo of its former power.");
        scanner.nextLine();
        System.out.println("As the Soul Knight collapses to the ground, defeated and lifeless, a profound silence descends upon the chamber.");
        scanner.nextLine();
        gold = 0;
        gold = ((int)(Math.random() * 10) + 5) * 4;
        afterbattle.afterBattle(player, gold);
        System.out.println("The weight of your triumph fills the air, mingling with a sense of awe and accomplishment.");
        scanner.nextLine();
        System.out.println("You stand amidst the remnants of the fallen warrior, surrounded by the fading remnants of its arcane energy. +15 magic and +5 strength");
        player.increaseMagic(15); player.increaseStrength(5);
        scanner.nextLine();
        System.out.println("You look down through the castle's treacherous halls.");
        scanner.nextLine();
        System.out.println("As you catch your breath, you sense an ominous presence looming nearby, a lingering challenge that awaits your attention.");
        scanner.nextLine();
        System.out.println("As you continue your perilous journey through the castle's dark corridors, you find yourself in a grand hall adorned with ancient tapestries and imposing statues.");
        scanner.nextLine();
        System.out.println("The air is heavy with a foreboding sense of tension, as if the very walls hold their breath in anticipation of what's to come.");
        scanner.nextLine();
        System.out.println("Suddenly, a low rumble fills the chamber, drawing your gaze upward.");
        scanner.nextLine();
        System.out.println("Above you, a swirling portal materializes, crackling with arcane energy and pulsating with an otherworldly glow.");
        scanner.nextLine();
        System.out.println("Before you can react, two colossal figures clad in shimmering armor plummet from the portal, crashing down to the ground and shaking the very foundation of the room.");
        scanner.nextLine();
        System.out.println("These giant knights, their eyes glowing with an intense determination, land with thunderous impact, their weapons at the ready.");
        scanner.nextLine();
        System.out.println("Their gaze fixates upon you, their purpose clear: to test your strength and vanquish any who dare intrude upon their domain.");
        scanner.nextLine();
        System.out.println("Prepare yourself, for these towering adversaries will stop at nothing to protect the secrets of the castle and crush any who stand in their way.");
        scanner.nextLine();
        System.out.println("With your weapon in hand and your spirit aflame, you steel yourself for the epic clash that is about to unfold.");
        scanner.nextLine();
        enemy stormine = new enemy("Stormine", 180, 180, 30, 10, false, false, 0, 0, 0);
        enemy humgson = new enemy("Humgson", 180, 180, 30, 10, false, false, 0, 0, 0);
    
        ArrayList<enemy> knights = new ArrayList<>();
        knights.add(stormine);
        knights.add(humgson);

        turn = true;

        while (dead.areEnemiesAlive(knights) && player.getHealth() > 0) 
        {
            
            if (player.getHealth() <= 0){dead.playerDead();}
            while (turn == true)
            {
                System.out.println("Attack Stormine (1) or Humgson (2)?");
                int e = scanner.nextInt();
                if(e == 1 || e == 2)
                {
                    enemy guardian = knights.get(e - 1);
                    if (guardian.getHealth() > 0) {
                        playercombat.playerTurn(player, guardian);
                        turn = true;
                    }
                    else if (guardian.getHealth() <= 0) {
                        System.out.println(guardian.getType()+" is already dead!");
                    }    
                }
                else
                {
                    System.out.println("That is not a valid option!");
                }
                 turn = false;
            }
        
            //enemy turn
            while (turn == false) {
                for (int i = 0; i < knights.size(); i++) {
                    enemy enemy = knights.get(i);
                    if (enemy.getHealth() > 0) {
                        if (enemy.getBurnCounter() > 0) {
                            enemy.takeDamage(player.getMagic() / 4);
                            System.out.println(enemy.getType() + " takes " + (player.getMagic() / 4) + " damage from Burning");
                            enemy.setBurnCounter(enemy.getBurnCounter() - 1);
                        }
                        if (enemy.getFrozenCounter() > 0) {
                            System.out.println(enemy.getType() + " is frozen solid from ice magic!");
                            enemy.setFrozenCounter(enemy.getFrozenCounter() - 1);
                        } else {
                            if (enemy.getHealth() > 0)
                            {
                                System.out.println("");
                                enemy.enemyTurn(player);
                                System.out.println("");
                            }
                            else 
                            {
                                continue;
                            }
                        }
                    }
                }
                turn = true;
            }
        }
        scanner.nextLine();
        
        System.out.println("With sheer determination and unwavering skill, you bring Stormine and Humgson to their knees, their mighty forms trembling beneath the weight of your onslaught.");
        scanner.nextLine();
        System.out.println("Their synchronized movements falter, their once-unyielding defenses crumble, as you find the gaps in their armor and exploit their moments of weakness.");
        scanner.nextLine();
        System.out.println("As your final strike lands true, a thunderous roar fills the air, reverberating through the chamber, as if the very walls of the castle tremble in acknowledgment of your victory. +10 fortitude +20 health");
        player.increaseFortitude(10); player.increaseHealth(20);
        scanner.nextLine();
        System.out.println("The fallen knights lie motionless before you, their intimidating presence reduced to mere remnants of a bygone era.");
        scanner.nextLine();
        gold = 0;
        gold = ((int)(Math.random() * 10) + 5) * 4;
        afterbattle.afterBattle(player, gold);
        System.out.println("In the wake of your triumph, an eerie silence descends, broken only by the distant echoes of your own labored breaths.");
        scanner.nextLine();
        System.out.println("With Stormine and Humgson defeated, their legacy crumbles alongside their once-mighty bodies, leaving the path ahead clear, beckoning you deeper into the heart of the castle.");
        scanner.nextLine();
        System.out.println("Yet, the challenges that lie beyond are bound to test your mettle even further, demanding more from you as you inch closer to the secrets that the castle holds.");
        scanner.nextLine();
        shop.enter(player);
        System.out.println("");
        System.out.print("\033[H\033[2J");
        scanner.close();
    }
}
