package grailstest



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Employee)
class EmployeeTests {

    void testEmployeeConstraints() {
       def emp = new Employee(firstName: "Chris", lastName: "Collison")
       //mockForConstraintsTests(Employee, [emp])
       assert emp.validate()
       
       def emp2 = new Employee()
       assert !emp2.validate()
    }
    
    void testEmployeeThings() {
       def emp = new Employee(firstname: "REALLLYLONGFIRSTNAMELIKEMORETHAN40CHARACTERSANDSTUFF", lastName: "Blah")
       assert !emp.validate()
    }
}
