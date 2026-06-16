public class Strings {
    public static void main(String[] args) {
        String greeting = "    Hello, World!    ";
        System.out.println(greeting);
        
        // String methods
        System.out.println("Length: " + greeting.length());
        System.out.println("Trimmed: " + greeting.trim());
        System.out.println("Uppercase: " + greeting.toUpperCase());
        System.out.println("Lowercase: " + greeting.toLowerCase());
        System.out.println("Substring (7, 12): " + greeting.substring(7, 12));
        System.out.println("Replace 'World' with 'Java': " + greeting.replace("World", "Java"));
        System.out.println("Contains 'Hello': " + greeting.contains("Hello"));
        System.out.println("Starts with '    H': " + greeting.startsWith("    H"));
        System.out.println("Ends with '    ': " + greeting.endsWith("    "));
        System.out.println("Index of 'o': " + greeting.indexOf('o'));
        System.out.println(greeting);
    }
}