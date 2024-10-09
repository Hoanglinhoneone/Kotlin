package controler

import com.google.gson.Gson
import model.AlphabetReal
import model.InAlphabet
import model.OutAlphabet
import model.contant.Contants.CODE_SUCCESS
import model.contant.Contants.DATAREAL
import model.contant.Contants.MESSAGE
import model.contant.Contants.STATUS
import view.MainView

class ConvertAlphabet {

    private var inAlphabet: InAlphabet
    private lateinit var outAlphabet: OutAlphabet


    constructor(inAlphabet: InAlphabet) {
        this.inAlphabet = inAlphabet
    }

    fun converter() : OutAlphabet {
        val mutableListFake = inAlphabet.alphabets
        var mutableListReal: MutableList<AlphabetReal> = mutableListOf()

        for (alphabetFake in mutableListFake) {
            val id = alphabetFake.id.toInt()
            val romaji = alphabetFake.romaji
            val hira = alphabetFake.hira
            val kata = alphabetFake.kata
            val alphabetReal = AlphabetReal(id, romaji, hira, kata)
            mutableListReal.add(alphabetReal)
        }
        this.outAlphabet = OutAlphabet(CODE_SUCCESS, STATUS, MESSAGE, mutableListReal)

        return this.outAlphabet
    }
}