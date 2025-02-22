
// object StringProcessor {
  // def processStrings(strings: List[String]): List[String] = {
    // var result = List[String]()
    // for (str <- strings) {
      //if (str.length > 3) {
        // result = result :+ str.toUpperCase
      //}
    //}
    //result
  //}

  //def main(args: Array[String]): Unit = {
    //val strings = List("apple", "cat", "banana", "dog", "elephant")
    //val processedStrings = processStrings(strings)
    //println(s"Processed strings: $processedStrings")
  //}
//}

// В этом коде был заменен цикл и изменяемая переменная на методы высшего порядка filter и map,
// которые позволяют сделать код более функциональным.
// Метод filter используется для фильтрации строк по условию длины больше 3,
// а метод map преобразует отфильтрованные строки в верхний регистр.

object StringProcessorFunctional {
  // Функция для обработки списка строк в функциональном стиле
  def processStrings(strings: List[String]): List[String] = {
    // Фильтрация строк по условию длины больше 3 и преобразование в верхний регистр
    strings.filter(str => str.length > 3).map(_.toUpperCase)
  }

  def main(args: Array[String]): Unit = {
    // Исходный список строк
    val strings = List("apple", "cat", "banana", "dog", "elephant")
    // Обработка строк с помощью функции processStrings
    val processedStrings = processStrings(strings)
    // Вывод обработанных строк
    println(s"Processed strings: $processedStrings")
  }
}

