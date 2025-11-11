package lesson_2

fun main() {
    var totalEmployees = 50
    var employeeSalary = 30000
    var totalTrainees = 30
    var traineeSalary = 20000

    val calculateEmployeeSalary = totalEmployees * employeeSalary
    val calculateTraineeSalary = totalTrainees * traineeSalary
    val calculateAllSalary = calculateTraineeSalary + calculateEmployeeSalary
    val averageSalary = calculateAllSalary / (totalEmployees + totalTrainees)
    println(calculateEmployeeSalary)
    println(calculateAllSalary)
    println(averageSalary)
}
