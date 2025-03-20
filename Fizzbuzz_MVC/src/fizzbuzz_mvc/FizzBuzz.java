package fizzbuzz_mvc;

public class FizzBuzz {
    private String[] guardar;
    public FizzBuzz(String resultado[]){
        this.guardar = new String[100];
        for (int i=0; i<100; i++){
            this.guardar[i] = resultado[i];
            
        }
    }
}
