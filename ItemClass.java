package cpt_classes;

public abstract class ItemClass extends MasterClass {
    private int value;

    public ItemClass(int value, String name, String spriteImage, int ID) {
        super(name, spriteImage, ID);
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String word = super.toString() + "\n Value: ";
        return word;
    }
}
