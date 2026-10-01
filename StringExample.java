class StringExample {
    public static void main(String[] args) {

        String str = "Hello Java";

        System.out.println("String: "+str);
        System.out.println("Length: " +str.length());
        System.out.println("Character: " +str.charAt(3));
        System.out.println("Uppercase: " +str.toUpperCase());
        System.out.println("Lowercase: " +str.toLowerCase());
        System.out.println("Substring: " +str.substring(2, 4));
        System.out.println("Contains Java: " +str.contains("hel") );
        System.out.println("Replace: " +str.replace("java","world"));
    }
}