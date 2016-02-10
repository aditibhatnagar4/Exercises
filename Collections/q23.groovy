class Employee
{
String name 
int age 
String departmentName 
int employeeNumber 
float salary 
}

List empList=[ new Employee(name:"a",age:20,departmentName:"dept1",salary:4000),
               new Employee(name:"ab",age:21,departmentName:"dept1",salary:25000),
               new Employee(name:"c",age:2,departmentName:"dept2",salary:6000),
               new Employee(name:"fd",age:23,departmentName:"dept1",salary:15000),
               new Employee(name:"ce",age:24,departmentName:"dept2",salary:3000),
               new Employee(name:"f",age:45,departmentName:"dept2",salary:14000),
]

println "a) Group the employees on the basis of the bracket in which their salary falls. The ranges are 0-5000, 5001 and 10000, and so on." 
println empList.groupBy{
if(it.salary<=5000 && it.salary>=0)
"0-5000"
else if(it.salary>=5001 && it.salary<=10000)
"5001-10000"
else
">10000"
}
println ""

println "b) Get a count of the number of employees in each department"
println empList.countBy{
it.departmentName
}
println ""

println "c) Get the list of employees whose age is between 18 and 35" 
println empList.findAll{
it.age>18 && it.age<35
}*.name
println ""

println "d) Group the employees according to the alphabet with which their first name starts and display the number of employees in each group whose age is greater than 20" 
Map map= empList.groupBy{ it.name[0] }
println map
map.each{
println it.key+"->"+it.value.countBy({it2->it2.age > 20}).get(true)
}
println ""

println "e) Group the employees according to their department."
Map m= empList.groupBy{
it.departmentName
}
m.each{
println it.key+"->"+it.value.name
}