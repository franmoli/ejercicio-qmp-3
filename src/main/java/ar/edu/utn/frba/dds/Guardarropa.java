package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.List;


public class Guardarropa {
  public List<Prenda> prendas = new ArrayList<Prenda>();


  public void agregarPrenda(Prenda prenda) {
    if (this.prendaValida(prenda)) {
      prendas.add(prenda);
    }
  }

  private boolean prendaValida(Prenda prenda) {
    if (prenda == null) {
      return false;
    }

    return (prenda.material != null && prenda.colorPrincipal != null && prenda.trama != null);
  }

  public void mostrarGuardarropas() {
    System.out.println("Prenda guardada:");
    for (int i = 0; i < prendas.size(); i++) {
      int indice = i + 1;
      Prenda prenda = prendas.get(i);
      System.out.println("Prenda " + indice + ": ");
      System.out.println("Tipo " + prenda.tipo);
      System.out.println("Material " + prenda.material);
      System.out.println("Color principal " + prenda.colorPrincipal);
      System.out.println("Color secundario " + prenda.colorSecundario);
    }
  }
}
