package br.com.supermarket.pooprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @GetMapping("/listProduct")
    public String home() {
        return "product/listProduct"; // nome do template sem extensão
    }
    
    @DeleteMapping("/deleteProduct/{id}")
    public String delete(@PathVariable Long id) {
        return "redirect: product/listProduct"; // nome do template sem extensão
    }
}
