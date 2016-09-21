package cnigs.modeles

class Cyclone extends Desastre {

    double vitesseDuVent;

    enum categorieCyclonique implements org.springframework.context.MessageSourceResolvable{
        CATEGORIE_UN(1), CATEGORIE_DEUX(2), CATEGORIE_TROIS(3), CATEGORIE_QUATRE(4), CATEGORIE_CINQ(5)
        final int value
        int value(){return value}
        categorieCyclonique(int value){this.value=value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "CATEGORIE CYCLONIQUE :"+name()}
    }

    static constraints = {
    }
}
