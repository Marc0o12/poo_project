package com.tecinfo.Servlet;

import com.tecinfo.model.Product;
import com.tecinfo.model.Dao.ProductDao;
import com.google.gson.Gson;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/produtos")
public class ProdutoServlet extends HttpServlet {
    private ProductDao dao = new ProductDao();
    private Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Product> produtos = dao.list();
        String json = gson.toJson(produtos);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(json);
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nome = request.getParameter("name");
        Float preco = Float.parseFloat(request.getParameter("value"));
        Long estoque = Long.parseLong(request.getParameter("quantity"));

        Product p = new Product();
        p.setName(nome);
        p.setValue(preco);
        p.setQuantity(estoque);

        int linhas = dao.save(p);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print("{\"sucesso\":" + (linhas == 1) + "}");
        out.flush();
    }
}

