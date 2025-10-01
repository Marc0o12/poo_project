package com.tecinfo;

import com.tecinfo.model.Product;
import com.tecinfo.model.Dao.ProductDao;

public class MainTestDAO {
    public static void main(String[] args) {
        ProductDao dao = new ProductDao();

        // Inserir produto
        Product p1 = new Product();
        p1.setName("Teclado Gamer");
        p1.setQuantity(5L);
        p1.setValue(149.99f);

        dao.save(p1);
        System.out.println("Produto inserido!");
    }
}
