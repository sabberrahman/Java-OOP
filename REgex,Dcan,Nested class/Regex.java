
package regaxandother;


public class User {
    public static void main(String[] args) {
        String username = "sabberrahman12345";
        String userRegex ="^[a-zA-Z0-9+_.-]{4,18}$"; // no special chararcter 4 to 18 chAR
        
        String usernameWSpecial = "$sabber.rahman_10@gg";
        String userRegexWithSpecial ="^[a-zA-Z0-9+_.-@&*$]+$";
        
        String password = "sabberrahman12345";
        
        String phone = "+8801709323204";
         String phoneREgex = "^[[+]?0-9+]{10,14}$";
        
        String phoneWSpecial = "+88-01709823204";
        String SimplePhoneRegex = "^\\+?\\d{2,3}-\\d{11}$";
        
        System.out.println(username.matches(userRegex));
        System.out.println(usernameWSpecial.matches(userRegexWithSpecial));
        System.out.println(phone.matches(phoneREgex));
        System.out.println(phoneWSpecial+" : "+phoneWSpecial.matches(SimplePhoneRegex));
        

        
        
    }
}
