fun main (){

    println("Hallo Freund :-)")
    println("Mein Name ist LÄXY ROXS und ich bin Deine Boarding Assistentin")
    println("ich werde mit dir zusammen deinen Boarding Pass erstellen,")
    println("bitte gebe dafür folgende Informationen ein:")
    println()
    println("Wie lautet dein Nachname?")
    val nachname : String = readln()

    println("Schön und dein Vorname?")
    val vorname : String = readln()

    println("Hi $vorname $nachname schön das du hier bist \nich hoffe du hattest eine angenehme Anreise...")
    println("Wie lautet den Deine E-mail Adresse?")
    var email : String = readln()

    println("Okay nun deine Telefonnummer?")
    var telefon : String = readln()

    println("Bitte nenne mir dein Geburtsjahr")
    val geburtsjahr : String = readln()

    println("Soweit so gut, wohin möchtest du den Fliegen?")
    var ziel : String = readln()

    println("Möchtest du vegetarisch Essen?")
    var vegetarisch : String = readln()
    println()

    println("Geschafft :-) dein Boarding Pass ist nun fertig,")
    println("ich werde ihn dir gleich Ausdrucken.")
    println("Lieber $vorname ich wünsche dir ganz viel Spaß und Erholung in $ziel!")
    println()
    println()
    println("-------------Boarding Pass----------------")
    println("- Nachname:        ${String.format("%-22s", nachname)}-")
    println("- Vorname:         ${String.format("%-22s", vorname)}-")
    println("- Email:           ${String.format("%-22s", email)}-")
    println("- Telefonnummer:   ${String.format("%-22s", telefon)}-")
    println("- Geburtsjahr:     ${String.format("%-22s", geburtsjahr)}-")
    println("- Ziel:            ${String.format("%-22s", ziel)}-")
    println("- Vegetarisch:     ${String.format("%-22s", vegetarisch)}-")
    println("------------------------------------------")
//  println("- Ziel:            $ziel                -")        unterschied zum String.format Befehl damit
//  println("- Vegetarisch:     $vegetarisch                    -") die Schlußstriche untereinander stehen
              

}




