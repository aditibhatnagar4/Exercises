Map m = ['Computing' : ['Computing' : 600, 'InformationSystems' : 300], 
 'Engineering' : ['Civil' : 200, 'Mechanical' : 100], 
 'Management' : ['Management' : 800] ] 
 
 print "Number of University departments = "
 println m.keySet().size()
 
 print "Number of programs in Computing department = "
 println m.get('Computing',[:]).keySet().size()
 
 print "Number of students enrolled in the Civil Engineering program= "
 println m.get('Engineering').get('Civil').intValue()