import newduckspackage.DuckChecker
import newduckspackage.MySingleton
import newduckspackage.NewDucksManager

/*
 An object declaration defines a class declaration and creates an instance of it in a
single statement. And when you include it in the top level of a source file or
package, only one instance of that type will ever be created
 */
object DuckManager{

    val allDucks:MutableList<Duck> = mutableListOf()

    fun printDuckList(){
        allDucks.forEach {
            println("Duck's Name: ${it.name}")
        }
    }

}




fun main(args:Array<String>){

    DuckManager.allDucks.add(Duck("Max"))

    DuckManager.allDucks.add(Duck("Bruce"))

    DuckManager.allDucks.add(Duck("Barbara"))

    DuckManager.allDucks.add(Duck("Ellie"))


    DuckManager.printDuckList()

    val myDuck1 = MyDucks()

    val myDuck2 = MyDuck2()

    myDuck1.addDuck(Duck("Nathan"))

    myDuck2.addDuck(Duck("Windy"))

    println("-------NEW DUCK LIST---------")

    DuckManager.printDuckList()

    val duckDeletion = DuckDeletion()

    duckDeletion.removeDuck(Duck("Nathan"))

    println("-------NEW DUCK LIST---------")

    DuckManager.printDuckList()


    /*

       Singleton
     */

    println("--------SINGLETON PATTERN--------------------")


    val mySingleton = MySingleton.getInstance()

    mySingleton.myDucksList.add(Duck("Max"))
    mySingleton.myDucksList.add(Duck("Bruce"))
    mySingleton.myDucksList.add(Duck("Barbara"))
    mySingleton.myDucksList.add(Duck("Ellie"))
    mySingleton.myDucksList.add(Duck("Joan"))


    println("-----------DUCK LIST----------------")

    mySingleton.myDucksList.forEach{
        println(it.name)
    }

    val newDucksManager = NewDucksManager()

    newDucksManager.deleteDuck(Duck("Joan"))

    val isDuckPresentInList = DuckChecker().listHasDuck(Duck("Joan"))

    println("Is Duck Joan present in the List: $isDuckPresentInList")

    println("Is Duck Barbara present in the List: ${DuckChecker().listHasDuck(Duck("Barbara"))}")


    var x = 0

    var y = 0

    while (x < 10){
        x++

        continue

        y++
    }

    println("Value of x is $x")

    println("Value of y is $y")
}