package com.gentleman.design;

import com.gentleman.design.factory.Product;
import com.gentleman.design.factory.fatorymethod.Factory;
import com.gentleman.design.factory.fatorymethod.ConcreteFactory1;
import com.gentleman.design.factory.simplefactory.SimpleFactory;

public class Test {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(2);
        System.out.println(product.productDetail());

        Factory factory;
        factory = new ConcreteFactory1();
        System.out.println(factory.createProduct().productDetail());
    }


}

