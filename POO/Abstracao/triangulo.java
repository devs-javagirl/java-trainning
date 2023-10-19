package POO.Abstracao;

public class triangulo extends formaGeometrica {
  //medidas do triangulo como atributos
  private double altura;
  private double base;

  @Override
  public double area() {
    //área do triangulo
    return (this.altura*this.base)/2;
  }
  
}
