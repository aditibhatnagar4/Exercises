def table={ num->
(1..10).each{
println num+"*"+it+"="+(num*it)
}
println ""
}

table.call(2)
table.call(12)