public class enemy
{
    private String type;
    private int maxHealth;
    private int health;
    private int strength;
    private int fortitude;
    private boolean dead;
    private boolean defending;
    private int damage;
    private int BurnCounter;
    private int FrozenCounter;

    public enemy()
    {
        this.type = "goblin";
        this.maxHealth = 15;
        this.health = 15;
        this.strength = 5;
        this.fortitude = 2;
        this.dead = false;
        this.defending = false;
        this.damage = 0;
        this.BurnCounter = 0;
        this.FrozenCounter = 0;
    }

    public enemy(String type, int maxHealth, int health, int strength, int fortitude, boolean dead, boolean defending, int damage, int BurnCounter, int FrozenCounter)
    {
        this.type = type;
        this.maxHealth = maxHealth;
        this.health = health;
        this.strength = strength;
        this.fortitude = fortitude;
        this.dead = false;
        this.defending = false;
        this.damage = damage;
        this.BurnCounter = BurnCounter;
        this.FrozenCounter = FrozenCounter;
    }

    
    
    //get functions for enemy stats
    public String getType() {return this.type;}

    public int getHealth() {return this.health;}
    
    public int getStrength() {return this.strength;}
    
    public int getFortitude() {return this.fortitude;}

    public boolean getDead() {return this.dead;}

    public boolean getDefending() {return this.defending;}

    public int getmaxHealth() {return this.maxHealth;}

    public int getDamage() {return this.damage;}

    public int getBurnCounter() {return this.BurnCounter;}

    public int getFrozenCounter() {return this.FrozenCounter;}

    public void setBurnCounter(int BurnCounter) {this.BurnCounter = BurnCounter;}

    public void setFrozenCounter(int FrozenCounter) {this.FrozenCounter = FrozenCounter;}

    //methods to adjust enemy values
    public void setDefending(boolean d) {defending = d;}

    public void takeDamage(int damage) 
    {
        if (damage <= 0)
            {
                damage = 1;
                this.health -= damage;
            }
        else
            {
                this.health -= damage;
            }
            
        if (this.health < 0) {
            this.health = 0;
	    this.dead = true;
        }
    }

    public void heal(int amount) {
        this.health += amount;
        if (this.health > this.maxHealth) {
            this.health = this.maxHealth;
        }
    }
    
    public void enemyTurn(player player)
    {
        //enemy turn
        int n = (int)(Math.random() * 100);
        //enemy attack
        if(n > 50)
        {
            int hit = (int)(Math.random() * 100);
            if(hit >20 + player.getAgility())
            {
                if(player.getDefending())
                {
                    System.out.println(getType() + " attacks " + player.getName() + "!");
                    player.takeDamage(1);
                    player.setDefending(false);
                    System.out.println(player.getName() + " has " + player.getHealth() + "/" + player.getmaxHealth()+ " Health Remaining");
                }
                else
                {
                    player.takeDamage(getStrength() - player.getFortitude());
                    if (getStrength() <= player.getFortitude())
                    {
                        System.out.println(getType() + " attacks " + player.getName() + " dealing 1 damage !");
                    }
                    else
                    {
                        System.out.println(getType() + " attacks " + player.getName() + " dealing " + (getStrength() - player.getFortitude())  + " damage !");
                        System.out.println(player.getName() + " has " + player.getHealth() + "/" + player.getmaxHealth()+ " Health Remaining");
                    }
                }
            }
            else
            {
                System.out.println(getType() + " attacks " + player.getName() + "!");
                System.out.println(getType() + " MISSES !!!");
                System.out.println(player.getName() + " has " + player.getHealth() + "/" + player.getmaxHealth()+ " Health Remaining");
            }
        }
        //enemy defend
        else if(n > 20 && n < 50)
        {
            System.out.println(getType() + " defends against " + player.getName() + "!");
            System.out.println(getType() + " is preparing to block " + player.getName() + "'s next attack !");
            setDefending(true);
        }
        //enemy heal
        else if (n < 20)
        {
            System.out.println(getType() + " heals " +  this.fortitude + "!");
            heal(getFortitude());
            System.out.println(getType() + " has " + getHealth() + "/ " + getmaxHealth());
        }
    }
}