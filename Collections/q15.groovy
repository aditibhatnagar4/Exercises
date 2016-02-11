class Stack
{
  List l=[];
  int top=-1
  void push(x)
  {
//   top++;
//   l.add(x)
//   println x+" pushed"
l.push(x)

  }
  
  def pop()
  {
//    if(top>=0)
//    {
//    int index=top
//    top--
//    return l.remove(index)
//    }
//    else
//    return "Stack is empty"
return l.pop()

  }
  
  def top()
  {  
//     if(top>=0)
//     println l.last()
//     else
//     println "Empty Stack"
return l.head()
  }
}
Stack obj=new Stack();
//obj.top();
obj.push("Aditi")
obj.push("Aarushi")
obj.push("Aashna");
obj.top();
println obj.pop()+" popped";
obj.top();
println obj.pop()+" popped";
//println obj.pop()+" popped";
println obj.pop()+" popped";