package cnigs.modeles.causes

abstract class Cause {

    String commentaire=""
    boolean evitable=true
    boolean previsible=true

    static constraints = {
        commentaire maxSize: 250
    }
}
