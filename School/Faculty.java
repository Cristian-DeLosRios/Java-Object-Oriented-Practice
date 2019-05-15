class Faculty extends Employee { String officeHours;
String rank;

public Faculty(MyDate dateHired, int officeNumber, int salary,String officeHours,String rank,String name,String address,String phone,String email) {

super(dateHired, officeNumber, salary,name,address,phone,email);

this.officeHours=officeHours;

this.rank=rank;

}

@Override
public String toString(){
return""+"Faculty: "+name+"\n"+"Rank: "+rank+"\n"+"Salary: $"+salary+"\n"+"Date Hired: "+dateHired.getDate()+"\n"+"\n"+"Office Hours: "+officeHours+"\n"+"Office: "+officeNumber+"\n"+"Address: "+address+"\n"+"Phone Number: "+phone+"\n"+"Email: "+email;}

}