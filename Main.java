// Inside Main class
public static void addStudent() {
    System.out.print("Enter ID: ");
    int id = sc.nextInt();
    System.out.print("Enter Name: ");
    String name = sc.next();
    System.out.print("Enter Grade: ");
    String grade = sc.next();
    students.add(new Student(id, name, grade));
    System.out.println("Student added successfully.");
}