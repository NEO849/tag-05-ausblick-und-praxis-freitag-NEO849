fun main() {

    val sitzplaetzeGesamt = 130
    val kostenProTicket = 125
    var familienProFlug = sitzplaetzeGesamt / 4
    var freieSitzplaetze = sitzplaetzeGesamt - (25 * 4)
    val kmMadridNachMailand = 1034.93
    var preisProKm = 16
    var einnahmen = sitzplaetzeGesamt * kostenProTicket
    var flugkosten = kmMadridNachMailand * preisProKm
    var gewinn = einnahmen - flugkosten

    println()
    println("Anzahl an Familien:  $familienProFlug")
    println("Freie Sitzplätze:    $freieSitzplaetze")
    println("Einnahmen:           $einnahmen")
    println("Kosten:              $flugkosten")
    println("Gewinn:              $gewinn")
    println()


}

