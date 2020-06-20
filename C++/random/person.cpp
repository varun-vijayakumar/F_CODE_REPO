#include "person.h"

Person::Person(std::string fName, std::string lName, int pAge) :
    firstName(fName),
    lastName(lName),
    age(pAge)
{

}


std::string Person::getName() {
    return firstName + " " + lastName;
}

void Person::setFirstName(std::string fname) {
    firstName = fname;
}

void Person::setLastName(std::string lname) {
    lastName = lname;
}