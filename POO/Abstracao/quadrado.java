package POO.Abstracao;

public class quadrado extends formaGeometrica {

  private double lado;

  @Override
  public double area() {
    //área do quadrado:
    return this.lado * this.lado;
  }

}