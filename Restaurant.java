import java.util.*;
public class Restaurant {
    static String username;
    static String pass;
    static String phone;
    static ArrayList<String> cart = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for( ; ; ) {
            System.out.println();
            System.out.println("    * * * * *   WELCOME TO TAJ  * * * * *");
            System.out.println();
            System.out.println("1. Sign up");
            System.out.println("2. Sign in");
            System.out.println();
            System.out.print("Enter an option : ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    createAccount(sc);
                    break;
            
                case 2:
                    login(sc);
                    break;

                default:
                    System.out.println("Wrong option entered...");
                    break;
            }
        }
    }


    public static void createAccount(Scanner sc) {
        System.out.println();
        System.out.println("CREATE ACCOUNT");
        System.out.println();
        System.out.print("Username : ");
        username = sc.next();
        System.out.print("Password : ");
        pass = sc.next();
        System.out.print("Contact number : ");
        phone = sc.next();
        System.out.println("Account created");
        System.out.println();
    }


    public static void login(Scanner sc) {
        if(username != null) {
            for(int i=1; i<=3; i++) {
                System.out.println(" ");
                System.out.println("LOGIN PAGE");
                System.out.println();
                System.out.print("Username/Contact : ");
                sc.nextLine();
                String un1 = sc.nextLine();
                System.out.print("Password : ");
                String pass1 = sc.next();


                if(((un1.equals(username)) || (un1.equals(phone))) && (pass1.equals(pass1))) {
                    homePage(sc);
                }
                else {
                    System.out.println();
                    System.out.println("Wrong Cart Entered");
                    System.out.println();
                }
            }
            System.exit(0);`
        }
        else {
            System.out.println("Create Your Account First");
        }
    }

    public static void homePage(Scanner sc) {
        for( ; ; ) {
            System.out.println();
            System.out.println("HOME PAGE");
            System.out.println();
            System.out.println("1. VEG MENU");
            System.out.println("2. NON-VEG MENU");
            System.out.println("3. CHECKOUT");
            System.out.println("4. LOGOUT");
            System.out.println();

            System.out.print("Enter an option : ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    vegMenu(sc);
                    break;
            
                case 2:
                    nonVegMenu(sc);
                    break;

                case 3:
                    checkOut(sc);
                    break;

                case 4:
                    System.out.println("THANK YOU, PLEASE NEVER VISIT AGAIN...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong option entered...");
                    break;
            }
        }
    }

    public static void vegMenu(Scanner sc) {
        for( ; ; ) {
            System.out.println();
            System.out.println("VEG DISHES");
            System.out.println("101. Paneer Tikka : 200");
            System.out.println("102. kaju Curry : 300");
            System.out.println("103. Veg Maratha : 350");
            System.out.println("104. Dal Tadka : 200");
            System.out.println("105. Veg Biryani : 400");
            System.out.println("106. Menu");
            System.out.println();

            System.out.print("Enter a dish id : ");
            int id = sc.nextInt();

            switch(id) {
                case 101 :
                    cart.add("PannerTikka : 200");
                    System.out.println("Paneer Tikka added inside the cart");
                    break;

                case 102 :
                    cart.add("KajuCurry : 300");
                    System.out.println("Kaju Curry added inside the cart");
                    break;

                case 103 :
                    cart.add("VegMaratha : 200");
                    System.out.println("Veg Maratha added inside the cart");
                    break;

                case 104 :
                    cart.add("DalTadka : 200");
                    System.out.println("Dal Tadka added inside the cart");
                    break;

                case 105 :
                    cart.add("VegBiryani : 200");
                    System.out.println("Veg Biryani added inside the cart");
                    break;

                case 106 :
                    return;

                default :
                    System.out.println("Wrong Dish Id");
                    break;
            }
        }
    }

    public static void nonVegMenu(Scanner sc) {
        for( ; ; ) {
            System.out.println();
            System.out.println("NON-VEG DISHES");
            System.out.println("107. Chicken Tikka : 200");
            System.out.println("108. Chicken Curry");
            System.out.println("109. Chicken Biryani");
            System.out.println("110. Menu");

            System.out.print("Enter an option : ");
            int option = sc.nextInt();

            switch (option) {
                case 107 :
                    cart.add("ChickenTikka : 200");
                    System.out.println("Chicken Tikka added inside the cart");
                    break;

                case 108 :
                    cart.add("ChickenCurry : 300");
                    System.out.println("Chicken Curry added inside the cart");
                    break;

                case 109 :
                    cart.add("ChickenBiryani : 200");
                    System.out.println("Chicken Biryani added inside the cart");
                    break;

                case 110 :
                    return;
            
                default:
                    System.out.println("Wrong Dish Id");
                    break;
            }
        }
    }

    public static void cart() {
        System.out.println("YOUR PURCHASED FOOD");
        System.out.println();
        
        for(String food : cart) {
            System.out.println(food);
        }
    }

    public static void checkOut(Scanner sc) {
        System.out.println("CHECKED TOMO");
        cart();
    }

}