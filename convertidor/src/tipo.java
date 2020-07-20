import java.util.ArrayList;
import java.util.List;

public class tipo {
    String type;
    int idx;
    ArrayList<Conversion> conversiones = new ArrayList<>();

    public ArrayList<Conversion> getConversiones() {
        return conversiones;
    }

    public void setConversiones(ArrayList<Conversion> conversiones) {
        this.conversiones = conversiones;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public tipo (String type, int idx){
        this.type = type;
    this.idx = idx;}

    @Override
    public String toString() {
        return type;
    }
}
