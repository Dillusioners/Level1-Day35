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
	// variable declaration
	int count = std::stoi(input("Enter the total count for the list: ")), greatest, total = 0, inp;
	std::cout << "\n";
	
	// looping from 1 to count
	for(int i = 1; i <= count; i++){
		// asking user for the integer
		inp = std::stoi(input("Enter integer no." + std::to_string(i) + ": "));
		
		// if we are at the first iteration
		if(i == 1){
			// setting the greatest to the input and appending total
			greatest = inp;
			total++;
		}
		// if the given input is equal to the greatest, add one to total
		else if(greatest == inp) total++;
		// if the input is greater then the current greatest number
		else if(greatest < inp){
			// updating the greatest and setting the total to 0
			greatest = inp;
			total = 1;		
		}
	}
	
	// printing results
	std::cout << "\nThe greatest number in list is " << greatest;
	std::cout << "\nThis number has appeared in the list " << total << " times";
	return 0;
}
