public class Evaluation {
    private Etudiant lEtudiant;
    private Matiere laMatiere;
    private double laNote;
    private int leCoeff;

    public Evaluation(Etudiant lEtudiant, Matiere laMatiere, double laNote, int leCoeff)
    {
        this.lEtudiant = lEtudiant;
        this.laMatiere = laMatiere;
        this.laNote = laNote;
        this.leCoeff = leCoeff;
    }

    public void setLaMatiere(Matiere laMatiere) {
        this.laMatiere = laMatiere;
    }

    public Matiere getLaMatiere() {
        return laMatiere;
    }

    public double getLaNote() {
        return laNote;
    }

    public Etudiant getlEtudiant() {
        return lEtudiant;
    }

    public int getLeCoeff() {
        return leCoeff;
    }

    public void setLaNote(double laNote) {
        this.laNote = laNote;
    }

    public void setLeCoeff(int leCoeff) {
        this.leCoeff = leCoeff;
    }

    public void setlEtudiant(Etudiant lEtudiant) {
        this.lEtudiant = lEtudiant;
    }

}
