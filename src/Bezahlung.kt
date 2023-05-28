fun main() {


    println("Hallo!")
    println("Um deinen Kontostand zu berechnen,")
    println("gib deine aktuellen Ausgaben ein!")
    println()
    println()
//    println("Wie hoch ist ihr Kontostand?")
//    var kontostand = readln().toInt()

    var kontostand  = 650

    println("Wieviel kostet ein Ticket?")
    var einzelticket = readln().toInt()

    println("Wieviele Passagiere?")
    var anzahlPassagiere = readln().toInt()
    var gesamtpreis = einzelticket * anzahlPassagiere
    var neuerKontostand = kontostand - gesamtpreis

    println("Kontostand:        $kontostand €")
    println("Einzelticket:      $einzelticket €")
    println("Gesamtpreis:       $gesamtpreis €")
    println("Neuer Kontostand:  $neuerKontostand €")

// hier bin ich stehen geblieben vor dem esses
// weiter gehen tut es mit dein Ergebnis konnte so aussehen, also die println()
// ausgaben


}