import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> cartas;

    public Mazo () {
        this.cartas = new ArrayList<>();
    }


    public void addCarta (Carta carta) {
        if (this.cartas.size() == 0) {
            cartas.add(carta);
        }
        else if (this.cartas.get(0).equals(carta)) {
            cartas.add(carta);
        }
        // Verifico que las cartas tengan los mismos atributos.
    }

    public void cargarMazo (String jsonFile) {
        //URL url = getClass().getResource(jsonFile);
        File jsonInputFile = new File(jsonFile);
        InputStream is;
        try {
            is = new FileInputStream(jsonInputFile);
            // Creo el objeto JsonReader de Json.
            JsonReader reader = Json.createReader(is);
            // Obtenemos el JsonObject a partir del JsonReader.
            JsonArray cartas = (JsonArray) reader.readObject().getJsonArray("cartas");
            for (JsonObject carta : cartas.getValuesAs(JsonObject.class)) {
                String nombreCarta = carta.getString("nombre");
                JsonObject atributos = (JsonObject) carta.getJsonObject("atributos");
                // Creo la carta
                Carta c1 = new Carta(nombreCarta);
                for (String nombreAtributo:atributos.keySet()) {
                    // Creo los atributos y se los agrego a la carta.
                    Atributo a1 = new Atributo(nombreAtributo, atributos.getInt(nombreAtributo));
                    c1.addAtributo(a1);
                }
                // Agrego la carta al mazo.
                this.addCarta(c1);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void mezclarCartas () {
        Collections.shuffle(this.cartas);
    }

    public void repartir (Jugador j1, Jugador j2) {
        for (int i = 0; i < this.cartas.size(); i++) {
            if (i % 2 == 0) {
                j1.addCarta(this.cartas.get(i));
            }
            else {
                j2.addCarta(this.cartas.get(i));
            }
        }
        // El mazo se vacia?
    }

    public Carta getPrimerCarta () {
        if (this.cartas.size() > 0) {
            return this.cartas.get(0);
        }
        return null;
    }

    public int getCantidadCartas () {
        return this.cartas.size();
    }
    public void removePrimerCarta () {
        this.cartas.remove(0);
    }
}
