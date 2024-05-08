package newduckspackage

import Duck

class MySingleton private constructor(){

    companion object{

        @Volatile
        private var instance:MySingleton? = null

        fun getInstance() =
            instance ?: synchronized(this){
                instance ?: MySingleton().also {
                    instance = it
                }
            }

    }

    val myDucksList:MutableList<Duck> = mutableListOf()

}