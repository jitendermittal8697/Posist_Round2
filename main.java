import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;
public class Node
{
    String date;
    int data;
    int nodeNumber;
    String nodeId;
    Node referenceNodeId;
    Node childReferenceNodeId1;
    Node childReferenceNodeId2;
    Node genesisReferenceNodeId;
    int HashValue;
    
    void stringToDate(String testDateString)
    {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try
        {
           //format() method Formats a Date into a date/time string. 
           Date d1 = df.parse(testDateString);
           System.out.println("Date: " + d1);
           System.out.println("Date in dd/MM/yyyy format is: "+df.format(d1));
        }
        catch (Exception ex ){
          System.out.println(ex);
        }
    }
    Node left, right;
    
    public void GenesisNode(int d)
    {
        data = d;
        childReferenceNodeId1 = childReferenceNodeId2 = null;
    }
    public void Node(int d)
    {
        data = d;
        childReferenceNodeId1 = childReferenceNodeId2 = null;
    }
    public void generateHashCode()
    {
        HashValue=generateString().hashCode();
    }
    public String generateString()
    {
        String str = date + data + nodeId + referenceNodeId + childReferenceNodeId1 + childReferenceNodeId2 + genesisReferenceNodeId;             
        return str;
        
    }
    public static void main(String[] args)
    {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();
        Node node6 = new Node();
        Node node7 = new Node();
        
        //Inserting Data
        node1.GenesisNode(32);
        node2.Node(5);
        node2.genesisReferenceNodeId=node1;
        node3.Node(7);
        node3.genesisReferenceNodeId=node1;
        node4.Node(3);
        node4.genesisReferenceNodeId=node1;
        node5.Node(2);
        node5.genesisReferenceNodeId=node1;
        node6.Node(4);
        node6.genesisReferenceNodeId=node1;
        node7.Node(1);
        node7.genesisReferenceNodeId=node1;
        
        
        //Creating Tree
        node1.childReferenceNodeId1=node2;
        node1.childReferenceNodeId2=node3;
        node2.childReferenceNodeId1=node4;
        node2.childReferenceNodeId2=node5;
        node3.childReferenceNodeId1=node6;
        node3.childReferenceNodeId1=node7;
        
        //Inserting Parent Node Reference
        node2.referenceNodeId=node1;
        node3.referenceNodeId=node1;
        node4.referenceNodeId=node2;
        node5.referenceNodeId=node2;
        node6.referenceNodeId=node3;
        node7.referenceNodeId=node3;
        
        //Inserting Node Number 
        node1.nodeNumber=1;
        node2.nodeNumber=2;
        node3.nodeNumber=3;
        node4.nodeNumber=4;
        node5.nodeNumber=5;
        node6.nodeNumber=6;
        node7.nodeNumber=7;
        
        //Generating Hashcode
        node1.generateHashCode();
        node2.generateHashCode();
        node3.generateHashCode();
        node4.generateHashCode();
        node5.generateHashCode();
        node6.generateHashCode();
        node7.generateHashCode();
        
        System.out.println("Tree Created Successfully");
    }
}
 
