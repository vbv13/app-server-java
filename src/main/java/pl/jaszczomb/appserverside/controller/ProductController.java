package pl.jaszczomb.appserverside.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.jaszczomb.appserverside.dto.BrandDto;
import pl.jaszczomb.appserverside.dto.ProductDto;
import pl.jaszczomb.appserverside.dto.SortDto;
import pl.jaszczomb.appserverside.dto.temp.ProductFilterDto;
import pl.jaszczomb.appserverside.mapper.BrandMapper;
import pl.jaszczomb.appserverside.mapper.ProductMapper;
import pl.jaszczomb.appserverside.mapper.SortMapper;
import pl.jaszczomb.appserverside.service.BrandService;
import pl.jaszczomb.appserverside.service.ProductService;
import pl.jaszczomb.appserverside.service.SortService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("product")
public class ProductController {

    @Autowired private ProductService productService;
    @Autowired private ProductMapper productMapper;
    @Autowired private SortService sortService;
    @Autowired private SortMapper sortMapper;
    @Autowired private BrandService brandService;
    @Autowired private BrandMapper brandMapper;

    @GetMapping("shop")
    public List<ProductDto> showProducts(@RequestBody ProductFilterDto filterDto) {
        return productMapper.mapToProductDtoList(productService.getProducts(filterDto));
    }

    @GetMapping("articles")
    public List<ProductDto> getRecentSoldProducts() {
        return productMapper.mapToProductDtoList(productService.getRecentProducts());
    }

    @GetMapping("all")
    public List<ProductDto> getAllProducts() {
        return productMapper.mapToProductDtoList(productService.getAllProducts());
    }

    @GetMapping("articles/{id}")
    public ProductDto getArticle(@PathVariable String id) {
        return productMapper.mapToProductDto(productService.getProduct(id).orElseThrow());
    }

    @PostMapping("article")
    public ProductDto saveProduct(@RequestBody ProductDto productDto) {
        return productMapper.mapToProductDto(productService.saveProduct(productMapper.mapToProduct(productDto)));
    }

    @PostMapping("sort")
    public void addProductSort(@RequestBody SortDto sortDto) {
        sortService.saveSort(sortMapper.mapToSort(sortDto));
    }

    @GetMapping("sorts")
    public List<SortDto> getSorts() {
        return sortMapper.mapToSortDtoList(sortService.getSorts());
    }

    @PostMapping("brand")
    public void addProductBrand(@RequestBody BrandDto brandDto) {
        brandService.saveBrand(brandMapper.mapToBrand(brandDto));
    }

    @GetMapping("brands")
    public List<BrandDto> getBrands() {
        return  brandMapper.mapToBrandDtoList(brandService.getBrands());
    }
}
