class Staff extends Employee { String title;
public Staff(MyDate dateHired, int officeNumber, int salary,String title,String name,String address,String phone,String email) {

super(dateHired,officeNumber,salary,name,address,phone,email);

this.title=title;

}

@Override

public String toString(){

return""+"Staff: "+name+"\n"+"Salary: $"+salary+"\n"+"Date Hired: "+ dateHired.getDate()+"\n"+"\n"+"Office: "+officeNumber+"\n"+"Address: "+address+"\n"+"Phone Number: "+phone+"\n"+"Email: "+email;}

}