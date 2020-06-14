package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByGet implements Comparator <Product>{
    @Override
    public int compare(Product o1, Product o2) {
        List<Product> products = new ArrayList<>();
        products.add(o1);
        products.add(o2);
        if(products.indexOf(o1)<products.indexOf(o2)){
            return -1;
        } else return 1;
    }
}
