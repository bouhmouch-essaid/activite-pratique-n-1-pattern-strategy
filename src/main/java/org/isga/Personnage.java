package org.isga;

import org.isga.ComportementArme;

public class Personnage {
    private ComportementArme arme;

    public void combattre() {
        System.out.println("Engaging in combat");
    }

    public void useWeapon() {
        if (arme.canUseArme()) {
            arme.useArme();
        } else {
            System.out.println("The weapon can no longer be used");
        }
    }

    public void setArme(ComportementArme arme) {
        this.arme = arme;
    }
}
