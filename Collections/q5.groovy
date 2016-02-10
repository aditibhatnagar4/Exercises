list=[3,2,5,6,7,4]
List even=[]
list.eachWithIndex{p,index ->
  if((index+1)%2==0)
    {
         even.add(p)  
    }
}
println list-even