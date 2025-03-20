package Modelo;

public class Calculadora {
    
    public int Sumar(int num1, int num2){
        return num1 + num2;
    }
    
    public int Restar(int num1, int num2){
        return num1 - num2;
    }
    
    public int Multiplicar(int num1, int num2){
        return num1 * num2;
    }
    
    public int Dividir(int num1, int num2){
        if (num2!=0){
            return num1 / num2;
        }
        else{
            throw new ArithmeticException("Error. No se puede dividir entre 0.");
        }
    }
}
