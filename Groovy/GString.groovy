/*class Person
{
String name;
int age;
String gender;
String address;

}
*/


class Employee extends Person
{
String empId;
String company;
float salary;


String toString()
{
return "${name} is a man aged ${age} who lives at ${address}. He works for ${company} with employee id ${empId} and draws \$${salary} lots of money !!! "
}


}


Employee emp=new Employee(company:"Intelligrape",empId:12,salary:15000);
emp.name="Sachin";
emp.age=24;
emp.address="Delhi";
println emp;
