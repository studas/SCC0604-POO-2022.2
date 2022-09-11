class Rede extends Dispositivo {
  byte[] access_code;
  
  public void enviaPacoteDeDados(byte[] data){
    for(int i = 0; i < access_code.length; i++){
      transmiteByte(access_code[i]);
    }
    byte[] header = criarHeader(data.length);
    for(int i = 0; i < header.length; i++){
      transmiteByte(header[i]);
    }
    for(int i = 0; i < data.length; i++){
      transmiteByte(data[i]);
    }
  }

  public void transmiteByte(byte data){
    //envia um byte pela rede
  }

  public byte[] criarHeader(int size){
    byte[] header = new byte[54];
    //logic to fill header based on information size
    return header;
  }
}