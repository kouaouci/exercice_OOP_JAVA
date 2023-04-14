package troisieme_serie_exercice;



public  class Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,5);
        rectangle.display ();
        System.out.println(rectangle.calculerSurface());


    }

    double largeur;
    double longuer;

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLonguer() {
        return longuer;
    }

    public Rectangle(double largeur, double longuer) {
        this.largeur = largeur;
        this.longuer = longuer;
    }

    public void setLonguer(double longuer) {
        this.longuer = longuer;
    }


        public double calculerSurface () {
        return this.getLargeur ()*this.getLonguer ();
        }

        public void display () {
        for (int i=0; i<longuer;i++){
            for (int j=0; j<largeur; j++){
                System.out.println ("#");
            }
                System.out.println ("");
            }
        }
    }






