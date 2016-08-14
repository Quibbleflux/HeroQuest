
package main;

/**
 *
 * @author Matts
 */
public class Game {
    private Party party;
    private Inventory inventory;
    public Game() {
        
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
}
