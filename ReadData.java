package DoubleLinkedListProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ReadData {
    
    public void readFile(String filename, TWDoubleLinkedList<CompanyUSA>aList, int channel){
     
        try{
    Scanner file = new Scanner(new File(filename));
        while(file.hasNext()){
                
            int rank = file.nextInt();
            //System.out.println("Rank: " +rank);
            file.nextLine();
            String name = file.nextLine();
            //System.out.println("Name: " + name);
            
            String sector = file.nextLine();
            //System.out.println("Sector: " +sector);
           
            String address = file.nextLine();
            //System.out.println("Address" +address);
            
            double revenue = file.nextDouble();
            //System.out.println("Revenue: " +revenue);
            
            double profit = file.nextDouble();
            //System.out.println("Profit: " +profit);
            
            int employeeNum = file.nextInt();
            //System.out.println("Employee Number: " +employeeNum);

            try{
              
            CompanyUSA company = new CompanyUSA(rank, name, sector, address, revenue, profit, employeeNum);
            
            if(channel ==0){
        aList.addLast(company);
            }
            else{
        aList.addFirst(company);
            }
        }
        catch(InputMismatchException ime){

        }
    }
    file.close();
}
        catch(FileNotFoundException fnfe){
            System.out.println("Unable to find file");
        }
        catch(Exception ioe){
            ioe.printStackTrace();
        } 
      
}
}


    



            