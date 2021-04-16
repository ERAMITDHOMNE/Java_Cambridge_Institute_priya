Code 5.3 ,page number - 168
// how you can add element to arraylist which is collection ,Java Program
// this is library and package you can say which we use to import Arraylist and Random java class from util package to use in our program
import java.util.ArrayList;
import java.util.Random;
/**
* The responder class represents a response-generator object.
* It is used to generate an automatic response by randomly
* selecting a phrase from a predefined list of responses.

@author Michael Kölling and David J. Barnes
* @version 0.2 (2011.07.31)
*/
// actual class which is name as Responder , public means it is accessible to all
public class Responder
{
	// it is having 2 variable firstone randomGenerator
//Classes define types. A class name can be used as the type for a variable. Variables that have a class as their type can store objects of that class
private Random randomGenerator;
private ArrayList<String> responses;
/**
* Create a responder.
*/
// Responder is one constructor ,who intialize value to the variable
// so once we create class object the whole class will get space in memory and  processing can be perform on class code
public Responder() // constructor
{
	
randomGenerator = new Random(); // act as object to hold variable and value
responses = new ArrayList<String>(); // act as object to hold variable and value
fillResponses();  // this is one method used to add element in collection Arraylist
}
/**
* Generate a response.
* @return A string that should be displayed as the
* response
*/
public String generateResponse() // this is another method generate Response 
{
	// this method will going to generate response based on element added on list(i.e arraylist) based on index of data in array list
// Pick a random number for the index in the default response
// list. The number will be between 0 (inclusive) and the size
// of the list (exclusive).
int index = randomGenerator.nextInt(responses.size()); // based on index 0 to 9
return responses.get(index); // return on screen the content of arraylist based on index vaue randomly generated from 0 to 8 , 1 to 9
}
/**
* Build up a list of default responses from which we can
* pick one if we don’t know what else to say.
*/
private void fillResponses()  // fillresponse method is calling by Responder contructor
{
//	.add function is predefined ,used to add element in arraylist,response is name of arraylist
responses.add("That sounds odd. Could you describe \n" + "that problem in more detail?");
responses.add("No other customer has ever \n" + "complained about this before. \n" + "What is your system configuration?");
responses.add("That’s a known problem with Vista." + "Windows 7 is much better.");
responses.add("I need a bit more information on that.");
responses.add("Have you checked that you do not \n" + "have a dll conflict?");
responses.add("That is explained in the manual. \n" + "Have you read the manual?");
responses.add("Your description is a bit \n" + "wishy-washy. Have you got an expert \n" + "there with you who could describe \n" + "this more precisely?");
responses.add("That’s not a bug, it’s a feature!");
responses.add("Could you elaborate on that?");
}
}





