/* Groovy Truth: if('test') { printlnn "test evaluated to true inside if" } 
 try replacing test with various objects and observe its behaviour. 
 a) "Test"     
     test evaluated to true inside if
 b)'null' 
     test evaluated to true inside if
 c) null 
     No output
 d) 100 
     test evaluated to true inside if
 e) 0 
     No output
 f) empty list 
     No output
 g) list with all vaues as null List list = new ArrayList() 
     No output
*/

if("Test") { println "test evaluated to true inside if" }
if('null') { println "test evaluated to true inside if" }
if(null) { println "test evaluated to true inside if" }
if(100) { println "test evaluated to true inside if" }
if(0) { println "test evaluated to true inside if" }
if([]) { println "test evaluated to true inside if" }
List list = new ArrayList()
if(list) { println "test evaluated to true inside if" }