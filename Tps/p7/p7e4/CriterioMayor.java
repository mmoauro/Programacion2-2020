package p7.p7e4;

public class CriterioMayor implements Criterio {
    private String nombreCaracteristica;
    private Comparable valorBuscado;

    public CriterioMayor(String caracteristica, Comparable valorBuscado) {
        this.nombreCaracteristica = caracteristica;
        this.valorBuscado = valorBuscado;
    }
    @Override
    public boolean cumple(Planta planta) {
        if (planta.getCaracteristica(nombreCaracteristica) != null)
            return planta.getCaracteristica(nombreCaracteristica).getValor().compareTo(valorBuscado) > 0;
        return false;
    }
}
