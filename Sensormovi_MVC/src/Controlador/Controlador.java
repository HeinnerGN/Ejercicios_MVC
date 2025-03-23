package Controlador;

import Modelo.Alarma;
import Modelo.Modelo;
import Vista.Vista;

public class Controlador {
    private Modelo modelo;
    private Vista vista;
    
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciarProceso() {
        boolean continuar = true;
        boolean denoche = true;
        
        while (continuar) {
            int opcion = vista.menuAlarma();
            
            switch (opcion) {
                case 1:
                    char accion = vista.opcion();
                    if (accion == 'a') {
                        denoche = true;
                    }
                    else if (accion == 'd') {
                        denoche = false;
                    }
                    else {
                        System.out.println("Error, opcion no valida.");
                    }
                    break;
                    
                case 2:
                    modelo.actualiSensores();
                    vista.estadoSensor(modelo.getSensores());
                    modelo.alarmaActiva(denoche);
                    vista.estadoAlarma(modelo.getAlarma());
                    break;
                    
                case 3:
                    System.out.println("Sistema apagado");
                    continuar = false;
                    break;
                    
                default:
                    System.out.println("Opcion no valida.");
            }
            
            if (continuar) {
                continuar = vista.continuarProceso();
            }
        }
        vista.cerrarScanner();
    }
}
