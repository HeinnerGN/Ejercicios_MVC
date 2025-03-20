package Controlador;

import Vista.Vista;
import Modelo.Calculadora;

public class Controlador {
    private Vista vista;
    private Calculadora calcu;
    
    public Controlador(Calculadora calcu, Vista vista){
        this.calcu = calcu;
        this.vista = vista;
    }
    
    public void comenzarOpe(){
        while (true) {
            int num1 = vista.pedirnum("Ingrese el primer numero:");
            int num2 = vista.pedirnum("Ingrese el segundo numero:");
            String op = vista.pedirOperacion();

            int result= 0;
            try{
                switch (op) {
                case "sumar":
                    result = calcu.Sumar(num1, num2);
                    break;
                case "restar":
                    result = calcu.Restar(num1, num2);
                    break;
                case "multiplicar":
                    result = calcu.Multiplicar(num1, num2);
                    break;
                case "dividir":
                    result = calcu.Dividir(num1, num2);
                    break;
                default:
                    vista.mostrarError("Operacion no valida.");
                    continue;
            }
            vista.Mostrarinfo(result);
            
            } catch (ArithmeticException e){
                vista.mostrarError(e.getMessage());
            }
            if (!vista.repetir()){
                vista.fuera();
                break;
            }
        }
    }
}
