package p8.p8e5;

import p8.p8e5.Criterio.Criterio;

import java.time.LocalDate;
import java.util.ArrayList;

public class GastoSimple extends GastoAbs {
    private double monto;

    public GastoSimple (String descripcion, double monto) {
        super(descripcion);
        this.monto = monto;
    }

    @Override
    public double getMonto() {
        return this.monto;
    }

    @Override
    public ArrayList<GastoAbs> buscar(Criterio criterio) {
        ArrayList<GastoAbs> retorno = new ArrayList<>();
        if (criterio.cumple(this))
            retorno.add(this);
        return retorno;
    }

    @Override
    public String getDetalle() {
        String str = "";
        for (Caracteristica c:this.getCaracteristicas()) {
            str += c.getNombre() + ": " + c.getValor() +"\n";
        }
        return str;
    }
}
