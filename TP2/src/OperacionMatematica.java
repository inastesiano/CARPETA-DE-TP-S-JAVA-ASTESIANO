public class OperacionMatematica {
    private Double valor1;
    private Double valor2;
    private String operaciones;

    public double getvalor1() {
        return valor1;
    }

    public void setvalor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getvalor2() {
        return valor2;
    }

    public void setvalor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getoperaciones() {
        return operaciones;
    }

    public void setoperaciones(String operaciones) {
        this.operaciones = operaciones;
    }

    private double sumarNumeros() {
        return valor1 + valor2;
    }

    private double restarNumeros() {
        return valor1 - valor2;
    }

    private double multiplicarNumeros() {
        return valor1 * valor2;
    }

    private double dividirNumeros() {
        return valor1 / valor2;
    }

    public double aplicarOperacion(String operacion) {
        System.out.println("+ suma. - resta. * multiplicacion. / divicion");

        switch (operaciones) {
            case "+":
                return sumarNumeros();
            case "-":
                return restarNumeros();
            case "*":
                return multiplicarNumeros();
            case "/":
                return dividirNumeros();
            default:
                System.out.println("operaciones no validas");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        OperacionMatematica operacionMat = new OperacionMatematica();

        operacionMat.setvalor1(10.5);
        operacionMat.setvalor2(5.0);

        System.out.println("Suma: " + operacionMat.aplicarOperacion("+"));
        System.out.println("Resta: " + operacionMat.aplicarOperacion("-"));
        System.out.println("Multiplicación: " + operacionMat.aplicarOperacion("*"));
        System.out.println("División: " + operacionMat.aplicarOperacion("/"));
    }
}
