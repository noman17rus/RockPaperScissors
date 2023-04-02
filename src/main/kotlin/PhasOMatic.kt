fun main() {
    val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
    var x = 0;

    while (x < 4) {
        println("${hobbits[x]} is a good hobbit name")
        x += 1
    }


    val fireman = arrayOf("Pugh", "Pugh", "Barney McGrew", "Cuthbert", "Dibble", "Grub")
    var firemanNo = 0

    while (firemanNo < 6) {
        println("Firaman number $firemanNo is ${fireman[firemanNo]}")
        firemanNo += 1
    }

    val fruits = arrayOf("Banana", "Blueberry", "Pomegranate", "Cherry")
    var fruitnumber = 0

    while (fruitnumber < fruits.size){
        println("Fruit = ${fruits[fruitnumber]}")
        fruitnumber += 1
    }
}

