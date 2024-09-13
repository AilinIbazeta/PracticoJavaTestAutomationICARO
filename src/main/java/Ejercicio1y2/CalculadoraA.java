package Ejercicio1y2;

public class CalculadoraA {
        public int constructorQueSuma(int primerNumero, int segundoNumero) {return primerNumero + segundoNumero; }

        public int constructorQueResta(int primerNumero, int segundoNumero) {
            return primerNumero - segundoNumero;     }

        public int constructorQueMultiplica(int primerNumero, int segundoNumero) {
            return primerNumero * segundoNumero;     }

        public double constructorQueDivide(int primerNumero, int segundoNumero) {
            if (segundoNumero == 0) { System.out.println("¡Error! ¡No se puede dividir por cero!.");
                return Double.NaN; } return (double) primerNumero / segundoNumero; }

}
