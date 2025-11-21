package br.com.supermarket.pooprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VendaController {

    @GetMapping("/venda")
    public String home() {
        return "venda/vendas"; // nome do template sem extensão
    }
}