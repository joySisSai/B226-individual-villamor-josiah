package day25.activity;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity16_TodoManager {
    static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                printMenu();
                String choice = scanner.nextLine().trim();

                switch (choice) {
                    case "1" -> addTask(tasks, scanner);
                    case "2" -> viewTasks(tasks);
                    case "3" -> updateTask(tasks, scanner);
                    case "4" -> removeTask(tasks, scanner);
                    case "5" -> clearTasks(tasks);
                    case "6" -> {
                        running = false;
                        System.out.println("Goodbye!");
                    }
                    default -> System.out.println("Invalid choice. Please enter a number from 1 to 6.");
                }
            }
        }
    }

    static void printMenu() {
        System.out.print("""
                
                ========== TO-DO LIST MANAGER ==========
                1. Add a task
                2. View all tasks
                3. Update a task
                4. Remove a task
                5. Clear all tasks
                6. Exit
                Enter your choice:\s""");
    }

    static void addTask(ArrayList<String> tasks, Scanner scanner) {
        System.out.print("Enter the task to add: ");
        String task = scanner.nextLine().trim();
        if (task.isEmpty()) {
            System.out.println("Task cannot be empty.");
        } else {
            tasks.add(task);
            System.out.println("Task added.");
        }
    }

    static void viewTasks(ArrayList<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
            return;
        }
        System.out.println("--- Your Tasks ---");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    static void updateTask(ArrayList<String> tasks, Scanner scanner) {
        int index = promptForTaskNumber(tasks, scanner, "update");
        if (index == -1) {
            return;
        }
        System.out.print("Enter the new task: ");
        String task = scanner.nextLine().trim();
        if (task.isEmpty()) {
            System.out.println("Task cannot be empty.");
        } else {
            tasks.set(index, task);
            System.out.println("Task updated.");
        }
    }

    static void removeTask(ArrayList<String> tasks, Scanner scanner) {
        int index = promptForTaskNumber(tasks, scanner, "remove");
        if (index != -1) {
            System.out.println("Removed: " + tasks.remove(index));
        }
    }

    static void clearTasks(ArrayList<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("The list is already empty.");
        } else {
            tasks.clear();
            System.out.println("All tasks cleared.");
        }
    }

    // Prompts for a 1-based task number and returns the 0-based index,
    // or -1 if the list is empty or the input is invalid.
    static int promptForTaskNumber(ArrayList<String> tasks, Scanner scanner, String action) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to " + action + ".");
            return -1;
        }
        System.out.print("Enter the task number to " + action + ": ");
        try {
            int number = Integer.parseInt(scanner.nextLine().trim());
            if (number >= 1 && number <= tasks.size()) {
                return number - 1;
            }
        } catch (NumberFormatException ignored) {
        }
        System.out.println("Invalid task number.");
        return -1;
    }
}
