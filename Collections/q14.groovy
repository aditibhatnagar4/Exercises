//14

def range=1..100
range.each{
if(!(it%3) && !(it%5))
print "FizzBuzz"
else if(!(it%3))
print "Fizz"
else if(!(it%5))
print "Buzz"
else
print it
println ""
}