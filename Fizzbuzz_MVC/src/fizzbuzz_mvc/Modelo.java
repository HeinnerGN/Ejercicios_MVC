package fizzbuzz_mvc;

public class Modelo {
    
    public Modelo(String resultado[]){
        for (int i=1; i<=100; i++){
            if(i%3==0 && i%5==0){
                resultado[i-1]=("FizzBuzz");
            }
            else if (i%5==0){
                resultado[i-1]=("Fizz");
            }
            else if (i%3==0){
                resultado[i-1]="Buzz";
            }
            else{
                resultado[i-1] = String.valueOf(i);
            }
        }
    }
}
