public class Salutation {
    public static void main(String[] args) {
        String nom = args.length > 0 ? args[0] : "monde";
        System.out.println("Bonjour, " + nom + " !");
        System.out.println("version de java : " + System.getProperty("java.version"));
    }
}