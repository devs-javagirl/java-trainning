package POO.Abstracao;

public class circulo extends formaGeometrica {

  private double raio;

  @Override
  public double area() {
    //área do circulo:
    return 3.14*this.raio*this.raio;
  }
  
}
