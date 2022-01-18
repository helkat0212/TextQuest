import java.util.Scanner;

public class Superclass {
    private static final String KEY = "key";
    private static final String EMPTY_STRING = "";
    private static final String FINAL_KEY = "finalKey";
    private static final String RIFLE_AND_KEY = "rifle and key";

//    private boolean isOpen;

    public static void main(String[] args) {
        String inventory = EMPTY_STRING;
        boolean isAlive = true;
        boolean isOpen = false;
        boolean isChapter1 = true;

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Demo Escape Quest!");
        System.out.println("Your mission is get out from building and still alive");
        System.out.println("You stay in room with stone walls and two door`s. What you will do?");
        System.out.println("You can try to open door or check out room.");
        System.out.println("1 = Open first door");
        System.out.println("2 = Open second door");
        System.out.println("3 = Check out room");

        while (isChapter1) {
            System.out.println("Your input:");
            int input = in.nextInt();

//            switch (input) {
//                case 1:
//                    isChapter1 = playChapter1(inventory, isChapter1);
//                    break;
//                default:
//
//            }

            if (input == 1) {
                if (inventory.equals(KEY)) {
                    isOpen = true;
                    System.out.println("You open the door!");
                    if (isOpen) {
                        isChapter1 = false;
                    }
                } else {
                    System.out.println("You try to open the first door and hear wind. That`s mean that is exit behind this door but you need to find the key.");
                }
            } else if (input == 2) {
                if (inventory.equals(KEY)) {
                    isOpen = true;
                    isAlive = false;
                    System.out.println("You open the door and see the hungry lion what kill you!");
                    System.out.println("Game Over!");
                    break;
                } else {
                    System.out.println("You try to open the second door and hear something angry behind it.");
                }

            } else if (input == 3) {
                System.out.println("You check out the room and see wormhole. In this wormhole you find the key from one of doors");
                inventory = KEY;
            } else {
                System.out.println("Wrong input!");
            }


        }

        boolean isChapter2 = true;
        boolean isProblemSolved = false;

        if (isAlive) {
            System.out.println("You go to small room with small blocked window. There is another door and some kind mathematical problem");
            System.out.println("1 = See into window");
            System.out.println("2 = See onto mathematical problem");
            System.out.println("3 = Try to open this door");
            System.out.println("4 = Go back in first room");

            while (isChapter2) {
                System.out.println("Your input:");
                int input = in.nextInt();
                if (input == 1) {
                    System.out.println("In window you see a hungry lion before second door!");
                } else if (input == 2) {
                    System.out.println("You see a problem: 2+2*2");
                    System.out.println("You need to write answer right here or You will die!");
                    int in2 = in.nextInt();
                    System.out.println("Its your answer " + in2);
                    if (in2 == 6) {
                        System.out.println("You got a rifle!");
                        inventory = RIFLE_AND_KEY;
                        isProblemSolved = true;
                    } else if (isProblemSolved) {
                        System.out.println("There is nothing.");
                    } else {
                        System.out.println("You die! Game over!");
                        break;
                    }
                } else if (input == 3) {
                    if (inventory.equals(FINAL_KEY)) {
                        isChapter2 = false;
                        System.out.println("You escape! You win!");
                    } else {
                        System.out.println("Door closed! Your key doesn`t working");
                    }

                } else if (input == 4) {
                    if (inventory.equals(RIFLE_AND_KEY)) {
                        System.out.println("You open second door and kill lion!");
                        System.out.println("Behind lion you find another key and take it!");
                        inventory = FINAL_KEY;
                    } else {
                        System.out.println("There is nothing.");
                    }

                } else {
                    System.out.println("Wrong input!");
                }
            }
        } else {
            System.out.println("Goodbye!");
        }
    }

//    private static boolean playChapter1(String inventory, boolean isChapter1) {
//        boolean isOpen;
//        if (inventory.equals(KEY)) {
//            isOpen = true;
//            System.out.println("You open the door!");
//            if (isOpen) {
//                isChapter1 = false;
//            }
//        } else {
//            System.out.println("You try to open the first door and hear wind. That`s mean that is exit behind this door but you need to find the key.");
//        }
//        return isChapter1;
//    }
}




