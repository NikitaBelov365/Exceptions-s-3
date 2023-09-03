public class FieldNumberVerifier {
    public static int statusCode(String[] enteringArr) {
        int status = 0;
        int normalFieldAmmount = 6;
        if(normalFieldAmmount == enteringArr.length) {
            status = 1;
        } else if (normalFieldAmmount > enteringArr.length) {
            status = 2;
        } else status = 3;
        return status;
    }
}
