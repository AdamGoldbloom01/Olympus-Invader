package cpt_classes;
import java.util.Random;

public class WeaponClass extends ItemClass {
    private int baseAttack, baseDamage, attackBouns, damageBouns;

    public WeaponClass(int baseAttack, int baseDamage, int attackBouns, int damageBouns, int value, String name, String spriteImage, int ID) {
        super(value, name, spriteImage, ID);
        this.baseAttack = 0;
        this.baseDamage = 0;
        this.attackBouns = 0;
        this.damageBouns = 0;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getAttackBouns() {
        return attackBouns;
    }

    public void setAttackBouns(int attackBouns) {
        this.attackBouns = attackBouns;
    }

    public int getDamageBouns() {
        return damageBouns;
    }

    public void setDamageBouns(int damageBouns) {
        this.damageBouns = damageBouns;
    }
    
    public int calculateAttackrange () {
        Random attack = new Random();
        
        return attack.nextInt(((baseAttack + attackBouns) - baseAttack) + 1) + baseAttack;
    }
    
    public int calculateDamagerange () {
        Random damage = new Random();
        
        return damage.nextInt(((baseDamage + damageBouns) - baseDamage) + 1) + baseDamage;
    }
    
    @Override
    public String toString() {
        String word = super.toString() + "\n Base attack: " + baseAttack + " Base damage: " + baseDamage + " Bouns attack: " + attackBouns + " Damage attack: " + damageBouns;
        return word;
    }
    
    
}
