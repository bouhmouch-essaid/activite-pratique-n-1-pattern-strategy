package org.isga;

public class ComportementArcEtFleches implements ComportementArme {
    private boolean used = false;
    @Override
    public void utiliserArme() {
       if (used) {
        throw new IllegalStateException("The ComportementArcEtFleches is already use");
       }
        System.out.println("The ComportementArcEtFleches is  used");
        used = true;

    }
    @Override
    public boolean canUseArme() {
        return !used;
    }
}



