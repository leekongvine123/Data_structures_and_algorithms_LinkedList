/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        List l = new List();
        System.out.println("Enter Phone:");
        l.addFirst(new Node(l.addData(), null));
        System.out.println("\n");
        l.addLast(new Node(l.addData(), null));
        System.out.println("\n");
      l.addLast(new Node(l.addData(), null));
        System.out.println("\n");
        l.addFirst(new Node(l.addData(), null));
//        System.out.println("\n");
//        l.addLast(new Node(l.addData(), null));
//        System.out.println("\n");
//        l.addLast(new Node(l.addData(), null));
//        System.out.println("\n");
        l.display();
        System.out.println("ADD Node after node with id is 2:");
        l.addNode(new Node(l.addData(), null), 2);
        l.display();
        System.out.println("\n");
        System.out.println("Delete Node with id = 1");
        l.deleteNode(1);
        l.display();
        System.out.println("\n");
        System.out.println("Delte first");
        l.deleteFirst();
        l.display();
        System.out.println("\n");
        System.out.println("Search number of name = Thanh");
        System.out.println(l.search("Thanh"));
        System.out.println("\n");
        System.out.println("Maxvalue:");
        System.out.println(l.MaxValue());
        System.out.println("\n");
        System.out.println("Is empty or not:");
        System.out.println(l.isEmpty());
        System.out.println("\n");
        System.out.println("show:");
        l.show();
        System.out.println("\n");
        System.out.println("Show 2:");
        l.show2();

    }
}
