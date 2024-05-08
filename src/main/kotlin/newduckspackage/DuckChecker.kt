package newduckspackage

import Duck

class DuckChecker {

    fun listHasDuck(duckToCheck:Duck) = MySingleton.getInstance().myDucksList.contains(duckToCheck)


}