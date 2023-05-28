fun main() {

    println("Hallo!")
    println("Um deinen Kontostand zu berechnen,")
    println("gib deine aktuellen Ausgaben ein!")
    println()
    println()

    var kontostand  = 650

    println("Wieviel kostet ein Ticket?")
    var einzelticket = readln().toInt()

    println("Wieviele Passagiere?")
    var anzahlPassagiere = readln().toInt()
    println()
    var gesamtpreis = einzelticket * anzahlPassagiere
    var neuerKontostand = kontostand - gesamtpreis

    println("Kontostand:        $kontostand €")
    println("Einzelticket:      $einzelticket €")
    println("Gesamtpreis:       $gesamtpreis €")
    println("Neuer Kontostand:  $neuerKontostand €")
    println()


}