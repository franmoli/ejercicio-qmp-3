package ar.edu.utn.frba.dds;

public class Prenda {
  TipoDePrenda tipo;
  Material material;
  Colores colorPrincipal;
  Colores colorSecundario;
  Trama trama;

  public Prenda(TipoDePrenda tipo, Material material, Colores colorPrincipal,
                Colores colorSecundario, Trama trama) {
    this.tipo = tipo;
  }



  public TipoDePrenda getTipo() {
    return this.tipo;
  }

  public Material getMaterial() {
    return this.material;
  }

  public Colores getColorPrincipal() {
    return this.colorPrincipal;
  }

  public Colores getColorSecundario() {
    return this.colorSecundario;
  }

}


