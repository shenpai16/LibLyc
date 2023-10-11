import java.util.ArrayList;

public class Prof extends Personne{
    private String nom;
    private String prenom;
    private String status; // contractuel ou titulaire
    private ArrayList<Enseignement> lesEnseignements;

    public Prof(String nom, String prenom, String stat)
    {
        super(nom, prenom);
        this.status = stat;
    }


    public ArrayList<Enseignement> getLesEnseignements() {
        return lesEnseignements;
    }

    public void setLesEnseignements(ArrayList<Enseignement> lesEnseignements) {
        this.lesEnseignements = lesEnseignements;
    }

    public void ajouterEnseignement(Enseignement ens){
        //a faire
    }
}
