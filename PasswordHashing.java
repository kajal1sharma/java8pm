import java.security.MessageDigest;

class PasswordHashing{
    public static void main(String[] args) {
        String password = "1234";
        // =>[23,34,56,78,45,32,12,54,56,67,34,32,32,32];
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");    
            md.update(password.getBytes());
            byte[] hashedPassword =  md.digest();

            String s="";
            for(byte b :  hashedPassword){
                s+=String.format("%02x", b);
            }

            System.out.println(s);
        }
        catch(Exception e){

        }
    }
}