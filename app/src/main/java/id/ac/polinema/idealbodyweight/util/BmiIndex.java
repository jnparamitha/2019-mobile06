package id.ac.polinema.idealbodyweight.util;

public class BmiIndex
{
    private float cek;
    private float massa;
    private float height;

    public BmiIndex(float massa, float height) {
        this.massa = massa;
        this.height = height;
        this.calculate();
    }

    private float calculate() {
        return this.cek = this.massa / (this.height * this.height);
    }
    public String bmiideal() {
        String m = "";
        if (this.cek < 18.50) {
            m = "Underweight";
        } else if (this.cek >= 18.50 && this.cek <= 24.99) {
            m = "Healty Weight";
        } else if (this.cek >=25 && this.cek <= 29.99) {
            m = "Pre-obese";
        }else if (this.cek >= 30 && this.cek <=34.99){
            m = "obese class 1";
        }else if (this.cek >= 40 && this.cek <=39.99){
            m = "obese class 2";
        }else if (this.cek >= 40){
            m = "obese class 3";
        }
        return m;
    }
}
