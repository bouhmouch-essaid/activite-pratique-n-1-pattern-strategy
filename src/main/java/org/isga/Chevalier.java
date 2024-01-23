package org.isga;

public class Chevalier implements ComportementArme {
    private boolean used = false;
    @Override
    public void utiliserArme() {
        if (used) {
            throw new IllegalStateException("The Knight is already use.");
        }
        System.out.println("the Knight is used.");
        used = true;

    }

    @Override
    public boolean canUseArme() {
        return !used;
    }
}
