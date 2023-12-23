package class4;

public class E1NestedIf {
    public static void main(String[] args) {
        boolean isMainDoorIsClosed = true;
        boolean isRoom1Isopened = false;
        boolean isRoom2Opened = true;

        if (isMainDoorIsClosed) {
            if (isRoom1Isopened)
                System.out.println("we are entering the house ");
            {
                System.out.println("we are in room 1");
            }
        } else {
            System.out.println("room 1 is closed ");
        }
    }

        }







