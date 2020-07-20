import java.util.ArrayList;

public class Conversion {
String conver;
float num;
int idx;
    ArrayList<Conversion2> conversiones2 = new ArrayList<>();

    public ArrayList<Conversion2> getConversiones2() {
        return conversiones2;
    }

    public void setConversiones2(ArrayList<Conversion2> conversiones2) {
        this.conversiones2 = conversiones2;
    }

    public String getConver() {
        return conver;
    }

    public float getNum() {
        return num;
    }

    public void setNum(float num) {
        this.num = num;
    }

    public void setConver(String conver) {
        this.conver = conver;
    }
    public Conversion(String conver, float num, int idx){
        this.conver = conver;
        this.num = num;
        this.idx=idx;
    }

    @Override
    public String toString() {
        return conver;
    }
}
