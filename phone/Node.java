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
public class Node {
    Phone p;
    Node p_next;
    public Node(){
        
    }

    public Node(Phone p, Node p_next) {
        this.p = p;
        this.p_next = p_next;
    }

    public Phone getP() {
        return p;
    }

    public void setP(Phone p) {
        this.p = p;
    }

    public Node getP_next() {
        return p_next;
    }

    public void setP_next(Node p_next) {
        this.p_next = p_next;
    }

    @Override
    public String toString() {
        return "Node{" + "p=" + p + "}";
    }

    
    
    
}
