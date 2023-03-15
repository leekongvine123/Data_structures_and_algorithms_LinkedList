/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class List {

    Scanner sc = new Scanner(System.in);
    Node p_Head = null;
    int size;

    public List() {

    }

    public List(Node n_Head) {
        this.p_Head = n_Head;
    }

    public boolean isEmpty() {
        if (this.p_Head == null) {
            return true;
        }
        return false;

    }

    void clear() {
        p_Head = null;
        size = 0;
    }

    boolean isExisting(int PhoneID) {
        Node node = p_Head;
        while (node != null) {
            if (node.p.getId() == PhoneID) {
                return true;
            }
            node = node.p_next;
        }
        return false;
    }

    public void display() {
        Node current = p_Head;
        if (isEmpty()) {
            System.out.println("The list is empty");
        }
        while (current != null) {
            System.out.println(current.p);
            current = current.p_next;
        }
        
    }

    public Phone addData() {
        System.out.print("Enter id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Enter year: ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.print("Enter amount: ");
        int amount = Integer.parseInt(sc.nextLine());
        Phone n = new Phone(id, name, price, amount, year);
        return n;
    }

    public void show() {
        Node current = p_Head;
        if (isEmpty()) {
            System.out.println("The List is emty");
        }
        while (current != null) {
            System.out.println("Id:" + current.p.getId());
            current = current.p_next;
        }

    }

    public void show2() {
        Node current = p_Head;
        if (isEmpty()) {
            System.out.println("The List is emty");
        }
        while (current != null) {
            if (current.p.getYear() > 2020) {
                System.out.println("Id:" + current.p.getId());
            }
            current = current.p_next;
        }
    }

    public void addFirst(Node o) {
        Node newest = o;
        if (isEmpty()) {
            p_Head = newest;

        } else {
            if (!isExisting(newest.p.getId())) {
                newest.setP_next(p_Head);
                p_Head = newest;
                size++;
            }
        }

    }

    public void addLast(Node o) {
        Node newest = o;
        Node current = p_Head;
        if (isEmpty()) {
            p_Head = newest;

        } else {
            if (!isExisting(newest.p.getId())) {
                while (current != null) {
                    if (current.p_next == null) {
                        current.setP_next(newest);
                        newest.setP_next(null);
                        size++;
                    }
                    current = current.p_next;
                }
            }
        }
    }
public void addNode(Node data, int phoneID) {
        Node curNode = p_Head;
        if (isEmpty()) {
            p_Head = data;
        }else if(!isExisting(phoneID)){
            while (curNode != null) {
                if (curNode.p.getId() == phoneID) {
                    data.p_next = curNode.p_next;
                    curNode.p_next = data;
                    break;
                }
                curNode = curNode.p_next;
            }
        }else{
            Node n =data;
            addLast(n);
        }
    }
    

    public Node deleteFirst(){
        if(p_Head != null){
            Node toDelete = p_Head;
            p_Head = p_Head.p_next;
            return toDelete;
        }
        return null;
    }

    public void deleteLast() {
        Node current = p_Head;
        if (isEmpty()) {
            System.out.println("The List is empty");
        }
        while (current != null) {
            if (current.p_next == null) {

                current.setP_next(null);
                current.p_next = null;

                size--;
            }

        }

    }

    void deleteNode(int phoneID) {
        Node current = p_Head;
        while (current != null) {
            if (current.p.getId() == phoneID) {
                delete(current);
                size--;
            }
            current = current.p_next;
        }
    }

    private void delete(Node o) {
        if (o == p_Head) {
            p_Head = p_Head.p_next;
            return;
        }
        Node e = p_Head;
        while (e != null && e.p_next != o) {
            e = e.p_next;
        }
        if (e != null) {
            e.p_next = e.p_next.p_next;
        }
    }

    public int search(String name) {
        Node current = p_Head;
        int count = 0;
        if (isEmpty()) {
            return count;
        }
        while (current != null) {
            if (current.p.getName().equals(name)) {
                count++;
            }
            current = current.p_next;
        }

        return count;
    }

    public Node MaxValue() {
    Node p_MaxNode = p_Head;
    Node p_Current = p_Head;
    while (p_Current != null) {
        if (p_Current.p.getPrice() * p_Current.p.getAmount() > p_MaxNode.p.getPrice() * p_MaxNode.p.getAmount()) {
            p_MaxNode = p_Current;
        }
        p_Current = p_Current.p_next;
    }
    return p_MaxNode;
}
}
