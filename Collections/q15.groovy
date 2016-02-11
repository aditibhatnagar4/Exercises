class Stack
{
  List l=[];
  
  Boolean push(String x)
  {
     return l.push(x)

  }
  
  String pop()
  {
      return l.pop()

  }
  
  String top()
  {  
       return l.last()
  }
}
Stack obj=new Stack();
//obj.top();
println obj.push("Aditi")
println obj.push("Aarushi")
println obj.push("Aashna");
println "top->"+obj.top();
println obj.pop()+" popped";
println "top->"+obj.top();
println obj.pop()+" popped";
//println obj.pop()+" popped";
println obj.pop()+" popped";