fun main (){

    println()
    val emojiFlugzeug = "\u2708\uFE0F"
    val emojiLachen = "\uD83D\uDE42"
    val emojiHerzRot = "\u2764\uFE0F"
    val emojiDaumenHoch = "\uD83D\uDC4D"
    val reset = "\u001B[0m"  //die farbe würde so ausschauen: val weis = "\u001B[37m"
    val rot = "\u001B[31m"   //systemtechnisch ist weis eingestellt
    val gruen = "\u001B[32m" //deshalb reset denke ich
    val gelb = "\u001B[33m"
    val blau = "\u001B[34m"
    val magenta = "\u001B[35m"

    println("${magenta}-----------------------------------------------------$reset")
    println("${magenta}----------------$reset  $emojiLachen Hallo ${gruen}Freund$reset $emojiLachen ${magenta}----------------$reset")
    println("${magenta}--$reset Ich bin ${rot}LÄXY ROXS$reset $emojiHerzRot deine$rot Boarding Assistentin$reset ${magenta}--$reset")
    println("${magenta}--$reset   Zusammen erstellen wir deinen ${blau}Boarding-Pass$reset   ${magenta}--$reset")
    println("${magenta}--$reset     Bitte gib dafür deine Informationen ein     ${magenta}--$reset")
    println("${magenta}-----------------------------------------------------$reset")
    println()

    println("Wie lautet dein Nachname?")
    val nachname : String = readln()

    println("Wie lautet dein Vorname?")
    val vorname : String = readln()

    println("Wie lautet den Deine E-mail Adresse?")
    var email : String = readln()

    println("Okay nun deine Telefonnummer?")
    var telefon : String = readln()

    println("Bitte nenne mir dein Geburtsjahr")
    val geburtsjahr : Int = readln().toInt()  // Falls man später etwas überprüfen muß,
                                              // z.B darf derjenige Erwachsenenfilme anschauen
    println("Soweit so gut, wohin möchtest du den Fliegen?")
    var ziel : String = readln()

    println("Möchtest du vegetarisch Essen?")
    var vegetarisch : String = readln()
    println()

    println("Geschafft $emojiLachen dein Boarding Pass ist nun fertig $emojiDaumenHoch")
    println("Ich werde ihn dir gleich Ausdrucken.")
    println("Lieber ${blau}$vorname$reset ich wünsche dir ganz viel Spaß und Erholung in ${blau}$ziel!$reset")
    println()
    println()
    println("${gruen}---------  $emojiFlugzeug  Boarding Pass  $emojiFlugzeug  --------$reset")
    println("${gruen}-$reset ${gelb}Nachname:        ${String.format("%-22s", nachname)}${gruen}-$reset")
    println("${gruen}-$reset ${gelb}Vorname:         ${String.format("%-22s", vorname)}${gruen}-$reset")
    println("${gruen}-$reset ${gelb}Email:           ${String.format("%-22s", email)}${gruen}-$reset")
    println("${gruen}-$reset ${gelb}Telefonnummer:   ${String.format("%-22s", telefon)}${gruen}-$reset")
    println("${gruen}-$reset ${gelb}Geburtsjahr:     ${String.format("%-22s", geburtsjahr)}${gruen}-$reset")
    println("${gruen}-$reset ${gelb}Ziel:            ${String.format("%-22s", ziel)}${gruen}-$reset")
    println("${gruen}-$reset ${gelb}Vegetarisch:     ${String.format("%-22s", vegetarisch)}${gruen}-$reset")
    println("${gruen}------------------------------------------$reset")

/*
    println("- Nachname:        $nachname                 -") //unterschied zum String.format Befehl damit
    println("- Vorname:         $vorname               -")    //die Schlußstriche untereinander stehen
    println("- Email:           $email                 -")    //${String.format("%-22s", email)}-")
    println("- Telefonnummer:   $telefon                  -")
    println("- Geburtsjahr:     $geburtsjahr                  -")
    println("- Ziel:            $ziel                -")
    println("- Vegetarisch:     $vegetarisch                    -")
    println()
*/

}




