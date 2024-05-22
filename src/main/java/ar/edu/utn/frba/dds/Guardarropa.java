package ar.edu.utn.frba.dds;

import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Guardarropa {
  public List<Prenda> prendas = new ArrayList<Prenda>();
  public ProveedorDeMotor proveedor;
  public Usuario usuario;

  public Guardarropa(Usuario usuario, ProveedorDeMotor proveedor) {
    if (usuario == null || proveedor == null) {
      throw new NullPointerException("No se puede crear un guardarropas con usuario o proveedor "
          + "nulos");
    }
    this.usuario = usuario;
    this.proveedor = proveedor;
  }


  public void agregarPrenda(Prenda prenda) {
    if (this.prendaValida(prenda)) {
      prendas.add(prenda);
    }
  }

  public List<Atuendo> generarSugerencias() {
    return this.proveedor.motorSugerencias.generarSugerencias(prendas, usuario);
  }

  private boolean prendaValida(Prenda prenda) {
    if (prenda == null) {
      return false;
    }

    return (prenda.material != null && prenda.colorPrincipal != null && prenda.trama != null);
  }

}
