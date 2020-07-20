public class Conversion2 {
    String conver2;
    float sum;
    int idx;

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public String getConver2() {
        return conver2;
    }

    public void setConver2(String conver2) {
        this.conver2 = conver2;
    }
    public Conversion2(String conver2, float sum, int idx){
        this.conver2 = conver2;
        this.sum = sum;
        this.idx = idx;
    }

    @Override
    public String toString() {
        return conver2;
    }
}
