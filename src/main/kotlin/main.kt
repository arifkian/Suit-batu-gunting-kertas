import player.Player
import player.PlayersOneTwo

fun main(args: Array<String>) {
    println("======================================")
    println("GAME SUIT TERMINAL VERSION")
    println("======================================")
    //object player 1 dari class player
    (PlayersOneTwo().playerOne())
    val player1 = readLine()?.toLowerCase()

    //object player 2 dari class player
    (PlayersOneTwo().playerTwo())
    val player2 = readLine()?.toLowerCase()
}
