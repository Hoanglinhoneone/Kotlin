package model

class AlphabetReal {
     var id : Int = 0
        get() = field
        set(value) {
            field = value.toInt()
        }
     var romaji : String = ""
        get() = field
        set(value) {
            field = value
        }
     var hira : String = ""
        get() = field
        set(value) {
            field = value
        }
     var kata : String = ""
        get() = field
        set(value) {
            field = value
        }
    constructor(id: Int, romaji: String, hira: String, kata: String) {
        this.id = id
        this.romaji = romaji
        this.hira = hira
        this.kata = kata
    }

    override fun toString(): String {
        return "AlphabetReal(id=$id, romaji='$romaji', hira='$hira', kata='$kata')"
    }

}