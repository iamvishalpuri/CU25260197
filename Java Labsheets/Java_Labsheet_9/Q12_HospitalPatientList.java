import java.util.ArrayList;
import java.util.HashSet;

public class Q12_HospitalPatientList {
    public static void main(String[] args) {
        ArrayList<String> patientNames = new ArrayList<>();
        HashSet<String> patientIds = new HashSet<>();
        patientNames.add("Riya"); patientNames.add("Aman"); patientNames.add("Riya");
        patientIds.add("P101"); patientIds.add("P102"); patientIds.add("P101");
        System.out.println("Patient names: " + patientNames);
        System.out.println("Unique patient IDs: " + patientIds);
        patientNames.add("Karan");
        System.out.println("After adding patient: " + patientNames);
        System.out.println("Search Aman: " + patientNames.contains("Aman"));
    }
}

/*
Output:
Patient names: [Riya, Aman, Riya]
Unique patient IDs: [P101, P102]
After adding patient: [Riya, Aman, Riya, Karan]
Search Aman: true
*/
