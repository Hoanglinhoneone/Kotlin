package model

class AlphabetFake {
    var id : String = ""
        get() = field
    var romaji : String = ""
        get() = field
    var hira : String = ""
        get() = field
    var kata : String = ""
        get() = field
    var groupe : String = ""
        get() = field
    var example : String = ""
        get() = field

    constructor(id: String, romaji: String, hira: String, kata: String, groupe: String, example: String) {
        this.id = id
        this.romaji = romaji
        this.hira = hira
        this.kata = kata
        this.groupe = groupe
        this.example = example
    }

    override fun toString(): String {
        return "AlphabetFake(id='$id', romaji='$romaji', hira='$hira', kata='$kata', groupe='$groupe', example='$example')"
    }

}