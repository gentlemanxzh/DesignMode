package com.gentleman.design.factory.simplefactory;

import com.gentleman.design.factory.Product;

public class ConcreteProduct2 implements Product {

    @Override
    public String productDetail() {
        return "ConcreteProduct2";
    }
}
