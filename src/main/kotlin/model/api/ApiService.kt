package model.api

import model.contant.Contants
import model.AlphabetFake
import model.InAlphabet
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    // link api : "https://mina.mazii.net/api/getKana.php"

    @GET(Contants.FINAL_URL)
    fun getAlphabet() : Call<List<AlphabetFake>>
}