import dto.UserDTO;
import dto.UserDTORecord;

public class Main {

    public static void main(String[] args) {
        var user = new UserDTO("Michaela", 34);
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("ToString: " + user.toString());

        System.out.println("------------------------------------");

        var userRecord = new UserDTORecord("Jared", 38);
        System.out.println("Record Name: " + userRecord.name());
        System.out.println("Record Age: " + userRecord.age());
        System.out.println("Record ToString: " + userRecord.toString());
        System.out.println("Record static var: " + userRecord.STATUS);
        System.out.println("Record method: " + userRecord.getUpperName());
    }
}
