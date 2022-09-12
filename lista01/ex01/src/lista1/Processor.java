package lista1;

import java.util.Random;

public class Processor {
    
    Random random = new Random();
    int temperature;
    
    private void ProcessThings(){
        System.out.println("Processing...");
    }
    
    public void ShowProcessorTemperature(){
        ProcessThings();
        System.out.println("Temperatura do processador:" + GetCurrentTemperature());
    }
    
    private int GetCurrentTemperature(){
        temperature = random.nextInt(50)+50;
        return temperature;
    }
}
