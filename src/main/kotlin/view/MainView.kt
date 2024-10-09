package view

import model.InAlphabet
import model.OutAlphabet

open class MainView {
    fun showPathSavedFileFake( formatFile : String,filePath : String) {
        println("file $formatFile saved in : $filePath")
    }

    fun showPathGetFileFake(formatFile: String, filePath : String) {
        println("get file $formatFile in : $filePath")
    }

    fun showErrorFile() {
        println("Accses File Error!")
    }

    fun showOutAlphabets(outAlphabet: OutAlphabet) {
        println(outAlphabet.toString())
    }
    fun showInAlphabets(inAlphabet: InAlphabet) {
        println(inAlphabet.toString())
    }
}