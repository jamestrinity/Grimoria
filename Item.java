public class Item
{
    private String name;
    private int price;
    private String itemDesc;
    private int strength;
    private int health;
    private int crit;
    private int magic;
    private int agility;
    private int fortitude;
    private int maxHealth;

    public Item(String name, int price, String itemDesc, int strength, int health, int agility, int crit, int magic, int fortitude, int maxHealth) 
    {
        this.name = name;
        this.price = price;
        this.itemDesc = itemDesc;
        this.strength = strength;
        this.health = health;
        this.agility = agility;
        this.crit = crit;
        this.magic = magic;
        this.fortitude = fortitude;
        this.maxHealth = maxHealth;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public int getmaxHealth() {return this.maxHealth;}
    
    public int getStrength() {return this.strength;}

    public int getHealth() {return this.health;}
    
    public int getCrit() {return this.crit;}

    public int getMagic() {return this.magic;}
    
    public int getAgility() {return this.agility;}

    public int getFortitude() {return this.fortitude;}

}
