import java.util.Scanner

class Metodi {


    var scan = Scanner(System.`in`)

    var automobile = Automobile("", "")

    var arraylist = ArrayList<Automobile>()

    fun add (){

        arraylist.add(0, Automobile("proprietario","targa"))
        arraylist.add(1, Automobile("proprietario2","targa"))
        arraylist.add(2, Automobile("proprietario3","targa"))

        for (i in arraylist){
            println(automobile.proprietario)
        }

        arraylist.forEach(){

        }

    }
}
