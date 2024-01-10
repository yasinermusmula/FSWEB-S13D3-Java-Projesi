public class Person {
    String firstName;
    String lastName;
    int age;
    double myGrade;
    String myFriendName;
    double myFriendGrade;
public Person(String firstName, String lastName, int age){
    this.firstName=firstName;
    this.lastName=lastName;
    this.age =age;
 }

 public Person(String firstName, String lastName, int age,double myGrade,String myFriendName, double myFriendGrade){
    this(firstName,lastName,age);
    this.myGrade=myGrade;
    this.myFriendName=myFriendName;
    this.myFriendGrade=myFriendGrade;
 }

 public String getFirstName(){
    return firstName;
 }
 public String getLastName(){
    return lastName;
 }
 public int getAge(){
    return age;
 }
 public boolean isTeen(){
    if (age>= 13 && age<=19){
        return true;
    } return false;
 }
}

