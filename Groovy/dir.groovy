File newFile = new File("/home/aditi/Exercises/Groovy/file4.txt");

File dir = new File("/home/aditi/Exercises/Groovy/Javascript");
    
dir.eachFile{
        file -> newFile << "\n\n$file.name contents...\n" 
        file.eachLine {line-> newFile << line}
        
    };