# Threads
Was sind Threads und wof?r werden diese be?tigt?
Threads sind verschiedene "F?den" eines Programms, die gleichzeitig ablaufen Anders als Prozess teilen sie sich denselben Adressraum (=dieselebn Daten)

## Was bedeutet preemitiv?
Die Java Virtual Machine kann den Threads jederzeit Rechenzeit entziehen

Wann endet ein Programm, dass aus meeheren Threads besteht?
Es endet, sobalt alle Threads abgearbeitet sind.

## Was ist die Synchrononisierung von Threads?
Ein thread kann damit bereiche eines Objects sperren, so dass ein anderer Thread warten muss, wenn er gleichzeitig versucht, auf diesen Bereich zuzugreifen.

## Wie erreicht man, dass Threads warten oder unterbrochen werden?
Mit wait() und notify()

## Was ist ein Deamon-Thread?
Sind Threads die zur unterst?tzung anderer threads dienen und aktiviert werden falls ungenutzte rechenzeit vorhanden ist.
Deamon thread werden aktiv, wenn ungenutzte Rechenzeit vorhanden ist. z.B. der Garbage collector von java dieser l?scht nicht mehr genutzte Ressourcen im Speicher.
