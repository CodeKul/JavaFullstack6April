package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.Scanner;

public class Project {
    long id;
    String name;
    String address;
    long contact;
    int age;
    LocalDate birthDate;
    String gender;
    String disease;


    public static void main(String[] args) {
        System.out.println("Wel - come to healthcare ");
        Project p= new Project();

        p.menu();
    }


    private void addPatient() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the patient information");
            System.out.println("Enter value of id");
            id = scanner.nextLong();
            System.out.println("Enter value of name");
            name = scanner.next();
            System.out.println("Enter value of address");
            address = scanner.next();
            System.out.println("Enter value of contact");
            contact = scanner.nextLong();
            System.out.println("Enter value of age");
            age = scanner.nextInt();
            System.out.println("Enter value of birth date");
            birthDate = LocalDate.parse(scanner.next());
            System.out.println("Enter value of Gender");
            gender = scanner.next();
            System.out.println("Enter value of disease");
            disease = scanner.next();


            Class.forName("com.mysql.cj.jdbc.Driver");//registering driver

            Connection connection
                    = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcare", "root3", "password");

            String insert = "insert into patient(id,name,address,contact,age,birthdate,gender,disease) values(?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setLong(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, address);
            preparedStatement.setLong(4, contact);
            preparedStatement.setInt(5, age);
            preparedStatement.setString(6, birthDate.toString());
            preparedStatement.setString(7, gender);
            preparedStatement.setString(8, disease);

            int i = preparedStatement.executeUpdate();
            System.out.println("patient saved successfully." + i);
            System.out.println("do you want to continue.. type Y or N");
            char choice;
            choice = scanner.next().charAt(0);
            if(choice=='Y'){
                diagnosis();
            }else {
                menu();
            }


        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    private void diagnosis() {
        System.out.println("Enter the details of diagnosis");


    }

    private void addHistory() {

    }

    private void bill() {


    }

    private void infoOfHospital() {

        System.out.println("Sahyadri Hospital Pune");
        System.out.println("Contact Number - 342044 ");
    }

    private  void menu() {

        int choice;
        System.out.println("Select the menu--");
        Scanner scanner = new Scanner(System.in);

        System.out.print("\t\t\t\t\t\t|             1  >> Add New Patient Record                        |\n");
        System.out.print("\t\t\t\t\t\t|             2  >> Add Diagnosis Information                     |\n");
        System.out.print("\t\t\t\t\t\t|             3  >> History of the Patient                        |\n");
        System.out.print("\t\t\t\t\t\t|             4  >> Bill of the patient                           |\n");
        System.out.print("\t\t\t\t\t\t|             5  >> Information About the Hospital                |\n");
        System.out.print("\t\t\t\t\t\t|             6  >> Exit		                                    |\n");

        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addPatient();
                break;
            case 2:
                diagnosis();
                break;
            case 3:
                addHistory();
                break;
            case 4:
                bill();
                break;
            case 5:
                infoOfHospital();
                break;
            case 6:
                System.out.println("exit");
                System.exit(0);
        }

    }
}


/**
 *
 *
 mysql> use healthcare;
 Database changed
 mysql> reate table patient(id int, name varchar(30),address varchar(30),contact bigint,age int ,date birthdate,gender varchar(30),disease varchar(30));
 ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'reate table patient(id int, name varchar(30),address varchar(30),contact bigint,' at line 1
 mysql> create table patient(id int, name varchar(30),address varchar(30),contact bigint,age int ,date birthdate,gender varchar(30),disease varchar(30));
 ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'birthdate,gender varchar(30),disease varchar(30))' at line 1
 mysql> create table patient(id int, name varchar(30),address varchar(30),contact bigint,age int, birthdate date ,gender varchar(30),disease varchar(30));
 Query OK, 0 rows affected (0.02 sec)

 mysql> desc patient;
 +-----------+-------------+------+-----+---------+-------+
 | Field     | Type        | Null | Key | Default | Extra |
 +-----------+-------------+------+-----+---------+-------+
 | id        | int         | YES  |     | NULL    |       |
 | name      | varchar(30) | YES  |     | NULL    |       |
 | address   | varchar(30) | YES  |     | NULL    |       |
 | contact   | bigint      | YES  |     | NULL    |       |
 | age       | int         | YES  |     | NULL    |       |
 | birthdate | date        | YES  |     | NULL    |       |
 | gender    | varchar(30) | YES  |     | NULL    |       |
 | disease   | varchar(30) | YES  |     | NULL    |       |
 +-----------+-------------+------+-----+---------+-------+
 8 rows in set (0.01 sec)

 mysql> select * from patient;
 +------+-------+---------+---------+------+------------+--------+---------+
 | id   | name  | address | contact | age  | birthdate  | gender | disease |
 +------+-------+---------+---------+------+------------+--------+---------+
 |    1 | rahul | pune    |   42423 |   20 | 2002-05-05 | male   | fever   |
 +------+-------+---------+---------+------+------------+--------+---------+
 1 row in set (0.00 sec)

 mysql>


 *
 */