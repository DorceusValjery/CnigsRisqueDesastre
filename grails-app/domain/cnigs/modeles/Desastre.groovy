package cnigs.modeles

import cnigs.modeles.causes.Cause
import cnigs.modeles.degats.Degat

abstract class Desastre {

    Date occurence
    double duree
    int nbreBlesses
    int nbreMorts
    int nbreDeplaces
    Object polygones


    static hasMany = [degats:Degat]

    enum NiveauFormationPopulation implements org.springframework.context.MessageSourceResolvable {
        FORMATION_FAIBLE(1),FORMATION_MOYENNE(2),FORMATION_SOUTENUE(3)
        final int value
        int value(){return value}
        NiveauFormationPopulation(int value){this.value=value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "Fornation population :"+name()}
    }

    NiveauFormationPopulation niveauFormationPopulation

    static constraints = {
        nbreBlesses min: 0
        nbreMorts min:0
        nbreDeplaces min: 0
        occurence max: new Date()

    }
}
