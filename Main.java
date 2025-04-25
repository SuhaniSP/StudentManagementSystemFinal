

static void addStudent() {
    System.out.print("Enter Student ID: ");
    int id = sc.nextInt();
    sc.nextLine(); // Clear buffer
    System.out.print("Enter Student Name: ");
    String name = sc.nextLine();
    System.out.print("Enter Student Grade: ");
    String grade = sc.nextLine();
    students.add(new Student(id, name, grade));
    System.out.println("Student added successfully.");
    }
