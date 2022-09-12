package lista1;

public class Lista1 {


    public static void main(String[] args) {

        System.out.println("\n");

        Smartphone smartphone1 =  new Smartphone(1);

        smartphone1.TurnOff();
        

        while(smartphone1.CheckIfIsOn()){

            System.out.println("\n");
            
            smartphone1.processor.ShowProcessorTemperature();

            System.out.println("\n");
            
            smartphone1.touchScreen.pressScreenButton();

            System.out.println("\n");

            if(smartphone1.comunicationSystem.MakeCall()){
                System.out.println("\n");
                smartphone1.soundSystem.CallRing();
            }
            
            smartphone1.TurnOff();
            
        }
        
    }
    
}
