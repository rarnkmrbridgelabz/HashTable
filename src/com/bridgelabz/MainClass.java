package com.bridgelabz;

public class MainClass {
    public static void main(String[] args) {
        HashTable h = new HashTable();
        String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situtations";
        String[] arr = str.split(" ");
        for (String key : arr) {
            h.add(key);
        }
        h.display();
    }
}
