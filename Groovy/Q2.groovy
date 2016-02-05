class Employee extends Person
{
    String empId;
    String company;
    float salary;

    void setSalary(float salary)
    {
        this.salary=2*salary;
    }
    
    float getSalary()
    {
        return this.salary;
    } 

}

Employee emp=new Employee();
emp.empId="005";
println emp.empId

emp.company="TTND";
println emp.@company
println emp.company

emp.setSalary(15000);
println emp.salary;
println emp.@salary;