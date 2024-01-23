package org.isga;

public class ComportementPoignard implements ComportementArme {
    private boolean used = false;
    @Override
    public void useWeapon() {
        if (used) {
            throw new IllegalStateException("The Dagger Behavior is already  use");
        }
        System.out.println("The Dagger Behavior is used");
        used = true;
    }

    @Override
    public boolean canUseArme() {
        return !used;
    }
}
