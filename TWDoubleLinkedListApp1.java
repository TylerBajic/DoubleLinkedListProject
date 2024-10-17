package DoubleLinkedListProject;

import java.io.FileNotFoundException;


public class TWDoubleLinkedListApp1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Name: Tyler Bajic"); 
   
        
        ReadData read = new ReadData(); 
        TWDoubleLinkedList<CompanyUSA> aList = new TWDoubleLinkedList<CompanyUSA>(); 
        TWDoubleLinkedList<CompanyUSA> bList = new TWDoubleLinkedList<CompanyUSA>();
        
        read.readFile("companyList1.txt",aList, 0);
        read.readFile("companyList2.txt",bList, 1);
        
        System.out.println("Initial double linked list iterating forward:");
        aList.iterateForward();
        
        System.out.println("\nInitial double linked list iterating backward:");
        aList.iterateBackward();

        System.out.println("\n(1) Updated double linked list iterating forward:");
        bList.iterateForward();
        aList.iterateForward();

        System.out.println("\n(1) Updated double linked list iterating backward:");
        aList.iterateBackward();
        bList.iterateBackward();

        System.out.println("\n(2) Updated double linked list iterating forward:");
        bList.removeFirst();
        bList.removeFirst();
        bList.iterateForward();
        aList.removeLast();
        aList.removeLast();
        aList.iterateForward();

        System.out.println("\n(2) Updated double linked list iterating backward");
       aList.iterateBackward();
       bList.iterateBackward();
   
    }
}

    
    

