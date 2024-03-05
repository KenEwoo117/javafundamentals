package com.fundementals.labs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionsLab {

    public static void main(String[] args){
        CollectionsLab myCollectionsLab = new CollectionsLab();
        //myCollectionsLab.stringArrayList();
        //HashSet<Integer> result = divisibleBy(100);
        //System.out.println("HashSet of integers divisible by 5:");
        //System.out.println(result);
        myCollectionsLab.bookHash();

    }

    public ArrayList<String> stringArrayList() {
        ArrayList<String> pizzaTime = new ArrayList<>();
        pizzaTime.add("Pepperoni");
        pizzaTime.add("Supreme");
        pizzaTime.add("Meat lovers");
        pizzaTime.add("Double Deckeroni");
        pizzaTime.add("Hawaiin chicken");
        pizzaTime.add("White Cheezy");
        pizzaTime.add("Backyard BBQ Chicken Pizza");
        pizzaTime.add("Buffalo Chicken Pizza");
        pizzaTime.add("BBQ Chicken");
        pizzaTime.add("Mad Dog");

        System.out.println(pizzaTime.size());


        for (String specialtyPizzas : pizzaTime) {
            System.out.println(specialtyPizzas);
        }
        return pizzaTime;
    }

    public static  HashSet<Integer> divisibleBy(int capacity) {
        if (capacity < 85) {
            capacity = 85;
        }

        HashSet<Integer> divisibleByFive = new HashSet<>();

        for (int i = 1; i<= capacity; i++) {
            if (i % 5 == 0) {
                divisibleByFive.add(i);
            }
        }
        return divisibleByFive;

    }

    public void bookHash() {
        HashMap<String, String> favoriteBooks = new HashMap<>();

        favoriteBooks.put("6257287405", "1984");
        favoriteBooks.put("1982111690", "Halo Contact Harvest");
        favoriteBooks.put("1982111615", "Halo the fall of Reach");
        favoriteBooks.put("0547928211", "The Fellowship of the Ring: Lord of the rings");
        favoriteBooks.put("0060776099", "Brave New World");
        favoriteBooks.put("0553381687", "A Game of Thrones");

        System.out.println("Favorite Books");
        for (HashMap.Entry<String, String> book : favoriteBooks.entrySet()) {
            System.out.println("ISBN: " + book.getKey() + ", Title: " + book.getValue());
        }
    }


}



