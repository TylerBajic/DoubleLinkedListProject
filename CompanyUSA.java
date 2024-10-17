package DoubleLinkedListProject;

public class CompanyUSA {
    private String name;
    private String address;
    private String sector;
    private double revenue;
    private double profit;
    private int employeeNum;
    private int rank;

    public CompanyUSA(int rank, String name, String sector, String address, double revenue, double profit, int employeeNum){
        this.rank = rank;
        this.name = name;
        this.sector = sector;
        this.address = address;
        this.revenue = revenue;
        this.profit = profit;
        this.employeeNum = employeeNum;
    }

    public void updateRank(int rank){
        this.rank = rank;
    }

    public void updateName(String name){
        this.name = name;
    }

    public void updateAddress(String address){
        this.address = address;
    }

    public void updateSector(String sector){
        this.sector = sector;
    }

    public void updateRevenue(double revenue){
        this.revenue = revenue;
    }

    public void updateProfit(double profit){
        this.profit = profit;
    }

    public void updateEmployeeNum(int num){
        this.employeeNum = num;
    }

    public int getRank(){
        return rank;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getSector(){
        return sector;
    }

    public double getRevenue(){
        return revenue;
    }

    public double getProfit(){
        return profit;
    }

    public int getEmployeeNum(){
        return employeeNum;
    }

    public String toString(){
        return "Rank: " + rank+ " Name: " + name+ " Sector: " + sector+ 
        " Address: " + address+ " Revenue: " + revenue + " Profit: " + profit +
        " Employee Number: " + employeeNum;
    }



}
