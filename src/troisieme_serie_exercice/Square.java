package troisieme_serie_exercice;

public class Square extends  Rectangle {
    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println (square.calculerSurface ());
    }
  private int cote;
  public Square(int cote){
      super(cote, cote);
      this.cote=cote;
  }


    @Override
    public void display(){
        super.display ();
    }

    @Override
    public double calculerSurface() {
        return super.calculerSurface ();

    }
}
