import java.util.List;
import java.util.ArrayList;

public class Formation {
    private String nom;
    private ArrayList<Etudiant> LesEtudiants;
    private ArrayList<Enseignement> LesEnseignements;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLesEnseignements(ArrayList<Enseignement> lesEnseignements) {
        LesEnseignements = lesEnseignements;
    }

    public ArrayList<Enseignement> getLesEnseignements() {
        return LesEnseignements;
    }

    public void setLesEtudiants(ArrayList<Etudiant> lesEtudiants) {
        LesEtudiants = lesEtudiants;
    }

    public ArrayList<Etudiant> getLesEtudiants() {
        return LesEtudiants;
    }

    public void ajouterEtudiant(Etudiant etudiant){
        LesEtudiants.add(etudiant);

    }
    public ArrayList<Etudiant> lesAdmis(){
        return null;
    }

    public void trierLesEtudiants(String critere){
        //a faire
    }

    public double calculerMoyenneGenerale(){
        return 0;
        //a faire
    }
}
