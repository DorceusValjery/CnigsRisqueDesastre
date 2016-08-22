package cnigs.modeles

abstract class Desastre {

    Date dateRapport
    double degatAgricol
    double degatMateriel
    double duree
    double geoLatitude
    double geoLongitude
    double kmRayon
    int nbreBlesses
    int nbreMorts

    enum NiveauFormationPopulation implements org.springframework.context.MessageSourceResolvable {
        FORMATION_FAIBLE(1),FORMATION_MOYENNE(2),FORMATION_SOUTENUE(3)
        final int value
        int value(){return value}
        NiveauFormationPopulation(int value){this.value=value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "Type de Glissement :"+name()}
    }

    NiveauFormationPopulation niveauFormationPopulation

    static constraints = {
        degatAgricol min: (double)0.0
        degatMateriel min: (double)0.0
        kmRayon min: (double)0.0
        nbreBlesses min: 0
        nbreMorts min:0

    }
}
