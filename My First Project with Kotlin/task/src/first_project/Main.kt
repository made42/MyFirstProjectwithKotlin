package first_project

val items = listOf(
    Pair("Bubblegum", 202),
    Pair("Toffee", 118),
    Pair("Ice cream", 2250),
    Pair("Milk chocolate", 1680),
    Pair("Doughnut", 1075),
    Pair("Pancake", 80),
)

fun main() {
    println("Earned amount:")
    items.map { println("${it.first}: $${it.second}") }
    val income = items.sumOf { it.second }
    println("\nIncome: $$income")
    println("Staff expenses:")
    val staff = readln().toInt()
    println("Other expenses:")
    val other = readln().toInt()
    println("Net income: $${income - staff - other}")
}