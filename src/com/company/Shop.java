package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }



    public void addProduct(Product product) {           //метод, добавляющий товар в магазин
        int flag = 0;
        for (int i = 0; i < products.size(); i++) {
            if (product.getId() == products.get(i).getId()) {
                flag++;
            }
        }

        if (flag == 0) {
            products.add(product);
        }
    }

    public void getAll() {                                                      //метод, выводящий все товары в магазине
        for (int i = 0; i < products.size(); i++) {
            System.out.print(products.get(i).getId() + " ");
            System.out.print(products.get(i).getName() + " ");
            System.out.println(products.get(i).getPrice() + " ");
        }
    }

    public void removeById(int id) {                                            //метод, удаляющий товар по id
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                products.remove(products.get(i));
            }
        }
    }


    public void replaceProduct(Product product) { //метод, редактирующий товар
        boolean flag = true;
        for (int i = 0; i < products.size(); i++) {
            if (product.getName().equals(products.get(i).getName())) {
                products.set(i, product);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Такого товара в магазине нет");
        }

    }
}


