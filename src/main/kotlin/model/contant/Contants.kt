package model.contant

object Contants {
    //https://mina.mazii.net/api/getKana.php
    const val BASE_URL = "https://mina.mazii.net/"
    const val FINAL_URL = "api/getKana.php"
    const val CODE_SUCCESS = "200"
    const val STATUS = "Success"
    const val MESSAGE = "Request processed successfully"
    const val DATAFAKE = "dataFake"
    const val DATAREAL = "dataReal"

    fun showMsg(msg : String) {
        println(msg)
    }

}