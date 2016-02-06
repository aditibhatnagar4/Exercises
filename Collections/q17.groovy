Map map=[:]
map.put("a", 20)
map.put("b", 21)
map.put("c", 22)
map.put("d", 23)
map.put("e", 24)
map.put("f", 25)
map.put("g", 26)
map.put("h", 27)
map.put("i", 29)
map.put("j", 30)
println map

map.each { 
println it.key + ". " + it.value
} 
println ""
map.eachWithIndex {  key, value, index ->
println "$index[$key=$value]"
 }