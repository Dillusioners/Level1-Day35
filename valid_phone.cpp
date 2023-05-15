# include <iostream>

// function to reduce syntax for input
inline std::string input(std::string msg){
	std::string inp; // to store the input
	
	// asking user for the input
	std::cout << msg;
	std::cin >> inp;
	
	// returning the input
	return inp;
}

// execution starts from here
int main(int argc, char** argv){
	// variable declaration and asking for the phone number
	std::string str = input("Enter your phone number (donot use dashes, brackets and country code): ");
	
	// checking if the phone number has ten digits
	if(str.size() == 10) std::cout << "Valid phone number.";
	else std::cout << "Invalid phone number.";
}
