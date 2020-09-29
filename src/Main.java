public class Main {

    public static void main(String[] args) {

        for (Romersksiffra r : Romersksiffra.values()){
            System.out.println(r + " is "
                    + r.getDigit() +" "+r.getString());
        }

        System.out.println("HEJ HEJ HEJ");

    }
}
