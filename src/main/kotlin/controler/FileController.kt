package controler

import view.MainView
import java.io.File

class FileController {
    private lateinit var filePath : String
    private  var fileName : String
    private val mainView : MainView

    constructor(fileName: String, mainView: MainView) {
        this.fileName = fileName
        this.mainView = mainView
    }

    fun saveDataFile(jsonString : String, formatFile : String) {

        try {
            val file = File(fileName)
            file.writeText(jsonString)
            this.filePath = file.absolutePath

        } catch (e : Exception) {
            e.printStackTrace()
        }
        mainView.showPathSavedFileFake(formatFile, this.filePath)
    }

    fun getDataFile(filePath : String) : String?  {
        return try {
            val file = File(filePath)
            if(file.exists()) {
                file.readText()
            } else {
                null
            }
        } catch (e : Exception) {
            mainView.showErrorFile()
            e.printStackTrace()
            null
        }
    }

}