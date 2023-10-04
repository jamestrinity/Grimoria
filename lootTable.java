import java.util.*;
public class lootTable
{

//color codes
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";
    
    
    
//level 1 loot
    public static ArrayList<Item> createLootTablelv1() 
    {
        ArrayList<Item> lootTable = new ArrayList<>();

        lootTable.add(new Item("Rusty Sword", 7, "A well worn blade that has already served its purpose, but may still be of use to you, +6 strength +1 agility", 6, 0, 1, 0, 0, 0, 0));
        lootTable.add(new Item("Dull Iron Dagger", 8, "A dull short blade, quick but lacking in penetration power that gives +3 strength and +5 agility", 4, 0,6, 0, 0, 0, 0));
        lootTable.add(new Item("Decrepit Bow", 8, "A bow with visible rot and cracks, versatile though, and still packs a punch +4 strength and +4 agility", 4, 0, 4, 0, 0, 0, 0));
        lootTable.add(new Item("Cracked Amethyst Staff", 7, "A magical staff with a cracked magical gem. Still retains some magic capabilities, +5 magic and +2 agility", 0, 0, 2, 0, 5, 0, 0));
        lootTable.add(new Item("Wooden Shield", 7, "A shield that has likely seen many battles previous, provides +4 fortitude +3 strength", 3, 0, 0, 0, 0, 4, 0));
        lootTable.add(new Item(ANSI_WHITE + "=UNCOMMON=" + ANSI_RESET + " Copper Mace", 10, "A heavy metal mace that packs quite the punch, +10 strength", 8, 0, 0, 0, 0, 0, 0));
        lootTable.add(new Item(ANSI_WHITE + "=UNCOMMON=" + ANSI_RESET + " Amethyst Staff", 10, "A staff with an impure magical gemstone inside +8 magic and +2 agility", 0, 0, 3, 0, 2, 0, 0));
        lootTable.add(new Item(ANSI_WHITE + "=UNCOMMON=" + ANSI_RESET + " Bronze Sword", 10, "A reliable bronze sword that gives +8 strength +2 agility", 8, 0, 2, 0, 0, 0, 0));
        
        return lootTable;
    }

    public static Item getRandomWeapon_lv1() 
    {
        ArrayList<Item> lootTable = createLootTablelv1();
        Random rand = new Random();
        int randomIndex = rand.nextInt(lootTable.size());
        return lootTable.get(randomIndex);
    }
//level 2 loot
    public static ArrayList<Item> createLootTablelv2() 
    {
        ArrayList<Item> lootTable = new ArrayList<>();

        lootTable.add(new Item("Steel Sword", 15, "A well rounded and decently sharp blade +12 strength +3 agility", 12, 0, 3, 0, 0, 0, 0));
        lootTable.add(new Item("Oak Bow", 19, "A fine wood bow with high precision +10 strength +5 crit and +4 agility", 10, 0, 4, 5, 0, 0, 0));
        lootTable.add(new Item("Emerald Staff", 16, "An enchanted emerald staff that gives +12 magic and +4 agility", 0, 0, 4, 0, 12, 0, 0));
        lootTable.add(new Item("Steel Dagger", 19, "A fast and sharp dagger, +7 strength and +12 agility", 8, 0, 7, 0, 0, 0, 0));
        lootTable.add(new Item("Iron Shield", 15, "A reliable iron shield that provides +10 fortitude +5 strength", 5, 0, 0, 0, 0, 10, 0));
        lootTable.add(new Item(ANSI_WHITE + "=UNCOMMON=" + ANSI_RESET + " Silver Sword", 20, "A blade with fantastic handling and a sharp edge +15 strength +5 agility", 15, 0, 5, 0, 0, 0, 0));
        lootTable.add(new Item(ANSI_CYAN + ">=RARE=<" + ANSI_RESET + " Crystal Bow", 28, "An enchated bow, fragmented, but held together by powerful magic +10 strength +8 agility +10 magic", 10, 0, 8, 0, 10, 0, 0));
        return lootTable;
    }

    public static Item getRandomWeapon_lv2() 
    {
        ArrayList<Item> lootTable = createLootTablelv2();
        Random rand = new Random();
        int randomIndex = rand.nextInt(lootTable.size());
        return lootTable.get(randomIndex);
    }
//level 3 loot
    public static ArrayList<Item> createLootTablelv3() 
    {
        ArrayList<Item> lootTable = new ArrayList<>();

        lootTable.add(new Item(ANSI_WHITE + "=UNCOMMON=" + ANSI_RESET + " Golden Sword", 30, "A solid golden sword that gives +18 strength +8 crit +4 agility", 18, 0, 4, 8, 0, 0, 0));
        lootTable.add(new Item(ANSI_WHITE + "=UNCOMMON=" + ANSI_RESET + " Thunder Staff", 32, "An exquisite diamond staff that gives +22 magic and +10 crit", 0, 0, 0, 10, 22, 0, 0));
        lootTable.add(new Item(ANSI_WHITE + "=UNCOMMON=" + ANSI_RESET + " Obsidian Dagger", 30, "A perfectly balanced dagger, +15 strength and +15 agility", 15, 0, 15, 0, 0, 0, 0));
        lootTable.add(new Item(ANSI_WHITE + "=UNCOMMON=" + ANSI_RESET + " Spiked Titanium Shield", 36, "A sturdy titanium shield sure to give enemies a bad time +8 fortitude +10 max health +8 strength", 8, 10, 0, 0, 0, 18, 10));
        lootTable.add(new Item(ANSI_WHITE + "=UNCOMMON=" + ANSI_RESET + " Enchanted Longbow", 35, "A lethal bow that always finds its target +20 strength and +15 agility", 20, 0, 15, 0, 0, 0, 0));
        lootTable.add(new Item(ANSI_CYAN + ">=RARE=<" + ANSI_RESET + " Hero Sword", 45, "A sword of myth that gives +25 strength +8 crit and +12 max health", 25, 0, 0, 8, 0, 0, 12));
        lootTable.add(new Item(ANSI_CYAN + ">=RARE=<" + ANSI_RESET + " Opulent Staff", 43, "A mystical opal staff that gives +35 magic +8 agility + 6 fortitude", 0, 0, 8, 5, 24, 0, 0));
        lootTable.add(new Item(ANSI_PURPLE + "<>=EPIC=<>" + ANSI_RESET + " Dragon Dagger", 50, "A dagger carved from an elder dragon tooth, sears anything it touches  +40 strength and + 20 agility", 34, 0, 28, 0, 0, 0, 0));

        return lootTable;
    }

    public static Item getRandomWeapon_lv3() 
    {
        ArrayList<Item> lootTable = createLootTablelv3();
        Random rand = new Random();
        int randomIndex = rand.nextInt(lootTable.size());
        return lootTable.get(randomIndex);
    }
//level 4 loot
    public static ArrayList<Item> createLootTablelv4() 
    {
        ArrayList<Item> lootTable = new ArrayList<>();

        lootTable.add(new Item(ANSI_WHITE + "=UNCOMMON=" + ANSI_RESET + " Blackmetal Sword", 55, "A blade with an unbreakable edge, it appears dark energy moves within the weapon +35 strength +10 crit and +10 max health", 35, 0, 0, 10, 0, 0, 10));
        lootTable.add(new Item(ANSI_CYAN + ">=RARE=<" + ANSI_RESET + " Elder Staff", 60, "An ancient staff which weaves around your hand,as though adapting to your will giving +40 magic +15 crit and +5 agility", 0, 0, 5, 15, 40, 0, 0));
        lootTable.add(new Item(ANSI_CYAN + ">=RARE=<" + ANSI_RESET + " Forsaken Dagger", 58, "A mysterious shadow dagger, whispering for you to 'bring it souls' +30 strength and + 28 agility", 30, 0, 28, 0, 0, 0, 0));
        lootTable.add(new Item(ANSI_CYAN + ">=RARE=<" + ANSI_RESET + " Cursed Shield", 65, "A shield which inflicts pain back on those who dare strike it +20 strength +12 fortitude and +40 max health", 0, 0, 0, 0, 0, 50, 60));
        lootTable.add(new Item(ANSI_PURPLE + "<>=EPIC=<>" + ANSI_RESET + " Twinfang Bow", 75, "A lethal bow created from fangs of a giant creature that gives +50 strength and +25 crit", 45, 0, 0, 25, 0, 0, 0));
        lootTable.add(new Item(ANSI_PURPLE + "<>=EPIC=<>" + ANSI_RESET + " Elemental Ategir", 75, "A perfectly weighted polearm that channels the elements around it, giving +30 strength +10 agility +10 crit +10 magic +5 fortitude +10 max health", 30, 0, 10, 10, 10, 5, 10));
        lootTable.add(new Item(ANSI_YELLOW + "<|>=LEGENDARY=<|>" + ANSI_RESET + " Lunar Staff", 85, "A staff infused with celestial energy, channeling the moon and stars for raw power +85 magic", 0, 0, 0, 0, 85, 0, 0));
        return lootTable;
    }

    public static Item getRandomWeapon_lv4() 
    {
        ArrayList<Item> lootTable = createLootTablelv4();
        Random rand = new Random();
        int randomIndex = rand.nextInt(lootTable.size());
        return lootTable.get(randomIndex);
    }
//level 5 loot
    public static ArrayList<Item> createLootTablelv5() 
    {
        ArrayList<Item> lootTable = new ArrayList<>();

        lootTable.add(new Item(ANSI_CYAN + ">=RARE=<" + ANSI_RESET + " Divine Sword", 93, "A divine sword forged by the gods, granting +70 strength +15 agility +8 crit", 70, 0, 15, 8, 0, 0, 0));
        lootTable.add(new Item(ANSI_YELLOW + "<|>=LEGENDARY=<|>" + ANSI_RESET + " Void Staff of Xalathor", 150, "An ancient staff of immense power, belonging to one of the evil lords who terrorize this land +70 magic +10 crit +20 agility +50 max health", 0, 0, 20, 10, 70, 0, 50));
        lootTable.add(new Item(ANSI_PURPLE + "<>=EPIC=<>" + ANSI_RESET + " Soul Reaper", 120, "A large scythe infused with the essence of lost souls, granting you the power of those it struck down, +90 strength +10 fortitude + 20 max health", 90, 0, 0, 0, 0, 10, 20));
        lootTable.add(new Item(ANSI_PURPLE + "<>=EPIC=<>" + ANSI_RESET + " Dragontear Buckler", 120, "A shield made from crystallized dragon tears +25 fortitude +80 max health + 15 strength", 0, 0, 0, 0, 20, 25, 0));
        lootTable.add(new Item(ANSI_YELLOW + "<|>=LEGENDARY=<|>" + ANSI_RESET + " Talon of God", 150, "A spear capable of striking gods +120 strength and +30 agility", 120, 0, 30, 0, 0, 0, 0));
        lootTable.add(new Item(ANSI_YELLOW + "<|>=LEGENDARY=<|>" + ANSI_RESET + " Amara's Vengance", 150, "A bow capable of striking down any foe in its way, always hits its target +100 strength +30 crit + 20 agility", 38, 0, 0, 0, 0, 0, 0));
        lootTable.add(new Item(ANSI_CYAN + ">=RARE=<" + ANSI_RESET + " Ethereal Staff", 125, "A staff that harnesses the ethereal energy of the cosmos, giving +100 magic and +25 agility", 0, 0, 25, 0, 100, 0, 0));
        return lootTable;
    }

    public static Item getRandomWeapon_lv5() 
    {
        ArrayList<Item> lootTable = createLootTablelv5();
        Random rand = new Random();
        int randomIndex = rand.nextInt(lootTable.size());
        return lootTable.get(randomIndex);
    }
    public static ArrayList<Item> createLootTablelv6() 
    {
        ArrayList<Item> lootTable = new ArrayList<>();

        lootTable.add(new Item(ANSI_PURPLE + "<>=EPIC=<>" + ANSI_RESET + " Guardian Staff", 55, "A divine sword forged by the gods, granting +70 strength +15 agility +8 crit", 70, 0, 15, 8, 0, 0, 0));
        lootTable.add(new Item(ANSI_YELLOW + "<|>=LEGENDARY=<|>" + ANSI_RESET + " Bane of Zarek", 62, "An ancient staff of immense power, belonging to one of the evil lords who terrorize this land +70 magic +10 crit +20 agility +50 max health", 0, 0, 20, 10, 70, 0, 50));
        lootTable.add(new Item(ANSI_YELLOW + "<|>=LEGENDARY=<|>" + ANSI_RESET + " Malakar's Wrath", 66, "A large scythe infused with the essence of lost souls, granting you the power of those it struck down, +90 strength +10 fortitude + 20 max health", 90, 0, 0, 0, 0, 10, 20));
        lootTable.add(new Item(ANSI_YELLOW + "<|>=LEGENDARY=<|>" + ANSI_RESET + "  Pestillence", 60, "A shield made from crystallized dragon tears +25 fortitude +80 max health + 15 strength", 15, 0, 0, 0, 20, 25, 80));
        lootTable.add(new Item(ANSI_RED + "-<|>=MYTHICAL=<|>-" + ANSI_RESET + " Essence of Chaos", 81, "A evil looking orb that calls to you, power radiating from its pedestal +200 magic +50 crit", 0, 0, 0, 50, 200, 0, 0));
        lootTable.add(new Item(ANSI_RED + "-<|>=MYTHICAL=<|>-" + ANSI_RESET + " Blades of Chronos", 85, "A set of short blades that feel as if time itselfs slows down in your favor +180 strength +30 crit + 40 agility", 180, 0, 40, 30, 0, 0, 0));
        lootTable.add(new Item(ANSI_RED + "-<|>=MYTHICAL=<|>-" + ANSI_RESET + " The Final Solution", 83, "A shield mimicing that of yin and yang that splits into twinblades of dark and light energy, has tremendous versatility +150 strength, +30 fortitude +70 max health", 150, 0, 0, 0, 0, 30, 70));
        return lootTable;
    }

    public static Item getRandomWeapon_lv6() 
    {
        ArrayList<Item> lootTable = createLootTablelv6();
        Random rand = new Random();
        int randomIndex = rand.nextInt(lootTable.size());
        return lootTable.get(randomIndex);
    }
}
