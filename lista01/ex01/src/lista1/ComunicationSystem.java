package lista1;

import java.util.Scanner;

public class ComunicationSystem {

    Scanner input =  new Scanner(System.in);

    public boolean MakeCall(){

        System.out.println("Para qual número deseja ligar?");
        int number;
        number = input.nextInt();

        if(!CheckValidNumber(number)){
            System.out.println("Número inválido");
            return false;
        }else{
            return true;
        }
    }

    private boolean CheckValidNumber(int number){
        if((number>999999999)||(number<0)){
            return false;
        }
        return true;
    }
}
