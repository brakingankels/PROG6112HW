package org.example;

public class Exercise19 {
    public static void main(String[] args) {
        String[] lockers = new String[100];
        //methods to clas lockers, studentLockerchangers
        closeAllLockers(lockers);
        studentLockerChanges(lockers);
        print(lockers);
    }

    public static boolean isOpen(String l) {
        return l == "OPEN";
    }

    public static void closeAllLockers(String[] lockers) {
        for (int i = 0; i < lockers.length; i++) {
            lockers[i] = "CLOSED";
        }
    }


    public static void studentLockerChanges(String[] lockers) {
        int start = 0; // Locker student begins with

        for (int s = 1; s <= lockers.length; s++) {
            for (int l = 0; l < lockers.length; l += s) {
                if (isOpen(lockers[l]))
                    lockers[l] = "CLOSED";
                else
                    lockers[l] = "OPEN";
            }
            start++;
        }
    }

    public static void print(String[] lockers) {
        for (int i = 0; i < lockers.length; i++) {
            if (isOpen(lockers[i])) {
                System.out.print("L" + (i + 1) + " ");
            }
        }
        System.out.println();
    }
}
