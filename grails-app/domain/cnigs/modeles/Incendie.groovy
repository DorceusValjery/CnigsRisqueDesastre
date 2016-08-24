package cnigs.modeles

class Incendie extends Desastre{

    CauseIncendie causeIncendie
    ModeExtinction modeExtinction
    ModePropagation modePropagation
    int nbreBatiDetruits
    int typeContruction

    enum ModeExtinction implements org.springframework.context.MessageSourceResolvable{
        PRODUCTION_DE_VAPEUR(1), INERTAGE(2), ETOUFFEMENT(3), SUPPRESSION(4), SOUFFLAGE(5),DISPERSION(6)
        final int value
        int value(){return value}
        ModeExtinction(int value){this.value=value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "Direction Inondation :"+name()}
    }
    enum ModePropagation implements org.springframework.context.MessageSourceResolvable{
        CONDUCTION(1), RAYONNEMENT(2), CONVECTION(3), DEPLACEMENT_DE_SUBSTANCE_EN_COMBUSTION(4)
        final int value
        int value(){return value}
        ModePropagation(int value){this.value=value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "Direction Inondation :"+name()}

    }
    enum CauseIncendie implements org.springframework.context.MessageSourceResolvable {
        CAUSE_NATURELLE(1), CAUSE_HUMAINE(2)
        final int value
        int value(){return value}
        CauseIncendie(int value){this.value=value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "Direction Inondation :"+name()}
    }

    static constraints = {
    }

}
