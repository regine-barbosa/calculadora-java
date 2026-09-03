package calculadora;

public class Calculadora {
    private int primeiroNumero;
    private int segundoNumero;

    public Calculadora(int primeiroNumero, int segundoNumero){
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
    }

    public int getPrimeiroNumero() {
        return primeiroNumero;
    }

    public void setPrimeiroNumero(int primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public int somar(int primeiroNumero, int segundoNumero){
        return primeiroNumero + segundoNumero;
    }

    public int multiplicar(int primeiroNumero, int segundoNumero){
        return primeiroNumero * segundoNumero;
    }

    public int subtrair(int primeiroNumero, int segundoNumero){
        return primeiroNumero - segundoNumero;
    }

    public double dividir(int primeiroNumero, int segundoNumero){
        return primeiroNumero / segundoNumero;
    }

}
