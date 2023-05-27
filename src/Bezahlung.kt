fun main() {
    println("Willkommen! Bitte geben Sie die folgenden Informationen ein:")

    print("Name: ")
    val name = readLine()

    print("Vorname: ")
    val vorname = readLine()

    print("E-Mail: ")
    val email = readLine()

    print("Telefonnummer: ")
    val telefonnummer = readLine()

    print("Geburtsjahr: ")
    val geburtsjahr = readLine()?.toIntOrNull()

    print("Ziel: ")
    val ziel = readLine()

    print("Vegetarisch (Ja/Nein): ")
    val vegetarischInput = readLine()

    val vegetarisch = vegetarischInput?.equals("Ja", ignoreCase = true) ?: false

    println("\nBoardingpass:")
    println("Name: $vorname $name")
    println("E-Mail: $email")
    println("Telefonnummer: $telefonnummer")
    println("Geburtsjahr: $geburtsjahr")
    println("Ziel: $ziel")
    println("Vegetarisch: ${if (vegetarisch) "Ja" else "Nein"}")
}