package com.telusko.simpleWebApp.Service;

import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Iphone", 50000),
//            new Product(102, "Canon Camera", 70000),
//            new Product(103, "Samsung s-24 Ultra", 120000)
//    ));
    public List<Product> getProducts(){
        return repo.findAll();
    }

//    public Product getProductById(int prodId) {
//        return products.stream()
//                .filter(p->p.getProdId()==prodId)
//                .findFirst().orElse(new Product(100,"No Item",0));
//    }
    //for above now we will use jpa
    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }
    public void addProduct(Product prod){
//        products.add(prod);  Now in next line we will again use spring data jpa to add product
        repo.save(prod);
    }

//    public void updateProduct(Product prod) {
//        int index=0;
//        for(int i=0;i<products.size();i++)
//            if(products.get(i).getProdId()==prod.getProdId())
//                index=i;
//        products.set(index,prod);
//    }
    //In next line we will use spring data jpa to update product in database
    public void updateProduct(Product prod) {
        repo.save(prod);
}

//    public void deleProduct(int prodId) {
//        int index=0;
//        for(int i=0;i<products.size();i++)
//            if(products.get(i).getProdId()==prodId)
//                index=i;
//        products.remove(index);
//
//    }
    //In next line we will use spring data jpa to delete Product
    public void deleProduct(int prodId) {
        repo.deleteById(prodId);

    }
}
