import java.util.Scanner
import kotlin.coroutines.coroutineContext

fun main(args: Array<String>) {

    var choose = 0;

    val scan = Scanner(System.`in`)

    val ut = Utility()
    
    val metodi = Metodi()

    while (choose != 4) {

        println("1: Inserisci auto");
        println("2: Stampa auto presenti in garage");
        println("3: Rimuovi auto");
        println("4: Esci");

        println("Scegli cosa fare:");
        choose = scan.nextInt()


        when(choose){

            1 -> {

                ut.stampa("ciao")
                metodi.add()

            }

            2-> {


            }

            3-> {

            }

            else -> println("Errore")

        }

    }



}