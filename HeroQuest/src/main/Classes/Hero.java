
package main.Classes;

import java.util.HashMap;
import java.util.Map;
import main.EquipSlot;
import main.Item;

/**
 *
 * @author Matts
 */
public abstract class Hero {
    private String name;
    private String heroclass;
    private int level;
    
    private int health;
    private int physicalAttack;
    private int physicalDefence;
    private int magicAttack;
    private int magicDefense;
    private int speed;
    private int luck;
    
    private int healthGrowth;
    private int physicalAttackGrowth;
    private int physicalDefenceGrowth;
    private int magicAttackGrowth;
    private int magicDefenseGrowth;
    private int speedGrowth;
    private int luckGrowth;
    
    private Map<EquipSlot, Item> equipList = new HashMap();
    
    private boolean isActive;

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    // Some probably need some more customized coding, like the HashMap. -MW
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getHeroclass() {
        return heroclass;
    }
    
    public void setHeroclass(String heroclass) {
        this.heroclass = heroclass;
    }
    
    public int getLevel() {
        return level;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
    
    public int getPhysicalAttack() {
        return physicalAttack;
    }
    
    public void setPhysicalAttack(int physicalAttack) {
        this.physicalAttack = physicalAttack;
    }
    
    public int getPhysicalDefence() {
        return physicalDefence;
    }
    
    public void setPhysicalDefence(int physicalDefence) {
        this.physicalDefence = physicalDefence;
    }
    
    public int getMagicAttack() {
        return magicAttack;
    }
    
    public void setMagicAttack(int magicAttack) {
        this.magicAttack = magicAttack;
    }
    
    public int getMagicDefense() {
        return magicDefense;
    }
    
    public void setMagicDefense(int magicDefense) {
        this.magicDefense = magicDefense;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getLuck() {
        return luck;
    }
    
    public void setLuck(int luck) {
        this.luck = luck;
    }
    
    public int getHealthGrowth() {
        return healthGrowth;
    }
    
    public void setHealthGrowth(int healthGrowth) {
        this.healthGrowth = healthGrowth;
    }
    
    public int getPhysicalAttackGrowth() {
        return physicalAttackGrowth;
    }
    
    public void setPhysicalAttackGrowth(int physicalAttackGrowth) {
        this.physicalAttackGrowth = physicalAttackGrowth;
    }
    
    public int getPhysicalDefenceGrowth() {
        return physicalDefenceGrowth;
    }
    
    public void setPhysicalDefenceGrowth(int physicalDefenceGrowth) {
        this.physicalDefenceGrowth = physicalDefenceGrowth;
    }
    
    public int getMagicAttackGrowth() {
        return magicAttackGrowth;
    }
    
    public void setMagicAttackGrowth(int magicAttackGrowth) {
        this.magicAttackGrowth = magicAttackGrowth;
    }
    
    public int getMagicDefenseGrowth() {
        return magicDefenseGrowth;
    }
    
    public void setMagicDefenseGrowth(int magicDefenseGrowth) {
        this.magicDefenseGrowth = magicDefenseGrowth;
    }
    
    public int getSpeedGrowth() {
        return speedGrowth;
    }
    
    public void setSpeedGrowth(int speedGrowth) {
        this.speedGrowth = speedGrowth;
    }
    
    public int getLuckGrowth() {
        return luckGrowth;
    }
    
    public void setLuckGrowth(int luckGrowth) {
        this.luckGrowth = luckGrowth;
    }
    
    public Map<EquipSlot, Item> getEquipList() {
        return equipList;
    }
    
    public void setEquipList(Map<EquipSlot, Item> equipList) {
        this.equipList = equipList;
    }
    
    public boolean isIsActive() {
        return isActive;
    }
    
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
//</editor-fold>
    
    
}
