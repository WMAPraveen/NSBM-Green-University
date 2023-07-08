package com.mycompany.mainitem;

public class MainItem {

    public static void main(String[] args) 
    {
      Item item = new Item(10, "Avishka");
        System.out.println(item.getLocation());
        System.out.println(item.getDescription());
        
        Monster monster = new Monster(20, "Praveen");
        System.out.println(monster.getLocation());
        System.out.println(monster.getDescription());
    }
}
