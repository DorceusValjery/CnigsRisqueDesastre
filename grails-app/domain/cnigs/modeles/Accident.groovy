package cnigs.modeles

import cnigs.modeles.outils.Vehicule

class Accident extends Desastre {

    int causeAccident
    Set<Vehicule> vehicules

    static constraints = {
    }
}
