//Consider the following piece of code: 
 String s = "this string needs to be split" 
 println s.tokenize(" ") 
 println s.tokenize() 
 println s.tokenize(/\s/)
 
// Compare this with the following code: 
// String s = "this string needs to be split" 
 println s.split(" ") 
 println s.split(/\s/) //(Try Same Parameter with tokenize) 
 
// Also try the following exercise: 
 String s1 = "are.you.trying.to.split.me.mister?" 
 println s1.tokenize(".") 
 println s1.split("\\.") 
 
 /*
output:
 [this, string, needs, to, be, split]
[this, string, needs, to, be, split]
[thi,  , tring need,  to be , plit]
[this, string, needs, to, be, split]
[this, string, needs, to, be, split]
[are, you, trying, to, split, me, mister?]
[]
*/
