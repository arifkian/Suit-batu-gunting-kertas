import player.PlayersOneTwo

class App {
    companion object {
        @JvmStatic
        fun main(Args: Array<String>) {
            val app = App()
            app.header()
            app.gameMain()

        }
    }

    fun header(){
        println("======================================")
        println("GAME SUIT TERMINAL VERSION")
        println("======================================")
    }

    fun gameMain(){
        //object player 1 dari class player
        (PlayersOneTwo().playerOne())
        val player1 = readLine()?.toLowerCase()

        //object player 2 dari class player
        (PlayersOneTwo().playerTwo())
        val player2 = readLine()?.toLowerCase()

        if (player1 == "gunting" && player2 == "gunting") {
            println("DRAW!")
        } else if (player1 == "batu" && player2 == "batu") {
            println("DRAW!")
        } else if (player1 == "kertas" && player2 == "kertas") {
            println("DRAW!")
        } else if (player1 == "batu" && player2 == "gunting") {
            println("Player 1 MENANG!")
        } else if (player1 == "batu" && player2 == "kertas") {
            println("Player 2 MENANG!")
        } else if (player1 == "gunting" && player2 == "kertas") {
            println("Player 1 MENANG!")
        } else if (player1 == "gunting" && player2 == "batu") {
            println("Player 2 MENANG!")
        } else if (player1 == "kertas" && player2 == "batu") {
            println("Player 1 MENANG!")
        } else if (player1 == "kertas" && player2 == "gunting") {
            println("Player 2 MENANG!")
        } else {
            println("error")
        }
    }

}