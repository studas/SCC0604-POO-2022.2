class Dispositivo {
  enum Status {
    DESLIGADO, TRABALHANDO, ESPERA, ERROR;
  }

  Status status = Status.DESLIGADO;

  public boolean executaTeste() {
    boolean dispositivo_funciona = false;
    // logica para testar se um dispositivo funciona
    // tenta enviar e receber informações
    dispositivo_funciona = true;
    
    
    return dispositivo_funciona;
  }
 
  public void ligaDispositivo(){
    //logica de inicialização de dipositivo
    status = Status.ESPERA;
  }

  public Status verificaStatus(){
    return status;
  }
}