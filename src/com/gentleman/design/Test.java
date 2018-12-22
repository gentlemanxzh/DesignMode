package com.gentleman.design;

import com.gentleman.design.builder.StringBuilder;
import com.gentleman.design.factory.Product;
import com.gentleman.design.factory.fatorymethod.Factory;
import com.gentleman.design.factory.fatorymethod.ConcreteFactory1;
import com.gentleman.design.factory.simplefactory.SimpleFactory;
import com.gentleman.design.prototype.ConcretePrototype;
import com.gentleman.design.prototype.Prototype;

public class Test {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(2);
        System.out.println(product.productDetail());

        Factory factory;
        factory = new ConcreteFactory1();
        System.out.println(factory.createProduct().productDetail());

        StringBuilder stringBuilder = new StringBuilder();
        final int count = 26;
        for (int i = 0; i < count; i++) {
            stringBuilder.append((char) ('a' + i));
        }
        System.out.println(stringBuilder.toString());

        Prototype prototype = new ConcretePrototype("123");
        Prototype clonePrototype = prototype.myClone();
        System.out.println(clonePrototype.toString());

    }


}

