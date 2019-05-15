import java.util.Scanner;
public class testClass{

//Main Method

public static void main(String[] arg){

//Person Data Feild

String name="",address="",phone="",email="";

//Student Data Feilds

String status="";

//Employee Data Feilds int officeNumber=0; int salary=0;
MyDate dateHired=null;

//Faculty Data Feild String officeHours=""; String rank="";
//Staff Data Feild

String title="";

//Main Data Feilds int menu;
//Scanner

Scanner input=new Scanner(System.in);

//Prompt

System.out.print("Enter"+"\n"+"1)To create a student"+ "\n" + "2)To create an employee:");

menu=input.nextInt();

input.nextLine();

if (menu==1){

createStudent(input ,status,name,address,phone,email);

}else{
createEmployee(input, name, address, phone, email, officeNumber, salary, dateHired, officeHours, rank, title);
}

}

//Student Method

public static void createStudent(Scanner input,String status,String name,String address,String phone,String email){

//Student Prompt System.out.print("Enter name:"); name=input.nextLine(); System.out.print("Enter address:"); address=input.nextLine(); System.out.print("Enter phone number:"); phone=input.nextLine(); System.out.print("Enter email:"); email=input.nextLine(); System.out.print("Enter student's status:"); status=input.nextLine();
//Create Student object

Student student=new Student(status,name,address,phone,email);

//Student toString

System.out.println(student.toString());

}

public static void createEmployee (Scanner input,String name,String address,String phone,String email,int officeNumber,int salary,MyDate dateHired,String officeHours,String rank, String title){

int menu;

//Employee Prompt System.out.print("Enter name:"); name=input.nextLine(); System.out.print("Enter address:");
address=input.nextLine(); System.out.print("Enter phone number:"); phone=input.nextLine(); System.out.print("Enter email:"); email=input.nextLine();
//Faculty or Staff Prompt
System.out.print("Enter"+"\n"+"1)To create a faculty member\n" + "2)To create a staff member:");

menu=input.nextInt();

input.nextLine();

if (menu==1){

System.out.print("Enter office number:"); officeNumber=input.nextInt(); input.nextLine();
System.out.print("Enter salary:");

salary=input.nextInt();

input.nextLine();

System.out.print("Enter date hired (mm/dd/yy):"); dateHired= new MyDate(input.nextLine()); System.out.print("Enter office hours:"); officeHours=input.nextLine(); System.out.print("Enter rank:"); rank=input.nextLine();
//Create Faculty object

Faculty faculty= new Faculty (dateHired, officeNumber, salary, officeHours, rank, name, address, phone, email);

//Faculty toString

System.out.println(faculty.toString());



}else{
System.out.print("Enter office number:"); officeNumber=input.nextInt(); input.nextLine();
System.out.print("Enter salary:");
salary=input.nextInt();

input.nextLine();

System.out.print("Enter date hired (mm/dd/yy):"); dateHired= new MyDate(input.nextLine()); System.out.print("Enter title:"); title=input.nextLine();
//Create Staff object

Staff staff=new Staff (dateHired, officeNumber, salary, title, name, address, phone, email);

//Staff toString

System.out.println(staff.toString());

}

}

}

