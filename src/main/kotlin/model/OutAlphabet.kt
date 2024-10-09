package model

class OutAlphabet {
     var code : String = ""
        get() = field
        set(value) {
            field = value
        }
     var status : String = ""
        get() = field
        set(value) {
            field = value
        }
     var message : String = ""
        get() = field
        set(value) {
            field = value
        }
     var alphabets = mutableListOf<AlphabetReal>()
        get() = field
        set(value) {
            field = value
        }

    constructor(code: String, status: String, message: String, alphabets: MutableList<AlphabetReal>) {
        this.code = code
        this.status = status
        this.message = message
        this.alphabets = alphabets
    }

    override fun toString(): String {
        return "OutAlphabet(code='$code', status='$status', message='$message', alphabets=$alphabets)"
    }

}