package TaskManagementSystem;

public class TaskManagementSystemTest {
        public static void main(String[] args) {
            SinglyLinkedList taskList = new SinglyLinkedList();

            Task t1 = new Task("T001", "Design System Architecture", "In Progress");
            Task t2 = new Task("T002", "Implement Login Module", "Not Started");
            Task t3 = new Task("T003", "Set Up CI/CD Pipeline", "Completed");

            taskList.addTask(t1);
            taskList.addTask(t2);
            taskList.addTask(t3);

            System.out.println("Traversing Task List:");
            taskList.traverseTasks();

            System.out.println("\nSearching for Task with ID T002:");
            Task searchedTask = taskList.searchTaskById("T002");
            System.out.println(searchedTask != null ? searchedTask : "Task not found");

            System.out.println("\nDeleting Task with ID T001:");
            boolean isDeleted = taskList.deleteTaskById("T001");
            System.out.println("Deleted: " + isDeleted);

            System.out.println("\nTraversing Task List after deletion:");
            taskList.traverseTasks();
        }
}
