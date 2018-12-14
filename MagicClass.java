package cpt_classes;

public abstract class MagicClass extends MasterClass {
    private int timeTocast, manaCost, intelligenceRequirement;

    public MagicClass(int timeTocast, int manaCost, int intelligenceRequirement, String name, String spriteImage, int ID) {
        super(name, spriteImage, ID);
        this.timeTocast = 1;
        this.manaCost = 1;
        this.intelligenceRequirement = 0;
    }

    public int getTimeTocast() {
        return timeTocast;
    }

    public void setTimeTocast(int timeTocast) {
        this.timeTocast = timeTocast;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public int getIntelligenceRequirement() {
        return intelligenceRequirement;
    }

    public void setIntelligenceRequirement(int intelligenceRequirement) {
        this.intelligenceRequirement = intelligenceRequirement;
    }

    @Override
    public String toString() {
        String word = super.toString() + "\n Time to cast: " + timeTocast + " Mana cost: " + manaCost + " Intelligence requirement: " + intelligenceRequirement;
        return word;
    }
    
}
