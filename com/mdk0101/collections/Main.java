package com.mdk0101.collections;


public class Main {
    public static void main(String[] args) {

        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.pushBack("qwerty");
        customLinkedList.pushBack("aboba");
        customLinkedList.pushBack("arbus");
        customLinkedList.pushUp("zzzzzzz");
        for (String el: customLinkedList) {
            System.out.printf("%s\t",el);
        }
        System.out.println();
        customLinkedList.pop(0);
        for (String el: customLinkedList) {
            System.out.printf("%s\t",el);
        }
    }
}
