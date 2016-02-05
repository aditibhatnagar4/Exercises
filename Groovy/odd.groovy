File srcFile = new File("/home/aditi/Exercises/Groovy/file.txt");

File desFile = new File("/home/aditi/Exercises/Groovy/file3.txt");

def lineNumber = 1;

srcFile.eachLine{
                    line ->   if(lineNumber % 2)
                                  desFile << lineNumber << " " << line <<"\n";
                                  
                
                              lineNumber++
                }
        