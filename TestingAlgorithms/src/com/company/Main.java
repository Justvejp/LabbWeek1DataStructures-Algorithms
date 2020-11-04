package com.company;

public class Main {

    /**
     * Nu har vi skapat en stack, som har linkedList funktionerna, du kan skapa en que, eller en stack
     * eller bara en linkedList om du vill testa allt.
     * Använde "My" för att inte intellij ska misstolka namnen mot sina "egna".
     * Kunde extendat åt andra hållet om du ville vi skulle skapa en linkedList som har funktionerna av en stack eller kö
     * men gjorde såhär nu för att kunna testa med båda två.
     */

    public static void main(String[] args) {

        MyStack list = new MyStack();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.size());

        list.add(0, 99);

        System.out.println(list.size());

        System.out.println(list.get(0));
        System.out.println(list.get(3));

        list.remove(3);

        System.out.println(list.size());
        System.out.println(list.isEmpty());

        //ta bort printList metoden i MyLinkedList
    }
}
