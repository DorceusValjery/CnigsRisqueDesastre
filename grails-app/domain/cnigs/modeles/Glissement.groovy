package cnigs.modeles

class Glissement extends Desastre {

    enum CouvertureVegetale implements org.springframework.context.MessageSourceResolvable {
        NON_BOISSEE(1),PEU_BOISSEE(2),FORTEMENT_BOISSEE(3)
        final int value
        int value(){return value}
        CouvertureVegetale(int value){this.value = value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "Couverture végétale :"+name()}
    }
    CouvertureVegetale couvertureVegetale
    double humiditeTerrain
    enum NatureSol implements org.springframework.context.MessageSourceResolvable {
        ARGILEUX(1), CALCAIRE(2), SABLONNEUX(3), LIMONEUX(4), RICHE_EN_TERREAU(5)
        final int value
        int value(){return value}
        NatureSol(int value){this.value=value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "Nature du Sol :"+name()}
    }
    NatureSol natureSol
    double pente
    double pluviometrieZoneMillimetre
    enum TypeGlissement implements org.springframework.context.MessageSourceResolvable{
        DIMINUTION_RESISTANCE_SOL(1),AUGMENTATION_CHARGE_EN_AMONT(2),DIMINUTION_APPUI_EN_AVAL(3),
        FACTEUR_ANTHROPIQUE(4),SEISME_OU_PLUIE(5),AUGMENTATION_CHALEUR(6)
        final int value
        int value(){return value}
        TypeGlissement(int value){this.value=value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "Type de Glissement :"+name()}
    }
    TypeGlissement typeGlissement
    double volumeDeplace

    static constraints = {
        humiditeTerrain min: (double)0.0 , max: (double) 100
        pente min: (double)0.0 , max: (double) 100
        pluviometrieZoneMillimetre min: (double)0.0
        volumeDeplace min: (double)0.0
    }
}
