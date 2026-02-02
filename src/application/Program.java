package application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import db.DB;
import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        Department obj = new Department(1, "books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);

        System.out.println(obj);

        System.out.println(seller);

        DB.getConnection();

        scn.close();
    }
}
