class Person
{
String name;
int age;
String gender;
String address;

public int getAge()
{
return this.age;
}

public void setAge(int age)
{
this.age=age;
}

}

public class Demo
{
public static void main(String args[])
{
Person person=new Person();
person.name="Aditi";
person.setAge(23);
System.out.println(person.name+" "+person.getAge());
}

}
