package application;

import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        scn.close();
    }
}
