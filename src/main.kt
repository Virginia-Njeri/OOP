fun main() {
    var Mwanafunzi=Human("Joyce",24,56)
    Mwanafunzi.eat(4)
    println(Mwanafunzi.weight)
    Mwanafunzi.speak("msema kesho ni mwongo")
    Mwanafunzi.birthday()
    var Id=User("Virginia","wanjiru","virginia@gmail.com",57552577,2017)
println(Id.email)
    println(Id.firstName)



}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        weight+=foodWeight
        var Statement="I am eating $foodWeight kgs of food"
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age+=1
        println(age)
    }


 }




data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:Int,var password:Int){

}




