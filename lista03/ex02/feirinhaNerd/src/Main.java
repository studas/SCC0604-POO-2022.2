

import java.util.ArrayList;
import Classes.*;

/**
 *
 * @author 12547187
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Produto> carrinho = new ArrayList<Produto>();
        
        Livro medo_vol_1 = new Livro(65, "e-livraria", "Compilado dos contos de horror classicos do escritor H.P.Lovecraft"," H.P.Lovecraft");
        carrinho.add(medo_vol_1);
        System.out.println(carrinho.get(0).getDescricao());
    }
}
