File srcFile = new File("/home/aditi/Exercises/Groovy/file.txt");

File desFile = new File("/home/aditi/Exercises/Groovy/file2.txt");

srcFile.eachLine{
                    line ->   desFile << line.replaceAll("\\s", "") ;
                              
                }
        