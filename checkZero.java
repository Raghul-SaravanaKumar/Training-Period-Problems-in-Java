public record checkZero() {
    public static void main(String[] zero) {
        String a = "9876543210";
        if (a.contains("0")) {
            System.out.println("The string contains zero.");
        } else {
            System.out.println("The string does not contain zero.");
        }
    }
}
