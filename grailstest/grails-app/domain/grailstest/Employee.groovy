package grailstest

class Employee {

    static constraints = {
        firstName       blank: false, maxSize: 40, notEqual: 'testEquals'
        lastName       blank: false, maxSize: 40, notEqual: 'testEquals'
    }
    String firstName
    String lastName
}
