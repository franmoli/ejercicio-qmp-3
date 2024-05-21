package ar.edu.utn.frba.dds;

public class Borrador {
  TipoDePrenda tipo;
  Material material;
  Colores colorPrincipal;
  Colores colorSecundario;
  Trama trama = Trama.LISA;

  public Borrador(TipoDePrenda tipo) {
    if (tipo == null) {
      throw new NullPointerException("Tipo de prenda nulo");
    }
    this.tipo = tipo;
  }

  public void setMaterial(Material material) {
    if (material == null) {
      throw new NullPointerException("Material nulo");
    }
    this.material = material;
  }

  public void setColorPrincipal(Colores colorPrincipal) {
    if (colorPrincipal == null) {
      throw new NullPointerException("Color de prenda nulo");
    }
    this.colorPrincipal = colorPrincipal;
  }

  public void setColorSecundario(Colores colorSecundario) {
    if (colorSecundario == null) {
      throw new NullPointerException("Color de prenda nulo");
    }
    this.colorSecundario = colorSecundario;
  }

  public void setTrama(Trama trama) {
    if (trama == null) {
      throw new NullPointerException("Trama nula");
    }
    this.trama = trama;
  }


  public Prenda BuildPrenda (){
    return new Prenda(tipo, material, colorPrincipal, colorSecundario, trama);
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


