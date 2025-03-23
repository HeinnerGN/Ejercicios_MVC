package Vista;

import java.util.Scanner;

public class Vista {
    
    public void estadoAire(boolean aireprendido){
        if (aireprendido){
            System.out.println("Aire encendido");
        }
        else {
            System.out.println("Aire apagado");
        }
    }
    
    public boolean repetirproceso(){
        Scanner info = new Scanner(System.in);
        System.out.println("Quiere reperti el proceso? (s/n)");
        char user = info.next().toLowerCase().charAt(0);
        return user == 's';
    }
    
}
