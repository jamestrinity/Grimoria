import java.util.*;
public class pathB
{
    public static void startStory(player player) 
    {
        boolean turn = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("The whispers coming from the dark forest intrigue you.");
        scanner.nextLine();
        System.out.println("Whether brave, or arrogant, you traverse deeper into the forest.");
        scanner.nextLine();
        System.out.println("The darkness swallows you a whole, with voices growing louder, until you can no longer see anything, and the voices cut to silence.");
        scanner.nextLine();
        System.out.println("You ready your weapon, and before you know it, a bright light flashes out of nowhere!");
        scanner.nextLine();
        System.out.println("You look towards the flash of light, and are greeted by a tormented spirit. The trees seem to have trapped you withtin its domain, and your only escape is to fight.");
        scanner.nextLine();
        enemy tormentedSpirit = new enemy("Tormented Spirit", 50, 50, 10, 3, false, false, 0, 0, 0);

        while (tormentedSpirit.getHealth() > 0 && player.getHealth() > 0) 
        {
            if (player.getHealth() <= 0){dead.playerDead();}
            while (turn == true & tormentedSpirit.getHealth() > 0)
            {
                playercombat.playerTurn(player, tormentedSpirit);
                turn = false;     
            }
            //torementedSpirit turn
            while (turn == false & tormentedSpirit.getHealth() > 0)
            {
                if (tormentedSpirit.getBurnCounter() > 0)
                {
                    tormentedSpirit.takeDamage(player.getMagic() / 4 );
                    System.out.println(tormentedSpirit.getType() + "Takes " + (player.getMagic() / 4) + "Damage from Burning");
                    tormentedSpirit.setBurnCounter(tormentedSpirit.getBurnCounter()-1);
                }
                if (tormentedSpirit.getFrozenCounter() > 0)
                {
                    System.out.println(tormentedSpirit.getType() + " is frozen solid from ice magic!");
                    tormentedSpirit.setFrozenCounter(tormentedSpirit.getFrozenCounter()-1);
                }
                else 
                {
                    if (tormentedSpirit.getHealth() > 0)
                    {
                        System.out.println("");
                        tormentedSpirit.enemyTurn(player);
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
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("");
        shop shop = new shop();
        //after battle phase
        System.out.println(player.getName() +" has defeated the "+ tormentedSpirit.getType() +" !");
        int gold = 0;
        gold = ((int)(Math.random() * 10) + 5)*2;
        afterbattle.afterBattle(player, gold);

        System.out.println("After defeating the tormented spirit, a sudden calm settles over the forest.");
        scanner.nextLine();
        System.out.println("The once hostile trees seem to sway gently in the breeze, and the oppressive darkness gives way to a soft, dappled light.");
        scanner.nextLine();
        System.out.println("As you catch your breath and try to collect your thoughts, a faint, soothing melody drifts through the air. +5 fortitude");
        player.increaseFortitude(5);
        scanner.nextLine();
        System.out.println("Intrigued, you follow the enchanting music, and soon discover a hidden grove.");
        scanner.nextLine();
        System.out.println("As you venture further in, a haunting melody fills the air.");
        scanner.nextLine();
        System.out.println("The Mistingers reveal themselves, graceful and enigmatic beings with luminous, translucent wings that glisten in the soft glow.");
        scanner.nextLine();
        System.out.println("The Mistingers, with their alluring voices, begin to sing in unison, their harmonies weaving a mesmerizing spell.");
        scanner.nextLine();
        System.out.println("As the melody intensifies, the mist thickens, distorting your perception of the environment.");
        scanner.nextLine();
        System.out.println("Illusions start to manifest, creating phantom images that begin to charge towards you.");
        scanner.nextLine();

        System.out.println("");
        enemy mistinger1 = new enemy("mistinger 1", 40, 40, 10, 1, false, false, 0, 0, 0);
        enemy mistinger2 = new enemy("mistinger 2", 40, 40, 10, 1, false, false, 0, 0, 0);
        enemy mistinger3 = new enemy("mistinger 3", 40, 40, 10, 1, false, false, 0, 0, 0);
        ArrayList<enemy> swarm = new ArrayList<>();
        swarm.add(mistinger1);
        swarm.add(mistinger2);
        swarm.add(mistinger3);
        turn = true;

        while (dead.areEnemiesAlive(swarm) && player.getHealth() > 0) 
        {
            if (player.getHealth() <= 0){dead.playerDead();}
            while (turn == true)
            {
                System.out.println("Attack mistinger 1 2 or 3?");
                int e = scanner.nextInt();
                if(e == 1 || e == 2 || e == 3)
                {
                    enemy mistingers = swarm.get(e - 1);
                    if (mistingers.getHealth() > 0) {
                        playercombat.playerTurn(player, mistingers);
                        turn = true;
                    }
                    else if (mistingers.getHealth() <= 0) {
                        System.out.println("That mistinger is already dead!");
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
                for (int i = 0; i < swarm.size(); i++) {
                    enemy enemy = swarm.get(i);
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
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("As the final Miststinger falls to the ground, silence descends upon the clearing."); 
        scanner.nextLine();
        System.out.println("The once chaotic and eerie atmosphere gives way to a tranquil calm.");
        scanner.nextLine();
        System.out.println("The mist that shrouded the area begins to dissipate, revealing the beauty of the surrounding landscape in its wake.");
        scanner.nextLine();
        System.out.println("Sunlight filters through the trees, casting a warm glow upon the victorious scene.");
        scanner.nextLine();
        System.out.println("The air, once thick with the unsettling hum of the Miststingers' wings, now carries the gentle whispers of a forest restored.");
        scanner.nextLine();
        System.out.println("The remaining mist retreats, revealing the hidden wonders of this magical realm.");
        scanner.nextLine();
        System.out.println("Fragrant blossoms bloom, their vibrant colors painting the forest floor, while the soft melody of birdsong fills the air. +10 agility");
        player.increaseAgility(10);
        scanner.nextLine();
        System.out.println("You take a moment to catch your breath, the adrenaline coursing through your veins gradually subsiding.");
        scanner.nextLine();
        System.out.println("As you gaze upon the defeated Miststingers, you reflect on the resilience and bravery that led you to this triumph.");
        scanner.nextLine();
        System.out.println("Your victory has not only vanquished the threat posed by these elusive creatures, but it has also restored peace and balance to this corner of the enchanted forest.");    
        scanner.nextLine();  
        gold = 0;
        gold = ((int)(Math.random() * 10) + 5)*2;
        afterbattle.afterBattle(player, gold);
        shop.enter(player);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("As you delve deeper into the mystical grove, the air grows thick with ancient magic, and the towering trees cast elongated shadows across the forest floor.");
        scanner.nextLine();  
        System.out.println("Suddenly, the ground beneath you rumbles, and the trees shudder as if awakened from a long slumber."); 
        scanner.nextLine();  
        System.out.println("Emerging from the foliage, you behold the awe-inspiring sight of the Grove Guardians.");
        scanner.nextLine();  
        System.out.println("These colossal tree-like beings stand tall, their bodies adorned with intricate carvings that seem to come alive with a pulsating glow.");
        scanner.nextLine();  
        System.out.println("The Guardians' eyes gleam with a mixture of wisdom and determination as they step forward, their heavy footsteps echoing through the grove."); 
        scanner.nextLine();  
        System.out.println("Roots burst from the earth, intertwining with their limbs, granting them an unyielding strength."); 
        scanner.nextLine();  
        System.out.println("As you prepare for battle, you feel the weight of their ancient knowledge and the power they command over the forces of nature.");
        scanner.nextLine();  
        System.out.println("Their deep, resonating voices resonate through the grove, warning you to turn back.");
        scanner.nextLine();  
        System.out.println("But your resolve remains unshaken. You stand firm, ready to face these majestic yet formidable defenders of the forest.");
        scanner.nextLine();  
        System.out.println("You draw your weapon and meet their gaze, the grove becomes an arena for the clash between your determination and their guardianship.");
        scanner.nextLine();  
        System.out.println("As you prepare to challenge the ancient protectors and prove your worth amidst the towering presence of the Grove Guardians.");
        scanner.nextLine();
        enemy guardian1 = new enemy("forest guardian 1", 80, 80, 15, 10, false, false, 0, 0, 0);
        enemy guardian2 = new enemy("forest guardian 2", 80, 80, 15, 10, false, false, 0, 0, 0);
    
        ArrayList<enemy> guardians = new ArrayList<>();
        guardians.add(guardian1);
        guardians.add(guardian2);

        turn = true;

        while (dead.areEnemiesAlive(guardians) && player.getHealth() > 0) 
        {
            if (player.getHealth() <= 0){dead.playerDead();}
            while (turn == true)
            {
                System.out.println("Attack grove guardian 1 or 2?");
                int e = scanner.nextInt();
                if(e == 1 || e == 2)
                {
                    enemy guardian = guardians.get(e - 1);
                    if (guardian.getHealth() > 0) {
                        playercombat.playerTurn(player, guardian);
                        turn = true;
                    }
                    else if (guardian.getHealth() <= 0) {
                        System.out.println("That grove guardian is already dead!");
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
                for (int i = 0; i < guardians.size(); i++) {
                    enemy enemy = guardians.get(i);
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
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("As the last Grove Guardian crumbles to the ground, a profound stillness fills the air."); 
        scanner.nextLine();  
        System.out.println("The forest, once resonating with the power and presence of the ancient protectors, falls into a hushed reverence."); 
        scanner.nextLine();  
        System.out.println("The towering trees stand as silent witnesses to your hard-fought victory, their branches swaying gently in a grateful breeze.");
        scanner.nextLine();  
        System.out.println("The grove itself seems to exhale a collective sigh of relief, its mystical energy pulsating with newfound freedom."); 
        scanner.nextLine();  
        System.out.println("The ground beneath your feet feels solid yet alive, as if the very essence of nature acknowledges and celebrates your triumph.");
        scanner.nextLine();   
        System.out.println("Rays of sunlight pierce through the canopy, casting ethereal beams of light upon the fallen Guardians.");
        scanner.nextLine();  
        System.out.println("In the wake of the battle, the grove reveals hidden treasures previously concealed by the Guardians' watchful gaze.");
        scanner.nextLine();  
        gold = 0;
        gold = ((int)(Math.random() * 10) + 5)*3;
        afterbattle.afterBattle(player, gold);
        
        System.out.println("The grove whispers its gratitude, its secrets unfolding before you.");
        scanner.nextLine();  
        System.out.println("The ancient magic of the forest intertwines with your own essence, empowering you to overcome even greater trials that lie ahead. +15 magic.");
        player.increaseMagic(15);
        scanner.nextLine();  
        System.out.println("Fragrant flowers bloom in vibrant hues, their delicate petals untouched by the conflict.");
        scanner.nextLine();  
        System.out.println("Ancient runes etched into the trees' bark emanate a soft, iridescent glow, as if acknowledging the passing of an era and the dawning of a new chapter.");
        scanner.nextLine();  
        System.out.println("You take a moment to catch your breath, your heart still pounding from the intensity of the encounter."); 
        scanner.nextLine();  
        System.out.println("As you gaze upon the fallen Guardians, a bittersweet realization dawns upon you."); 
        scanner.nextLine();  
        System.out.println("Though they were formidable foes, their presence represented a delicate balance between protection and guardianship."); 
        scanner.nextLine();  
        System.out.println("Now, as their legacy comes to an end, it is up to you to carry the mantle of stewardship over this magical grove.");
        scanner.nextLine();  
        System.out.println("In the distance, beyond the grove's borders, the silhouette of a castle beckons—an enigmatic destination shrouded in mystery.");
        scanner.nextLine();  
        System.out.println("With the forest rejuvenated and the path forward revealed, you forge ahead, ready to face the next challenges that await you."); 
        scanner.nextLine();  
        System.out.println("You step forward, ready to unravel the secrets and confront the perils of the enchanted forest and its hidden castle.");
        scanner.nextLine();  
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("As you approach the outskirts of the castle, your eyes catch sight of a hidden entrance—a cracked and weathered sewer grate partially obscured by overgrown vegetation."); 
        scanner.nextLine();  
        System.out.println("Intrigued by the prospect of an alternative route, you pry open the heavy metal covering and descend into the dimly lit depths of the sewer.");
        scanner.nextLine();  
        System.out.println("The air grows thick and musty as you navigate the narrow passageways, the sound of dripping water echoing in the distance."); 
        scanner.nextLine();  
        System.out.println("Flickering torches cast eerie shadows upon the grimy walls, revealing the remnants of a forgotten realm.");
        scanner.nextLine();  
        System.out.println("As you venture deeper into the labyrinthine maze, the sense of foreboding intensifies, as if something sinister lurks within these underground tunnels.");
        scanner.nextLine();  
        System.out.println("Suddenly, a symphony of scampering feet sound out the sewer."); 
        scanner.nextLine();  
        System.out.println("Shadows flit across the walls, and the unmistakable scent of rodents permeates the air."); 
        scanner.nextLine();  
        System.out.println("You brace yourself for what lies ahead, preparing to face an infestation of rats that have claimed this dark domain as their own.");
        scanner.nextLine();  
        System.out.println("As you round a corner, your eyes widen in disbelief—a massive figure looms before you, its form a grotesque amalgamation of rats entangled and fused together—a creature known as the Rat King."); 
        scanner.nextLine();  
        System.out.println("The sight is both repulsive and awe-inspiring, as hundreds of beady eyes fixate upon you with an unsettling hunger.");
        scanner.nextLine();  
        System.out.println("With a hideous screech that reverberates through the tunnels, the Rat King lunges forward, its monstrous form propelled by a swarm of wriggling bodies."); 
        scanner.nextLine();  
        System.out.println("Its mangled claws and gnashing teeth pose a formidable threat, promising to defend its territory against intruders with relentless ferocity.");
        scanner.nextLine();  
        System.out.println("You steel your nerves and grip your weapon tightly, knowing that victory lies in overcoming this abomination.");
        scanner.nextLine();  
        enemy ratking = new enemy("Rat King", 200, 200, 35, 20, false, false, 0, 0, 0);

        while (ratking.getHealth() > 0 && player.getHealth() > 0) 
        {
            if (player.getHealth() <= 0){dead.playerDead();}
            while (turn == true & ratking.getHealth() > 0)
            {
                playercombat.playerTurn(player, ratking);
                if (ratking.getHealth() <= 100){System.out.println(""); System.out.println("With each defeated rat and every strike against the Rat King, the swarm begins to falter. Panic takes hold within their collective consciousness, causing disarray and discord among their ranks.");}
                if (ratking.getHealth() <= 50){System.out.println(""); System.out.println("The Rat King's movements become sluggish and uncoordinated, its strength waning with each passing moment.");}
                if (ratking.getHealth() <= 25){System.out.println(""); System.out.println("The Rat King, once a fearsome force, now stands alone, its strength waning as the tide of battle turns against it.");}
                turn = false;     
            }
            //enemy turn
            while (turn == false & ratking.getHealth() > 0)
            {
                if (ratking.getBurnCounter() > 0)
                {
                    ratking.takeDamage(player.getMagic() / 4 );
                    System.out.println(ratking.getType() + "Takes " + (player.getMagic() / 4) + "Damage from Burning");
                    ratking.setBurnCounter(ratking.getBurnCounter()-1);
                }
                if (ratking.getFrozenCounter() > 0)
                {
                    System.out.println(ratking.getType() + " is frozen solid from ice magic!");
                    ratking.setFrozenCounter(ratking.getFrozenCounter()-1);
                }
                else 
                {
                    if (ratking.getHealth() > 0)
                    {
                        System.out.println("");
                        ratking.enemyTurn(player);
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
        System.out.println("As the Rat King emits a final, desperate screech, its monstrous form crumbles to the ground, the rats scamper away dispersing into the darkness.");
        scanner.nextLine(); 
        System.out.println("The sewer falls into a hushed silence, the stench of rats slowly dissipating.");
        scanner.nextLine(); 
        System.out.println("You catch your breath, the echoes of the encounter still ringing in your ears.");
        scanner.nextLine(); 
        System.out.println("Victorious, you continue your journey through the sewer, confident that the Rat King's defeat has opened a path forward.");
        scanner.nextLine(); 
        System.out.println("The dark tunnels lead you deeper, guiding you towards the castle's heart, where greater challenges and untold secrets await."); 
        scanner.nextLine(); 
        System.out.println("With determination in your heart, you press on, ready to face the ultimate trial that lies ahead.");
        gold = 0;
        gold = ((int)(Math.random() * 10) + 5)*5;
        afterbattle.afterBattle(player, gold);
        shop.enter(player);
        scanner.close();
    }
}