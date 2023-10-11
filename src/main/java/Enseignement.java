import java.util.ArrayList;

public class Enseignement {
    private boolean facultatif;
    private Matiere laMatiere;
    private Prof leProf;
    private ArrayList<Etudiant> lesEtudiants;
    private Formation laFormation;
    private Evaluation lesEvaluations;

    public Enseignement(boolean facultatif, Matiere laMatiere, Prof leProf, Formation laFormation)
    {
        this.facultatif = facultatif;
        this.laMatiere = laMatiere;
        this.leProf = leProf;
        this.laFormation = laFormation;
    }

    public ArrayList<Etudiant> getLesEtudiants() {
        return lesEtudiants;
    }

    public void setLesEtudiants(ArrayList<Etudiant> lesEtudiants) {
        this.lesEtudiants = lesEtudiants;
    }

    public Evaluation getLesEvaluations() {
        return lesEvaluations;
    }

    public void setFacultatif(boolean facultatif) {
        this.facultatif = facultatif;
    }

    public Formation getLaFormation() {
        return laFormation;
    }

    public Prof getLeProf() {
        return leProf;
    }

    public Matiere getLaMatiere() {
        return laMatiere;
    }

    public void setLaFormation(Formation laFormation) {
        this.laFormation = laFormation;
    }

    public void setLaMatiere(Matiere laMatiere) {
        this.laMatiere = laMatiere;
    }

    public void setLeProf(Prof leProf) {
        this.leProf = leProf;
    }

    public void setLesEvaluations(Evaluation lesEvaluations) {
        this.lesEvaluations = lesEvaluations;
    }


    public void ajouterEvaluation(Evaluation eval){
        //a faire
    }
}
