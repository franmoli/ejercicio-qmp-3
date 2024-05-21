package ar.edu.utn.frba.dds;

public class Institucion {
  String nombre;
  public Uniforme uniforme;

  public Institucion(String nombre, Uniforme uniforme) {
    if (nombre == null || uniforme == null) {
      throw new NullPointerException("Nombre y Uniforme no puede ser nulo");
    }
    this.nombre = nombre;
    this.uniforme = uniforme;
  }
}
