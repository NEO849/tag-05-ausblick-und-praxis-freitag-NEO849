fun main() {

    val emojiLachen = "\uD83D\uDE42"    //Kotlin erkennt Emojis auch Direkt
    val emojiHerzRot = "\u2764\uFE0F"   //Ich finde es so Cooler 😎
    val reset = "\u001B[0m"  //die farbe würde so ausschauen: val weis = "\u001B[37m"
    val rot = "\u001B[31m"   //systemtechnisch ist weis eingestellt
    val gruen = "\u001B[32m" //deshalb reset denke ich
    val gelb = "\u001B[33m"
    val blau = "\u001B[34m"
    val magenta = "\u001B[35m"

    println("------------------------------------------------")
    println("--${gruen}      $emojiLachen Hallo ${gelb}und $emojiHerzRot ${rot}Willkommen! $emojiLachen        $reset--")
    println("--${blau} Hier kannst du deinen Kontostand berechnen $reset--")
    println("--${magenta}     Bitte gebe dafür deine Daten ein       $reset--")
    println("------------------------------------------------")
    println()

    println("Wie hoch ist dein jetziger Kontostand?")
    val kontostandAlt  = readln().toDouble()

    println("Wieviel kostet ein Ticket?")
    var einzelticket = readln().toDouble()

    println("Wieviele Passagiere?")
    var anzahlPassagiere = readln().toInt()
    println()

    var gesamtpreis = einzelticket * anzahlPassagiere
    val kontostand = kontostandAlt - gesamtpreis
    println()
    println()

    println("${gelb}Bitte Schön! $emojiLachen$reset")
    println("${gelb}Dein Kontoauszug$reset")
    println()
    println("---------------------------------")
    println("-- Kontostand:        ${String.format("%-7s", kontostandAlt)}€ --")
    println("-- Einzelticket:      ${String.format("%-7s", einzelticket)}€ --")
    println("-- Gesamtpreis:       ${String.format("%-7s", gesamtpreis)}€ --")
    println("--${gruen} Neuer Kontostand:  ${String.format("%-7s", kontostand)}€ $reset--")
    println("---------------------------------")


}