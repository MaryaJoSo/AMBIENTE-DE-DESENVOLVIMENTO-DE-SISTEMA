public class CalculadoraDivisao {
    public double dividir(double a, double b) {
        return a / b;
    }

    public double dividir(double a, double b, double c) {
        return a / (b * c);
    }

    public static void main(String[] args) {
        CalculadoraDivisao calculadora = new CalculadoraDivisao();
        double resultadoDivisao = calculadora.dividir(10.0, 2.0);
        double resultadoDivisaoComposto = calculadora.dividir(20.0, 4.0, 2.0);
        System.out.println("Resultado da divisão: " + resultadoDivisao);
        System.out.println("Resultado da divisão composta: " + resultadoDivisaoComposto);
    }
}