package com.tecinfo;

import java.util.List;

import com.tecinfo.model.Venda;
import com.tecinfo.model.Dao.VendaDao;

public class MainTestVenda {
     public static void main(String[] args) {
        VendaDao dao = new VendaDao();

        // Criar e salvar uma venda
        Venda v = new Venda();
        v.setName("Feijao");
        v.setPrice(12.50);
        v.setQuantity(5);
        dao.save(v);

        // Listar vendas
        List<Venda> vendas = dao.list();
        for (Venda venda : vendas) {
            System.out.println(venda);
        }
    }
}
