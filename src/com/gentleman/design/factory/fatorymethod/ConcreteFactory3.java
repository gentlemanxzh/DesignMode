package com.gentleman.design.factory.fatorymethod;

import com.gentleman.design.factory.Product;
import com.gentleman.design.factory.simplefactory.ConcreteProduct2;
import com.gentleman.design.factory.simplefactory.ConcreteProduct3;

public class ConcreteFactory3 implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct3();
    }
}
