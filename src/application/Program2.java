package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        /*INSERT funcionando
        Department department = new Department(6, "Football");
        departmentDao.insert(department);
        System.out.println("INSERT completed!");
        */

        /* FindById funcionando
        Department department = departmentDao.findById(4);
        System.out.println(department);
        */

        /* UPDATE funcionando
        Department department = departmentDao.findById(2);
        department.setName("Food");
        departmentDao.update(department);
        */

        /* DELETE funcionando
        Department department = departmentDao.findById(3);
        departmentDao.deleteById(department.getId());
        */

        /*  FindAll Funcionando
        List<Department> list = departmentDao.findAll();
        for (Department dp : list) {
            System.out.println(dp);
        }
        */

        scn.close();
    }
}
