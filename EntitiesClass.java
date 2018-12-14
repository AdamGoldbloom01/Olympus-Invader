package cpt_classes;
import java.util.*;

public class EntitiesClass extends MasterClass {
    private int health, mana, strength, dexterity, constitution, intelligence, armourclass;
    private ArrayList<ItemClass> inventory = new ArrayList<ItemClass>();
    private ArrayList<MagicClass> spells = new ArrayList<MagicClass>();

    public EntitiesClass(int health, int mana, int strength, int dexterity, int constitution, int intelligence, int armourclass, String name, String spriteImage, int ID) {
        super(name, spriteImage, ID);
        this.health = 0;
        this.mana = 0;
        this.strength = 0;
        this.dexterity = 0;
        this.constitution = 0;
        this.intelligence = 0;
        this.armourclass = 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = constitution * 3 + 2;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getarmourclass() {
        return armourclass;
    }

    public void setarmourclass(int armourclass) {
        
        
        this.armourclass = armourclass;
    }

    public ArrayList<ItemClass> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<ItemClass> inventory) {
        this.inventory = inventory;
    }

    public ArrayList<MagicClass> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<MagicClass> spells) {
        this.spells = spells;
    }
    
    @Override
    public String toString() {
        String word = "\n Health: " + health + " Mana: " + mana + " Strength: " + strength + " Dexterity: " + dexterity + " Constitution: " + constitution + " Intelligence: " + intelligence + " Armour Class: " + armourclass;
        return word;
    }
    
}
