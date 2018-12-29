
import java.util.ArrayList;

/**
 * The Node class represents a node
 * As well as an ArrayList of nodes that will store
 * any instantiated nodes children.
 */
public class Node {

    //    A Unique Identifier for our node
    public String nodeName;


    Node leftChild;
    Node rightChild;

    /**
     * Constructor
     * @param nodeName name of the node
     * @param leftChild
     * @param rightChild
     */
    public Node(String nodeName, Node leftChild, Node rightChild){
        this.nodeName = nodeName;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    /**
     * getChildren
     * @return the children of this node
     */
    public ArrayList<Node> getChildren(){
        ArrayList<Node> childNodes = new ArrayList<>();
        if(this.leftChild != null)
        {
            childNodes.add(leftChild);
        }
        if(this.rightChild != null) {
            childNodes.add(rightChild);
        }
        return childNodes;
    }

    /**
     * removeChild
     * @param n the node
     * @return
     */
    public boolean removeChild(Node n){
        return false;
    }

}