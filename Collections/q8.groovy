class Employee
{
 String name 
 int age 
 float salary 
}

empList=[new Employee(name:"a",age:20,salary:20),
         new Employee(name:"b",age:30,salary:30),
         new Employee(name:"c",age:40,salary:40),
         new Employee(name:"d",age:50,salary:50),
         new Employee(name:"e",age:60,salary:60),
         new Employee(name:"f",age:20,salary:20),
         new Employee(name:"g",age:30,salary:30),
         new Employee(name:"h",age:40,salary:40),
         new Employee(name:"i",age:50,salary:50),
         new Employee(name:"j",age:60,salary:60),]
         
println empList.findAll{
it.salary<50
}*.name

print "Oldest Employee "
println empList.max{
it.age
}*.name

print "Youngest Employee "
println empList.min{
it.age
}*.name


print "Employee with max salary "
println empList.max{
it.salary
}*.name


print "List of employee names "
println empList.findAll{
it
}*.name