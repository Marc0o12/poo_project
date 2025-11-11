package br.com.supermarket.pooprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("/listProduct")
    public String home() {
        return "product/listProduct"; // nome do template sem extensão
    }
}
