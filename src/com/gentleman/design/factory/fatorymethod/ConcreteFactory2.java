package com.gentleman.design.factory.fatorymethod;

import com.gentleman.design.factory.Product;
import com.gentleman.design.factory.simplefactory.ConcreteProduct1;
import com.gentleman.design.factory.simplefactory.ConcreteProduct2;

public class ConcreteFactory2 implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
