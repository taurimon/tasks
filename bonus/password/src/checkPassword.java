public class checkPassword {
String password;



    public static boolean checkLength(String password) {
        if (password.length() >= 10) {
            if(checkChar(password)){
                System.out.println("Password is valid: " + password);
                return true;
            }
            else {
                return false;
            }
        }
        else {
            System.out.println("Password length should be at least 10 (your length: " + password.length() + ")");
            return false;
        }
    }

    public static boolean checkChar(String password) {
        int count = 0;
        boolean hasNum = false;
        boolean hasCap = false;
        boolean hasLow = false;
        char c; // if any of these has false - pw is invalid

        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i); // returns character at the specified index in a string

            if (!Character.isLetterOrDigit(c)) {
                System.out.println("Password can contain only letters and digits (you've entered: " + c + ")");
                return false;
            } else if (Character.isDigit(c)) { // checks whether a character in a loop has digit
                count++;
            } else if (Character.isLowerCase(c)) {
                hasLow = true;
            } else if (Character.isUpperCase(c)) {
                hasCap = true;
            }
            if(count > 1){
                hasNum = true;
            }

        }
        if(hasCap != true){
            System.out.println("You need to enter at least one upper case letter");
        } else if(hasLow != true){
            System.out.println("You need to enter at least one lower case letter");
        } else if(hasNum != true){
            System.out.println("You need to enter at least 2 digits");
        } else if(hasCap && hasNum && hasLow){
            return true;
        }

        return false;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
      return password;
    }
}