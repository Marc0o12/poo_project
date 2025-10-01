package br.com.supermarket.pooprj.controller;

import br.com.supermarket.pooprj.model.Product;
import br.com.supermarket.pooprj.model.Dao.ProductDao;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.List;

public class PrimaryController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField quantityField;

    @FXML
    private TextField valueField;

    @FXML
    private TextArea productListArea;

    private final ProductDao dao = new ProductDao();

    @FXML
    public void handleSaveProduct() {
        try {
            String name = nameField.getText();
            long quantity = Long.parseLong(quantityField.getText());
            float value = Float.parseFloat(valueField.getText());

            Product p = new Product();
            p.setName(name);
            p.setQuantity(quantity);
            p.setValue(value);

            dao.save(p);

            nameField.clear();
            quantityField.clear();
            valueField.clear();

            updateProductList();

        } catch (NumberFormatException e) {
            productListArea.setText("Erro: Quantidade e Valor devem ser números.");
        }
    }

    @FXML
    public void initialize() {
        updateProductList();
    }

    private void updateProductList() {
        List<Product> products = dao.list();
        StringBuilder sb = new StringBuilder();
        for (Product p : products) {
            sb.append(p.toString()).append("\n");
        }
        productListArea.setText(sb.toString());
    }
}

