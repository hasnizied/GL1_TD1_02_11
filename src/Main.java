
public class Main {
    public static void main(String[] args) {
        //5.1) Creation d'un objet r1
        Rectangle r1 = new Rectangle();
        //5.1)modification ses valeur par 5 et 6
        r1.setLongueur(5);
        r1.setLargeur(6);

        //5.2) Creation d'un objet r1
        Rectangle r2 = new Rectangle(4, 3);
        Rectangle r3 = new Rectangle(1, 4);

        //5.3) Affichage des information des objet r1,r2,r3
        System.out.println("Les Information du r1` : \n" + r1.AfficherRectangle());
        System.out.println("Les Information du r2` : \n" + r2.AfficherRectangle());
        System.out.println("Les Information du r3` : \n" + r3.AfficherRectangle());

        //5.4) Affichage des surfaces des objet r1,r2
        System.out.println("Aire de r1 : " +r1.Aire());
        System.out.println("Aire de r2 : " +r2.Aire());

        //5.4) Affichage des perimetre des objet r2,r3
        System.out.println("Perimetre de r2 : " + r2.Perimetre());
        System.out.println("Perimetre de r3 : " + r3.Perimetre());

    }
}