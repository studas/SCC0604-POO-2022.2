package lista1;

import java.util.Scanner;

public class Smartphone {
    
    int id;
    Processor processor =  new Processor();
    TouchScreen touchScreen = new TouchScreen() ;
    SoundSystem soundSystem =  new SoundSystem();
    ComunicationSystem comunicationSystem =  new ComunicationSystem();
    Scanner input =  new Scanner(System.in);

    boolean isOn = true;
    int password = 123;
    
    Smartphone(int id){
        this.id = id;
        System.out.println("O Smartphone " + this.id + " foi criado!");
    }
    
    public void ShowId(){
        System.out.println(id);
    }

    public void TurnOff(){
        System.out.println("Deseja desligar o telefone? Digite 1 para sim e 0 para não!");
        int turnOff = input.nextInt();
        if(turnOff == 1){
            System.out.println("Digite a senha para desligar o aparelho.");
            int passwordInput = input.nextInt();
            if(passwordInput == password){
                isOn = false;
            }
        }
    }

    public boolean CheckIfIsOn(){
        return isOn;
    }
}
