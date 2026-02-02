package application;

import java.util.Locale;
import java.util.Scanner;

import db.DB;
import model.entities.Department;

public class Program {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        Department obj = new Department(1, "books");
        System.out.println(obj);
        DB.getConnection();

        scn.close();
    }
}
