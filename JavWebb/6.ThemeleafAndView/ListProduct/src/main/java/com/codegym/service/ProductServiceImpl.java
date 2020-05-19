package com.codegym.service;

import com.codegym.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService{

    private static Map<Integer,Product> products;

    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Iphone6","200000","data:image/jpeg;base64,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"));
        products.put(2,new Product(2,"Iphone7","300000","https://genk.mediacdn.vn/thumb_w/640/2016/7plus1-1467729874928.jpg"));
        products.put(3,new Product(3,"Iphone10","500000","https://media.tintucvietnam.vn//uploads/medias/2017/09/14/600x600/150529531015259-iphone-x-colorsjpg-bb-baaadMPRc3.jpg"));
        products.put(4,new Product(4,"Huyen","TraiTimCuaHy","https://scontent.fdad3-3.fna.fbcdn.net/v/t1.15752-9/97098044_552015988833653_5166398366308892672_n.jpg?_nc_cat=111&_nc_sid=b96e70&_nc_ohc=zJDQd6YMkl4AX8aDsik&_nc_ht=scontent.fdad3-3.fna&oh=fa3fd1c45bc9360a4bbdddf33b122459&oe=5EE63810"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
