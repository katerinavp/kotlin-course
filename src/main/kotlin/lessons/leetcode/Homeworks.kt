package lessons.leetcode

fun main() {
//    solution(arrayOf("flower", "flow", "flight"))
    solution(arrayOf("dog","racecar","car"))
}


fun solution(strs: Array<String>): String {
    val prefix = ""
    val strsWithPrefix = mutableListOf<Char>()
    for (str in strs) {
        println("strs " + strs.size)
        for (index in str.indices) {
//            val letter = str.substring(index)
//            val let = str[index]
            strsWithPrefix.add(str[index])
            println("index" + index + " str[index] " + str[index] + " strsWithPrefix " + strsWithPrefix)

        }

    }
    val group = strsWithPrefix.groupBy { it }
    var result = ""
    println()
    println(" group.values "+group.values + " strs.size " + strs.size )

    group.forEach { key, value ->
        println(" valuee "+value.size )
      if(value.size == strs.size){
          println(" group.values.size "+group.values.size + " group.keys " + key )

          result += key
          println(" strsWithPrefix.groupBy { it } " + group + "result " + result)

      }

  }

println("reuslt " +result)
return result
}
