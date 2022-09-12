package lista1;

import java.util.Scanner;

public class TouchScreen {


    int color = 0;
    Scanner input =  new Scanner(System.in);
    
    public void PrintScreen(){
        System.out.println("*CLICK* Um print foi capturado");
    }
    
    public void pressScreenButton(){
        int operation;
        System.out.println("Mudando a cor da tela...\nDigite um valor de 1 a 3:");
        operation = input.nextInt();
        ChangeColorScreen(operation);
    } 
    
    private void ChangeColorScreen(int operation){
        if(operation == 1){
            color = 1;
            System.out.println("A tela agora está azul");
        }else if(operation == 2){
            color = 2;
            System.out.println("A tela agora está vermelha");
        }else if(operation == 3){
            color = 3;
            System.out.println("A tela agora está verde");
        }else if (operation >= 4){
            System.out.println("Operação inválida");
        }
            
    }
    
}
