//Super Class
open class Object()
{
    fun supreme()
    {
        println("This is an object")
    }
}

// Sub Classes
open class Entity():Object()
{
    fun exists()
    {
        println("This is an Entity")
    }
}

open class Person():Object()
{
    fun living()
    {
        println("This is a Person and it is alive.")
    }

}

// Sub-sub Classes:
 class Building(var number:Int, var parking:Boolean, var floors:Int, var address:String):Entity() {
     fun numbers() {
        println("The number of your buildings are ${number} with ${floors} floors and it is placed on ${address} street")
        if (parking == true) {
            println("This building has parking lot")
        } else {
            println("This building doesnt have parking lot")
        }
    }
}

class Products():Entity()
{
    fun drinks()
    {
        println("What things you put in cart? : ")
        val stringInput = readLine()!!
        println("you have bought this: ${stringInput}")


    }
}

private class Truck(var drivers: Boolean):Entity()
{
    fun drive()
    {
        if(drivers == true)
        {
            println("This truck is driving right now")
        }
        else
        {
            println("The truck isn't moving")
        }
    }
}

class ShoppingCart(var person:String):Entity()
{
    private var Action: Boolean = true


    fun movingOn()
     {
        println("Is the cart moving? : ")
        val stringInput = readLine()!!
        if (stringInput == "1")
        {
            println("This Shopping Cart is pushed by a ${person}")
        }
        else
        {
            println("The Shopping Cart stopped moving")
        }
      }
}

class Cashier():Person()
{
    fun scan()
    {
        println("This Cashier just scanned your Products!")
    }

    fun collectMoney()
    {
        println("This Cashier collected your Money")
    }

    fun give()
    {
        println("This Cashier just gave you the receipt, change and a bag")
    }
}

class Buyer(var age:Int, var sex: String, var name:String):Person()
{
    fun walk()
    {
        println("The Buyer, "+ name +" is waling through supermarket ")
    }

    fun choose()
    {
        println("The Buyer is choosing the products")
    }

    fun give(product:Int, money:Int)
    {
        println("The Buyer gives " +product+" products " + money+" dollars to Cashier")
    }
}
class Food_preparator():Person()
{
    fun prepare()
    {
        println("Making food...")
    }
    fun packing()
    {
        println("Packing the food that was just made")
    }
}

class TruckDriver(var Truck_Model:String, var Truck_age:Int, var time: Int):Person()
{
    fun drives()
    {
        println("The Man is driving a "+Truck_Model+" Truck with "+Truck_age+" years of age")
    }

    fun sleeps()
    {
        if(time >= 8 && time<= 18)
        {
            println("The truck Drivers is working")
        }
        else
        {
            println("The Driver sleeps")

        }

    }

    fun deliver()
    {
        println("The Driver delivers food at the location")
    }
}

class SecurityGuard(var awake:Boolean, var gun:Boolean, var gipsy:Boolean,var pistol: String):Person()
{
    fun checks()
    {
        if(awake == true)
        {
            println("The guard is watching the cameras")
        }
        else
        {
            println("The guard still sleeps")
        }
    }
    fun arrests()
    {
        if(awake == true && gun == true && gipsy == true)
        {
            println("The Guard arrested the gipsy using ${pistol} pistol")
        }
        else
        {
            println("The guard still sleeps")
        }

    }
}

class StoreSupplier():Person()
{
    fun check()
    {
        println("The Supplier check the storage")
    }

    fun note()
    {
        println("The Supplier noted what he need to restore")
    }

    fun arranges()
    {
        println("The Supplier arranges the supplies on the shelfs")
    }
}


fun main(args: Array<String>) {

    // Entities:
    val market1 = Building(1, true, 2, "Stefan cel mare")

    market1.exists()
    market1.numbers()
    market1.supreme()

    println("")
    val product1 = Products()

    product1.supreme()
    product1.exists()
    product1.drinks()

    println("")
    val truck1 = Truck(true)

    truck1.supreme()
    truck1.exists()
    truck1.drive()

    println("")
    val cart1 = ShoppingCart("Buyer")

    cart1.supreme()
    cart1.exists()
    cart1.movingOn()

    //Persons:
    println("")
    val cashier1 = Cashier()

    cashier1.supreme()
    cashier1.living()
    cashier1.scan()
    cashier1.collectMoney()
    cashier1.give()

    println("")
    val buyer1 = Buyer(19,"male", "Stephen")

    buyer1.supreme()
    buyer1.living()
    buyer1.walk()
    buyer1.choose()
    buyer1.give(6,100)

    println("")
    val chef1 = Food_preparator()

    chef1.supreme()
    chef1.living()
    chef1.prepare()

    println("")
    val driver1 = TruckDriver("Mercedes", 10,12)

    driver1.supreme()
    driver1.living()
    driver1.drives()
    driver1.sleeps()

    println("")
    val guard1 = SecurityGuard(true,true,true,"P250")

    guard1.supreme()
    guard1.living()
    guard1.checks()
    guard1.arrests()
}
