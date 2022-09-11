import java.io.File;

class Impressora extends Dispositivo {
  public void ImprimePaginas(File arquivo, int[] paginas) {
    if (status == Status.TRABALHANDO) {
      // avisar o usuario e cancelar a impressão atual
    }
    status = Status.TRABALHANDO;
    for (int i = 0; i < paginas.length; i++) {
      File pagParaImprimir = null;
      // logica para selecionar a pagina do arquivo
      // pagina a ser impressa = paginas[i]
      ImprimePagina(pagParaImprimir);
    }
    status = Status.ESPERA;
  }

  private void ImprimePagina(File pagina) {
    // logica que manda os caracteres para a impressora imprimir
  }
}