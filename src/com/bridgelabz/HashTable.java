package com.bridgelabz;

public class HashTable {
    MyMapNode head,tail;
    public int get(String key){
        MyMapNode temp = head;
        while(temp != null){
            if(temp.key.equals(key))
                return temp.value;
            temp = temp.next;
        }
        return 0;
    }
    public int getSize(){
        MyMapNode temp = head;
        int size = 1;
        while (temp.next != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    public void add(String key){
        if(head == null) {
            MyMapNode newNode = new MyMapNode(key);
            head = newNode;
            tail = newNode;
        }
        else {
            int present = get(key);
            if (present == 0) {
                MyMapNode newNode = new MyMapNode(key);
                tail.next = newNode;
                tail = newNode;
            }
            else {
                MyMapNode temp = head;
                while(temp != null){
                    if(temp.key.equals(key))
                        temp.value = present+1;
                    temp = temp.next;
                }
            }
        }
    }
    public void display(){
        MyMapNode temp = head;
        while (temp != null){
            System.out.print(temp.key+"["+temp.value+"]->");
            temp = temp.next;
        }
        System.out.println("\n");
    }
}
