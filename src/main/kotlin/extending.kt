
open class Person(private var firstName:String, private var lastName:String){
    fun getFullName(){
        println("$firstName , $lastName")
    }
}

class Employees(firstName: String,lastName: String,var id:Int, var jobTitle:String,var payRate:Float):Person(firstName,lastName){

}


fun main(args: Array<String>){

    val clarence = Employees("Clarence","Jordan",1,"dev",1000.5F)

    clarence.getFullName()





}