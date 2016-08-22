package cnigs.modeles

import cnigs.modeles.outils.Vehicule

class Accident extends Desastre {

    enum CauseAccident implements org.springframework.context.MessageSourceResolvable {
        EXCESS_DE_VITESSE(1),VIOLATION_FEU_ROUGE(2), DISFONCTIONNEMENT_FREINS(3),
        CONDUITE_EN_ETAT_IVRESSE(4), CAUSE_EXTERIEURE(5), POURSUITE_POLICIERE(6)
        final int value
        int value(){return value}
        CauseAccident(int value){this.value=value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "Accident de voitures :"+name()}
    }

    CauseAccident causeAccident
    Set<Vehicule> vehicules

    static constraints = {
    }
}
