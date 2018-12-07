package com.gentleman.design.factory.simplefactory;

import com.gentleman.design.factory.Product;

/**
 *
 */
public class SimpleFactory {

    public Product createProduct(int type) {
        Product product = null;
        switch (type) {
            case 1:
                product = new ConcreteProduct1();
                break;
            case 2:
                product = new ConcreteProduct2();
                break;
            case 3:
                product = new ConcreteProduct3();
                break;
        }
        return product;
    }
}
