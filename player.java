public class player 
{
    private String name;
    private int maxHealth;
    private int health;
    private int strength;
    private int crit;
    private int magic;
    private int agility;
    private int fortitude;
    private int gold;
    private boolean dead;   
    private boolean defending;
    private int damage;
    private Item n;
    private boolean turn;
    public int lv;

    public player()
    {
        this.name = "player";
        this.maxHealth = 50;
        this.health = 50;
        this.strength = 10;
        this.crit = 0;
        this.magic = 0;
        this.agility = 5;
        this.fortitude = 10;
        this.gold = 0;
        this.dead = false;
        this.defending = false;
        this.damage = 0;
        this.n = null;
    }
    
    //all player base stats, and starting conditions
    public player(String name, int maxHealth, int health, int strength, int crit, int magic, int agility, int fortitude, int gold, boolean dead, boolean defending, int damage, Item n)
    {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = health;
        this.strength = strength;
        this.crit = crit;
        this.magic = magic;
        this.agility = agility;
        this.fortitude = fortitude;
        this.gold = gold;
        this.dead = dead;
        this.defending = defending;
        this.damage = damage;
        this.n = n;
        this.lv = 0;
    }


    //get functions for each player stat
    public String getName() {return this.name;}

    public int getHealth() {return this.health;}
    
    public int getStrength() {return this.strength;}
    
    public int getCrit() {return this.crit;}

    public int getMagic() {return this.magic;}
    
    public int getAgility() {return this.agility;}

    public int getFortitude() {return this.fortitude;}

    public boolean getDead() {return this.dead;}

    public boolean getDefending() {return this.defending;}

    public int getGold() {return this.gold;}

    public int getmaxHealth() {return this.maxHealth;}

    public boolean getTurn() {return this.turn;}

    public Item getItem() {return this.n;}

    public int getLv() {return this.lv;}

    public void lvUp(int lv) {this.lv = lv; this.maxHealth += 10; this.health += 10; this.strength += 2; this.crit += 1; this.magic += 1; this.agility += 1; this.fortitude += 2;
        System.out.println("");System.out.println("You leveled up! " + "You gain 10 max health 2 strength 1 crit 1 magic 1 agility and 2 fortitude"); System.out.println("You are now level " + this.lv); System.out.println("");}
    
    //methods that will result in values changing(stats, gold, health, death)
    public void addGold(int gold) {this.gold += gold;}

    public void subtractGold(int gold) {this.gold -= gold;}

    public void takeDamage(int dmg) 
    {
            if (fortitude >= dmg)
            {
                dmg = 1;
                this.health -= dmg;
            }
            else
            {
                this.health -= dmg;
            }

        if (this.health < 0) 
        {
           this.health = 0;
	       this.dead = true;
        }
        damage = dmg;
    }
    public int getDamage()
    {
        return damage;
    }

    public void heal(int amount) 
    {
        this.health += (amount + this.magic/2);
        if (this.health > this.maxHealth) 
        {
            this.health = this.maxHealth;
        }
    }

    public void increaseStrength(int amount) {this.strength += amount;}

    public void increaseFortitude(int amount) {this.fortitude += amount;}

    public void increaseCrit(int amount) {this.crit += amount;}

    public void increaseMagic(int amount) {this.magic += amount;}

    public void increaseAgility(int amount) {this.agility += amount;}

    public void increaseHealth(int amount) {this.maxHealth += amount; this.health += amount;}

    public void setDefending(boolean d) {defending = d;}

    

    public void addItem(Item n) {
        if (n != null) 
        {
            if (this.n != null)
            {
                //remove old weapon's stats
                this.strength -= this.n.getStrength();
                this.agility -= this.n.getAgility();
                this.crit -= this.n.getCrit();
                this.magic -= this.n.getMagic();
                this.fortitude -= this.n.getFortitude();
            }
            //change the weapon
            this.n = n;

            // Add the new weapon's stats
                this.strength += n.getStrength();
                this.agility += n.getAgility();
                this.crit += n.getCrit();
                this.magic += n.getMagic();
                this.fortitude += n.getFortitude();
            
        }
    }
}