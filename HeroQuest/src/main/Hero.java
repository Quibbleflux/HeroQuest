
package main;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Matts
 */
public abstract class Hero {
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
    
}
