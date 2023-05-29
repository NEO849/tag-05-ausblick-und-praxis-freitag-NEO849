fun main() {

    val sitzplaetzeGesamt = 130
    var kostenProTicket = 1000
    var familienProFlug = sitzplaetzeGesamt / 4
    var freieSitzplaetze = sitzplaetzeGesamt - (25 * 4)
    val kmMadridNachMailand = 1034.93
    var preisProKm = 16
    var einnahmen = sitzplaetzeGesamt * kostenProTicket
    var flugkosten = kmMadridNachMailand * preisProKm
    var gewinn = einnahmen - flugkosten

    val reset = "\u001B[0m"  //die farbe würde so ausschauen: val weis = "\u001B[37m"
    val rot = "\u001B[31m"   //systemtechnisch ist weis eingestellt
    val gruen = "\u001B[32m" //deshalb reset denke ich

    val gewinnAnzeige = if (gewinn >= 0) "$gruen$gewinn$reset" else "$rot$gewinn$reset"

    println()
    println("Anzahl an 4-köpfigen Familien:  $familienProFlug")
    println("Freie Sitzplätze:               $freieSitzplaetze")
    println("Einnahmen:                      $einnahmen")
    println("Kosten:                         $flugkosten")
    println("Gewinn:                         $gewinnAnzeige")
    println()


}

