package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExercises {
     public static ArrayList<String> shoppingList = new ArrayList<>();
     static Scanner scan = new Scanner(System.in);
     public static String items;
     public static int number;
     public static String deleteItem;

    public static void main(String[] args) {
        Menu();
    }
    public static void Menu(){
        System.out.println("=======Create your shopping list====== ");
        System.out.println("Chose your choice");
        System.out.println("1.Add items to your list");
        System.out.println("2.Delete items from your list");
        System.out.println("3.Show my list");
        System.out.println("4.Exit");
        int chose = scan.nextInt();
        switch (chose) {
            case 1:
                AddItems();
                break;
            case 2:
                DeleteItem();
                break;
            case 3:
                ShowList();
                break;
            case 4:
                break;
        }
    }
     public static void ShowList(){
        System.out.println("=======Your product list======");
         for(String product : shoppingList)
             System.out.println(product);
         System.out.println("=======Products that starts with 'm'=====");
         for(String m : shoppingList)
             System.out.println(m.startsWith("m"));
         Menu();
     }
     public static void AddItems() {
         System.out.println("How much items you want to add?");
         number = scan.nextInt();
         for (int i = 0; i < number; i++) {
             System.out.println("===Add a product===");
             items = scan.next().toLowerCase();
             if (shoppingList.contains(items)) {
                 System.out.println("You can't add it to your list,this item already exist");
             } else {
                 shoppingList.add(items);
                 System.out.println("Product added");
                 System.out.println();
             }
         }
         Menu();
    }
         public static void DeleteItem () {
             System.out.println("Write the item you want to delete: ");
             deleteItem = scan.next();
             if (shoppingList.contains(deleteItem)) {
                 shoppingList.remove(deleteItem);
                 System.out.println("Item was deleted");
             } else {
                 System.out.println("This item is not on the list");
                 System.out.println("Try again");
                 DeleteItem();
             }
             Menu();
         }
     }
