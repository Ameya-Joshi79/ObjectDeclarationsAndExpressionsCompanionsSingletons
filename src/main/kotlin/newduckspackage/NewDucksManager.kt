package newduckspackage

import Duck

class NewDucksManager {

    fun deleteDuck(duckToDelete:Duck){
        MySingleton.getInstance().myDucksList.remove(duckToDelete)
    }


}