package cnigs.modeles
import cnigs.modeles.causes.CauseAccident

class Accident extends Desastre {

    CauseAccident causeAccident = new CauseAccident()

    static constraints = {
    }
}
