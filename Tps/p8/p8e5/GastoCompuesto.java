package p8.p8e5;

import p8.p8e5.Criterio.Criterio;

import java.util.ArrayList;

public class GastoCompuesto extends GastoAbs {

    private ArrayList<GastoAbs> gastos;

    public GastoCompuesto(String descripcion) {
        super(descripcion);
        this.gastos = new ArrayList<>();
    }


    public void addGasto (GastoCompuesto gasto) {
        this.gastos.add(gasto);
    }

    @Override
    public double getMonto () {
        int total = 0;
        for (GastoAbs g:this.gastos) {
            total += g.getMonto();
        }
        return total;
    }


    public ArrayList<GastoAbs> buscar (Criterio criterio) {
        ArrayList<GastoAbs> retorno = new ArrayList<>();
        if (criterio.cumple(this))
            retorno.add(this);

        for (GastoAbs gasto:this.gastos)
            retorno.addAll(gasto.buscar(criterio));

        return retorno;
    }

    @Override
    public String getDetalle() {
        String str = "";
        for (GastoAbs g:this.gastos) {
            str += g.getDetalle();
        }
        return str;
    }
}
