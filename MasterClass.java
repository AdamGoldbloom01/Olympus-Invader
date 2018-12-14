package cpt_classes;

public abstract class MasterClass {
    private String name, spriteImage;
    private int ID;

    public MasterClass(String name, String spriteImage, int ID) {
        this.name = "null";
        this.spriteImage = "null";
        this.ID = 010203;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpriteImage() {
        return spriteImage;
    }

    public void setSpriteImage(String spriteImage) {
        this.spriteImage = spriteImage;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        String word = "Name: " + name + " ImageReference: " + " ID: " + ID;
        return word;
    }
    
}
