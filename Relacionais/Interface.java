package Relacionais;

/**
 * uma Interface é vc colocar um terceiro para implementar os métodos
 * e alguns processamentos seus
 * como serão implementados não interessa
 */
public interface Interface {
    void soma(double operando1 , double operando2);
    void subtracao(double operando1 , double operando2);
    void multiplicacao(double operando1 , double operando2);
    void divisao(double operando1 , double operando2);
}
class Calculadora implements Interface{
    @Override
    public void soma(double operando1, double operando2) {
        System.out.println("Soma: " +(operando1+operando1));
    }
    @Override
    public void subtracao(double operando1, double operando2) {
        System.out.println("Subtração: " +(operando1-operando1));

    }
    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println("Multiplicação: "+(operando1*operando2));
    }
    @Override
    public void divisao(double operando1, double operando2) {
        System.out.println("Divisão: "+(operando1/operando2));
    }
}
