
val range0 = arrayOf(1, 2, 3)

for (i in range0) {
  println(i)
}

val range1: Array<Int> = arrayOf(4, 5, 6)

// single quotes gives -> error: too many characters in a string literal
//println('--------------------------------------------------------')

println("")
println("--------------------------------------------------------")
println("")

for (i in range1) {
  println(i)
}


// multiline string
val divider: String = """
--------------------------------------------------------
"""

println(divider)

// IntArray type
// error: type inference failed. Expected type mismatch: inferred type is Array<Int> but IntArray was expected
// val range2: IntArray = arrayOf(7, 8, 9)
val range2: IntArray = intArrayOf(7, 8, 9)

for (i in range2) {
  println(i)
}
println(divider)

// ranges -> https://kotlinlang.org/docs/reference/ranges.html
// inclusive of start and end, print 10, 11 and 12:
for (i in 10..12) {
  println(i)
}

