

import java.util.ArrayList;
import java.util.Iterator;

import Classes.*;

/**
 *
 * @author 12547187
 */
public class Main {
    public static void main(String[] args) {
        
        // Cadastro de estoque
        Livro livro_medo_classico_vol_1 = new Livro(
                80,
                "e-livraria", 
                "Compilado dos contos de horror classicos do escritor H.P.Lovecraft",
                "H.P.Lovecraft");
        
        Livro livro_o_brasil_nao_cabe_no_quintal_de_ninguem = new Livro(
                60,
                "e-livraria", 
                "Bastidores da vida de um economista brasileiro no FMI"
                        + "e nos BRICS e outros textos sobre nacionalismo "
                        + "e nosso complexo de viralata",
                "Paulo Nogueira Batista Jr.");
        
        Livro livro_2001_uma_odisseia_no_espaco = new Livro(
                85,
                "e-livraria", 
                "Um clássico absoluto da ficção científica, "
                        + "imortalizado nas telas do cinema por Stanley Kubrick",
                "Arthur C. Clarke");
        
        Livro livro_arsene_lupin_813 = new Livro(
                70,
                "e-livraria", 
                "Com a europa à beira da guerra,"
                        + "o ladrão de casaca vive sua aventura mais dramática",
                "Maurice Leblanc");
        
        Mouse mouse_wireless_generico = new Mouse(
                30,
                "magalu",
                "Mouse Óptico Sem Fio Usb para Pc e "
                        + "Notebook Inova Prata - tondelli",
                "óptico, sem fio com dongle"
        );
        
        Mouse mouse_IBM_retro = new Mouse(
                150,
                "magalu",
                "Mouse analógico-retrô sem Fio para PC,"
                        + "voltado para usuários saudosistas dos bons tempos da computação"
                        + "AVISO: Acompanha dongle PS2, driver para linux disponível Kernel 5.18+",
                "analógico sem fio com dongle ps2"
        );
        
        Mouse mouse_gamer = new Mouse(
                200,
                "kaploft",
                "Mouse óptico com RGB, brilha bastante "
                        + "e por isso aumenta seu desempenho nos jogos",
                "GAMER óptico com fio, conexão USB 2.0"
        );
        
        Mouse mouse_ozob = new Mouse(
                350,
                "magalu",
                "Mouse Óptico Sem Fio Usb para Pc e "
                        + "Notebook em formato de granada,"
                        + "edição especial aniversário Jovem Nerd",
                "óptico, bluetooth sem fio"
        );
        
        // Inicio da compra pelo cliente
        ArrayList<Produto> carrinho = new ArrayList<Produto>();
        
        carrinho.add(livro_medo_classico_vol_1);
        carrinho.add(livro_o_brasil_nao_cabe_no_quintal_de_ninguem);
        carrinho.add(mouse_IBM_retro);
        carrinho.add(mouse_gamer);
        carrinho.add(livro_2001_uma_odisseia_no_espaco);
        carrinho.add(livro_arsene_lupin_813);
        carrinho.add(mouse_wireless_generico);
        carrinho.add(mouse_ozob);
        
        
        // Visualização de o que há no carrinho
        Iterator<Produto> it = carrinho.iterator();
        
        while(it.hasNext()) {
            System.out.println("\nProduto no carrinho:");
            Produto sendo_visualizado = it.next();
            System.out.println(sendo_visualizado);
            System.out.println(sendo_visualizado.getDescricao());
        }
    }
}
