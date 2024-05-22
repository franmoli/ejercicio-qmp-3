package ar.edu.utn.frba.dds;

public class Usuario {
  Integer edad;
  String nombre;

  public Usuario(Integer edad, String nombre) {
    if (edad == null || nombre == null) {
      throw new IllegalArgumentException("Datos inválidos");
    }
    this.edad = edad;
    this.nombre = nombre;
  }
}
