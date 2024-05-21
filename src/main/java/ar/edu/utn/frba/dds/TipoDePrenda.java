package ar.edu.utn.frba.dds;

public enum TipoDePrenda {

  ZAPATO {
    @Override
    public CategoriaPrenda getTipo() {
      return CategoriaPrenda.CALZADO;
    }
  },
  PANTALON {
    @Override
    public CategoriaPrenda getTipo() {
      return CategoriaPrenda.PARTE_INFERIOR;
    }
  },
  REMERA {
    @Override
    public CategoriaPrenda getTipo() {
      return CategoriaPrenda.PARTE_SUPERIOR;
    }
  },
  CAMISA_MANGAS_CORTAS {
    @Override
    public CategoriaPrenda getTipo() {
      return CategoriaPrenda.CALZADO;
    }
  };

  public abstract CategoriaPrenda getTipo();
}


