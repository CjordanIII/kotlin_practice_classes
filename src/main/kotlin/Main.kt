class Employee(var id:Int, var firstName:String, var lastName:String , var jobTitle: String,var payRate: Float){
    fun promote(newJobtitle:String,newPayRate:Float){
        jobTitle = newJobtitle
        payRate = newPayRate
    }
    fun getIntro(){
        println("hello my name is $firstName , $lastName and I do $jobTitle for a living and I make $payRate")
    }
}



fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val employee1 = Employee(1,"Ian","Auston","Graphic Artist",42.50F)
    println("Employee ${employee1.firstName} created")
    println("Job title is ${employee1.jobTitle}")
    println("Pay rate is $${employee1.payRate}")
    employee1.promote("Sr. Graphic Artist",46.75F)
    println("Job title is ${employee1.jobTitle}")
    println("Pay rate is $${employee1.payRate}")
    employee1.getIntro()
}