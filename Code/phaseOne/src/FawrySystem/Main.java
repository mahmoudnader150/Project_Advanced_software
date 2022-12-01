package FawrySystem;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Admin ad=new Admin("admin","1234","admin@fawry");
    public static void main(String[] args) {

        System.out.println("Welcome to Fawry System");
        Customer c=new Customer("seif","a@3","123");
        Customer c2=new Customer("seif","a@3","123");
        Customer c3=new Customer("seif","a@3","123");
        Customer c4=new Customer("seif","a@3","123");
    }
}
