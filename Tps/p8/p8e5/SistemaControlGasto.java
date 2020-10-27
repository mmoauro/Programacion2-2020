package p8.p8e5;

import p8.p8e5.Criterio.Criterio;

import java.util.ArrayList;

public class SistemaControlGasto {
    private ArrayList<GastoAbs> gastos;

    public SistemaControlGasto () {
        this.gastos = new ArrayList<>();
    }

    public void addGasto (GastoAbs gasto) {
        this.gastos.add(gasto);
    }

    public ArrayList<GastoAbs> buscarGastos (Criterio criterio) {
        ArrayList<GastoAbs> retorno = new ArrayList<>();
        for (GastoAbs gasto:this.gastos)
            retorno.addAll(gasto.buscar(criterio));

        return retorno;
    }

    public double getDineroCriterio (Criterio criterio) {
        double total = 0;
        for (GastoAbs gasto:this.gastos) {
            if (gasto.buscar(criterio).size() > 0)
                total+=gasto.getMonto();
        }
        return total;
    }
}
