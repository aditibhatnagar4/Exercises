class Stack
{
  List l=[];
  int top=-1
  void push(String x)
  {
   top++;
   l.add(x)
   println x+" pushed"
  }
  void pop()
  {
    if(top>=0)
    {
    println l[top]+" popped"
    l.remove(top)
    top--
    }
    else
    println "Empty Stack"
  }
  void top()
  {  
     if(top>=0)
     println l.last()
     else
     println "Empty Stack"
  }
}
Stack obj=new Stack();
obj.top();
obj.push("Aditi")
obj.push("Aarushi")
obj.push("Aashna");
obj.top();
obj.pop();
obj.top();
obj.pop();
obj.pop();
obj.pop();