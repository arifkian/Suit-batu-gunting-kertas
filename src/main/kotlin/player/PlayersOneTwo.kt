package player

class PlayersOneTwo(): Player() {
    override fun playerOne(): String {
        //    Menangkap pilihan player 1
        return print("1. Masukan Pemain 1 : ").toString()
    }

    override fun playerTwo(): String {
        //    Menangkap pilihan player 1
        return print("2. Masukan Pemain 2 : ").toString()
    }

}