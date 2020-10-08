public class EncapTest {
    private String name;
    private String idNum;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }
    public void setIdNum(String newId) {
        idNum = newId;
    }
}

//the setter and getter methods are the access points of the instances
//variables of the EncapTest class. 
//Normally, these methods are referred as getters and setters
//the getter and setter methods are public, the actual vars are private