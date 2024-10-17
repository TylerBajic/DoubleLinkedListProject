package DoubleLinkedListProject;

public class TWDoubleLinkedListApp2 {
    public static void main(String[] args) {
        ReadData read = new ReadData();

        TWDoubleLinkedList<CompanyUSA> aList = new TWDoubleLinkedList<>();

        read.readFile("companyList1.txt", aList, 0);
        System.out.println("Name: Tyler Bajic");
        
        System.out.println("Initial double linked list iterating forward:");
        aList.iterateForward();

        System.out.println("\nNumber of nodes in the list: "+ aList.getSize());
        System.out.println("Node with index 0:" +aList.getIndexNodeData(0));
        System.out.println("Node with index 3:" +aList.getIndexNodeData(3));
        System.out.println("Node with index 8:" +aList.getIndexNodeData(8));
        System.out.println("Node with index 9:" +aList.getIndexNodeData(9));
        

        System.out.println("\nRemoving node with index 0 "+aList.removeNodeAtIndex(0));
        System.out.println("Removing node with index 3 "+aList.removeNodeAtIndex(3));
        System.out.println("Removing node with index 5 "+aList.removeNodeAtIndex(5));
        System.out.println(aList.removeNodeAtIndex(6));

        System.out.println("\n(1) Updated double linked list iterating forward");
        aList.iterateForward();

        System.out.println("\n(1) Updated double linked list iterating backward");
        aList.iterateBackward();

        System.out.println("\nUpdating node with index 1");
        aList.getIndexNodeData(1).updateName("New company 1");
        aList.getIndexNodeData(1).updateAddress("New address 1 USA");
        aList.getIndexNodeData(1).updateEmployeeNum(20000);
        aList.getIndexNodeData(1).updateProfit(2000.5);
        aList.getIndexNodeData(1).updateRevenue(50000.2);

        System.out.println("\n(2) Updated double linked list iterating forward:");
        aList.iterateForward();

        System.out.println("\n(2) Updated double linked list iterating backward:");
        aList.iterateBackward();


    }
}
