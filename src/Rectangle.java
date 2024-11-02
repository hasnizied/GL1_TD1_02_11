public class Rectangle {

    //Attribut de la rectangle
    private int Longueur;
    private int Largeur;

    //Propriete et methode d'acces  de la rectangle
    public void setLongueur(int Longueur) {
        this.Longueur = Longueur;
    }
    public void setLargeur(int Largeur) {
        this.Largeur = Largeur;
    }
    public int getLongueur() {
        return Longueur;
    }
    public int getLargeur() {
        return Largeur;
    }

    //Cette fonction retourne le perimetere d'un recctagle
    public int Perimetre() {
        return (this.Longueur + this.Largeur) * 2;
    }

    //Cette fonction retourne l'air d'un recctagle
    public int Aire() {
        return (this.Longueur * this.Largeur) ;
    }

    //Cette fonction verifie le rectangle si Il s'agit d'un caree  ou non
    private String EstCarre() {
        if (this.Longueur == this.Largeur) {
            return "Il s'agit d'un caree ";
        } else {
            return "Il ne s'agit pas d'un caree";
        }
    }

    //constructeur par defaut
    public Rectangle() {
        this.Longueur = 10;
        this.Largeur = 10;

    }

    // constructeur avec largeur et longueur comment argument
    public Rectangle(int Longueur, int Largeur) {
        this.Longueur = Longueur;
        this.Largeur = Largeur;

    }


    //Cette fonction les details d'un rectangle
    public String AfficherRectangle() {
     return  "Longueur : " + this.getLargeur() + " - Largeur : " +  this.getLongueur() + " Perimetre : " + Perimetre() + " Aire : " + Aire() + " \n" + EstCarre();
    }


}


