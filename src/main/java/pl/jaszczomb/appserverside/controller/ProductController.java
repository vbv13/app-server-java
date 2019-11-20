package pl.jaszczomb.appserverside.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.jaszczomb.appserverside.collection.Product;
import pl.jaszczomb.appserverside.mapper.ProductMapper;
import pl.jaszczomb.appserverside.service.ProductService;

import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductMapper productMapper;

    @GetMapping("shop")
    public List<Product> showProducts(Req req) {
        return resp;
    }

    @GetMapping("articles")
    public List<Product> getRecentSoldProducts(Req req) {
        return resp;
    }

    @GetMapping("articles/{id}")
    public Product getArticle(Long id) {
        return resp;
    }

    @PostMapping("article")
    public Product saveProduct(Req req) {
        return resp;
    }

    @PostMapping("sort")
    public void addProcuctSort(Req req) {

    }

    @GetMapping("sorts")
    public List<Product> getBySort(Req req) {
        return resp;
    }

    @PostMapping("brand")
    public void addProcuctBrand(Req req) {

    }

    @GetMapping("brands")
    public List<Product> getByBrand(Req req) {
        return resp;
    }
}
