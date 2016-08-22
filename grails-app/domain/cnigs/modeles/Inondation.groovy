package cnigs.modeles

class Inondation extends Desastre {


    double distanceRiviere
    double planEauProche
    double pluviometrieZoneMillimetre
    double hauteurEauMur

    enum TypeCrue implements org.springframework.context.MessageSourceResolvable {
        RUISSELLEMENT_URBAIN(1),ECOULEMENT_URBAIN(2),RUISSELLEMENT_MONTAGNEUX(3),
        CRUE_RIVIERE_PROCHE(4),SUBMERSION_RIVAGE(5),CRUE_DE_PLAINE(6)
        final int value
        int value(){return value}
        TypeCrue(int value){this.value=value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "Type de crue :"+name()}
    }
    enum NiveauEndommagement implements org.springframework.context.MessageSourceResolvable {
        SUBMERSION_SANS_DANGER(1), DOMMAGES_LEGERS_HABILLAGE(2), DOMMAGES_LEGERS_STRUCTURE(3),
        DOMMAGES_MODERES(4),DOMMAGES_SEVERES(5), MAISON_EMPORTEE(6)
        final int value
        int value(){return value}
        NiveauEndommagement(int value){this.value=value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "Niveau d endommagement :"+name()}
    }
    enum DureeSubmersion implements org.springframework.context.MessageSourceResolvable {
        QUELQUES_MINUTES(1), QUELQUES_HEURES(2), QUELQUES_JOURS(3), QUELQUES_SEMAINES(4)
        final int value
        int value(){return value}
        DureeSubmersion(int value){this.value=value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "Duree de submersion:"+name()}
    }
    enum DirectionInondation implements org.springframework.context.MessageSourceResolvable {
        NORD(1), NORD_EST(2), EST(3), SUD_EST(4), SUD(5), SUD_OUEST(6), OUEST(7), NORD_OUEST(8)
        final int value
        int value(){return value}
        DirectionInondation(int value){this.value=value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "Direction Inondation :"+name()}
    }
    enum PenteAuPointDecrit  implements org.springframework.context.MessageSourceResolvable {
        PLAINE_OU_PLAT(1), PENTE_LEGERE(2), PENTE_FORTE(3)
        final int value
        int value(){return value}
        PenteAuPointDecrit(int value){this.value=value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "Direction Inondation :"+name()}
    }
    enum FrequenceInondationZone implements org.springframework.context.MessageSourceResolvable {
        JAMAIS(1), PENDANT_CYCLONES(2), PLUIE_PLUSIEURS_JOURS(3), PLUIE_UNE_JOURNEE(4),
        PLUIE_PLUSIEURS_HEURES(6), PLUIE_COURTE(7), SANS_PLUIE(8)
        final int value
        int value(){return value}
        FrequenceInondationZone(int value){this.value=value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "Frequence Inondation Zone :"+name()}
    }
    enum OuvrageDrainage implements org.springframework.context.MessageSourceResolvable {
        OUVRAGE_DRAINAGE_ENTERRE(1), OUVRAGE_DRAINAGE_AIR_LIBRE(2), OUVRAGE_IRRIGATION(3),
        RAVINE_ZONE_URBAINE(4), RAVINE_ZONE_RURALE(5), RIVIERE_NATURELLE(6), RIVIERE_CHENALISEE(7),
        CANAL_DERIVATION(8)
        final int value
        int value(){return value}
        OuvrageDrainage(int value){this.value=value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "Ouvrage de Drainage :"+name()}
    }
    enum OuvrageProtection implements org.springframework.context.MessageSourceResolvable {
        GABIONS(1), DEBLAIS_DE_DEPOT_DANS_LE_LIT(2), REMBLAIS_EN_TERRE(3),
        REMBLAIS_EN_BETON_OU_MACONNERIE(4), SUEILS_DANS_LE_LIT(5),
        VANNE_OU_PRISE_EAU_IRRIGATION(6),DEVERSOIR_EXISTANT(7),AUTRES(8)
        final int value
        int value(){return value}
        OuvrageProtection(int value){this.value=value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "Ouvrage de Protection :"+name()}
    }

    enum BrecheProtection  implements org.springframework.context.MessageSourceResolvable {
        AFFAISSEMENT_EROSION_EFFONDREMENT(1), OUVERTURE_STRUCTURELLE(2), OUVERTURE_ARTIFICIELLE_OU_VOLONTAIRE(3),
        BRECHE_CREE_PAR_CRUE(4)
        final int value
        int value(){return value}
        BrecheProtection(int value){this.value=value}
        @Override String[] getCodes() { [ name() ]}
        @Override Object[] getArguments() {[] as Object[]}
        @Override String getDefaultMessage() { "Breche dans l ouvrage de protection :"+name()}
    }

    TypeCrue typeCrue
    NiveauEndommagement niveauEndommagement
    DureeSubmersion dureeSubmersion
    DirectionInondation directionInondation
    PenteAuPointDecrit penteAuPointDecrit
    FrequenceInondationZone frequenceInondationZone
    OuvrageDrainage ouvrageDrainage
    OuvrageProtection ouvrageProtection
    BrecheProtection brecheProtection

    static constraints = {
        pluviometrieZoneMillimetre min: (double)0.0
    }
}
