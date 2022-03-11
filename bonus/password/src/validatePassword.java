public class validatePassword {

    public static void main(String[] args) {

        checkPassword checkPw = new checkPassword();

        checkPw.setPassword("1234567891!0Al");

        checkPassword.checkLength(checkPw.getPassword());
    }
}
