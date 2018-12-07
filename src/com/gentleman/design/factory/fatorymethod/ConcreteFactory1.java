package com.gentleman.design.factory.fatorymethod;

import com.gentleman.design.factory.Product;
import com.gentleman.design.factory.simplefactory.ConcreteProduct1;

public class ConcreteFactory1 implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
