package lista1;

public class SoundSystem {

    public void CallRing(){
        Ring(3);
    }
    private void Ring(int timesOfRings){
        for(int i = 0;i<timesOfRings;i++){
            System.out.println("Triimmmmm! ...");
        }
        System.out.println("\n");
    }
    
}
