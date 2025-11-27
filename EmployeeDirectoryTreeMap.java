import java.util.*;

public class EmployeeDirectoryTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(1, "Safiya");
        employees.put(3, "Afseen");
        employees.put(4, "Ruman");
        employees.put(2, "Shabana");

        System.out.println("Employees (automatically sorted):");
        for (Integer id : employees.keySet()) {
            System.out.println(id + " -> " + employees.get(id));
        }
    }
}