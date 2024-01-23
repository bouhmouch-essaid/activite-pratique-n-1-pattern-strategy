package org.isga;

public class ComportementHache implements ComportementArme {
    private boolean used = false;
    @Override
    public void useWeapon() {
        if (used) {
            throw new IllegalStateException("The Axe Behavior is already use");
        }
        System.out.println("The Axe Behavior is used");
        used = true;
    }


    @Override
    public boolean canUseArme() {
        return !used;
    }
}

