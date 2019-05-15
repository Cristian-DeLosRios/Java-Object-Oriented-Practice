class Student extends Person{ String status;
public Student(String status,String name,String address,String phone,String email) {
super(name,address,phone,email);
this.status=status;

}

@Override

public String toString(){

return""+"Student: "+name+"\n"+"Status: "+status+"\n"+"Address: "+address+"\n"+"Phone Number: "+phone+"\n"+"Email Address: "+email;}

}