//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
names("Kenya","Malawi","Rwanda","Uganda")
towns()
arithmetic()
    println(words("faith","Eshe","Edna"))

}
//QUESTION1
//create a function that takes in 4 strings and creates an array out of them then prints out the array
fun names(country1:String,country2:String,country3:String,country4:String){
    var countries = arrayOf(country1,country2,country3,country4)
    println(countries.contentToString())
}
//QUESTION2
//create a function that given an array//
// var cities = arrayOf("harare","mumbai","dodoma",jakarta")prints out the names of the countries in correct grammatical order
fun towns() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEachIndexed{ index , x->
        for (index in arrayOf(0,1,2,3)){
            println(x.capitalize())
        }

    }


}
//QUESTION3
//create one function that is given the below array
// var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
//1.prints out the sum of the second and fifth elements
fun arithmetic(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1]+numbers[4])
//prints out the index of(158)
    var index = numbers.indexOf(158)
    println(index)
    //prints out the elements in  ascending order
    var sortedNumbers = numbers.sortedArray()
    println(sortedNumbers.contentToString())

}
//QUESTION4
//create a function that takes in 3 names and returns a string array containing all 3 names
fun words(name1:String,name2:String,name3:String):String{
    var names = arrayOf(name1,name2,name3)
    return (names.contentToString())
}



