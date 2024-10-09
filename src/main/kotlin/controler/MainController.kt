package controler

import com.google.gson.Gson
import model.AlphabetFake
import model.api.UseRetrofit
import model.InAlphabet
import model.OutAlphabet
import model.contant.Contants.DATAFAKE
import model.contant.Contants.DATAREAL
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import view.MainView

class MainController() {

     fun handleData() {

          val call = UseRetrofit.apiService.getAlphabet()
          call.enqueue(object  : Callback<List<AlphabetFake>> {
               override fun onResponse(p0: Call<List<AlphabetFake>>, p1: Response<List<AlphabetFake>>) {
                    if(p1.isSuccessful && p1.body() != null) {

                         val inAlphabet = InAlphabet(p1.body()!!)

                         inAlphabet.let {
                              val gson = Gson()
                              val jsonString = gson.toJson(it)
                              val mainView = MainView()
                              val fileController = FileController(DATAFAKE, mainView)
                              fileController.saveDataFile(jsonString, "Fake")
                         }

                         val mainView = MainView()
                         val outAlphabet : OutAlphabet= hanldeConvertAlphabet(inAlphabet)
                         mainView.showOutAlphabets(outAlphabet)

                         outAlphabet.let {
                              val gson = Gson()
                              val jsonString = gson.toJson(it)
                              val mainView = MainView()
                              val fileController = FileController(DATAREAL, mainView)
                              fileController.saveDataFile(jsonString, "Real")
                         }
                    }
                    else {
                         println("${p1.code()}")
                    }
               }
               override fun onFailure(p0: Call<List<AlphabetFake>>, p1: Throwable) {
                    p1.printStackTrace()
               }
          })
     }

     fun hanldeConvertAlphabet(inAlphabet: InAlphabet) : OutAlphabet{
          val convertAlphabet = ConvertAlphabet(inAlphabet)
          return convertAlphabet.converter()
     }

}

