class Employee extends Person {

int officeNumber=0;

int salary=0; MyDate dateHired;
public Employee(MyDate dateHired,int officeNumber, int salary,String name,String address,String phone,String email){

super(name,address,phone,email); this.officeNumber=officeNumber; this.salary=salary;
this.dateHired = dateHired;

}

}