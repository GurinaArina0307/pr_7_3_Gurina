fun main(){
    try {
        println("Введите значения биквадратного уравнения")
        print("Введите a : ")
        val a = readln().toDouble()
        print("Введите b : ")
        val b = readln().toDouble()
        print("Введите c : ")
        val c = readln().toDouble()

        val discriminant = b * b * 4 - a * c

        when{
            discriminant < 0 -> {
                println("Действительных корней нет!")
                return
            }
            discriminant == 0.0 -> {
                val y = -b / (2 * a)
                if (y >= 0) {
                    val x1 = Math.sqrt(y)
                    val x2 = -x1

                    println("Корни уравнения : \nх1 = $x1, х2 = $x2")
                }
            }
            else -> {
                val y1 = (-b + Math.sqrt(discriminant)) / (2 * a)
                val y2 = (-b - Math.sqrt(discriminant)) / (2 * a)
                println("Корни уравнения : ")
               if (y1 >= 0){
                   val x1 = Math.sqrt(y1)
                   val x2 = -x1

                   print(" \nх1 = $x1\nх2 = $x2")
               }
                if (y2 >= 0){
                    val x3 = Math.sqrt(y2)
                    val x4 = -x3

                    print("\nх3 = $x3\nх4 = $x4")
                }
            }
        }
    }
    catch (e:Exception){
        println("Неверный ввод данных!")
    }
}