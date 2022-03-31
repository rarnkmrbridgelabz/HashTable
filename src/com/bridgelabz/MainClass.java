package com.bridgelabz;

public class MainClass {
    public static void main(String[] args) {
        HashTable h = new HashTable();
        String str = "To be or not to be";
        String[] arr = str.split(" ");
        for (String key : arr) {
            h.add(key);
        }
        h.display();
    }
}
