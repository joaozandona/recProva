public class SobrecargaMetodo {
    public static void main(String[] args) {
        SobrecargaMetodo sobrecarga = new SobrecargaMetodo();
        System.out.println(sobrecarga.calcular(10, 5));
        System.out.println(sobrecarga.calcular(10, 5, 5));
    }
    public int calcular(int num1, int num2) {
        return num1 + num2;
    }
    public int calcular(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}