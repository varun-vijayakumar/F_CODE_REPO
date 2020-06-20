#include <string>

class Person {
    private :
        std::string firstName;
        std::string lastName;
        int age;

    

    public:
        Person(std::string fName, std::string lName, int pAge);
        Person() = default;
        std::string getName();
        void setFirstName(std::string fname);
        void setLastName(std::string lname);
};