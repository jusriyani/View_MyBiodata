public class BasicJava{
    //this is constant
    String username;
    // this variable only run in build time-->hanya menampung value pada saat build time, artinya hanya bersifat sementara
    final String lastName = "World"; 
    //perbedaan constant dan final: constant itu memiliki nilai yang mutlak, sedangkan final ada terdapat penambahan value saat kode dijalankan
    
    public static void main(String[] args){
        // int integerNumber;
        // integerNumber = 1210;
        // System.out.println(integerNumber);
        String firstName = "1234";
       // String lastName = "Sirait ";
       // String thirdName = "Beautiful";
        int number = 1999;
       // int number2 = 1234;
       // double dollar = 10.14;
        System.out.println(firstName + number);
    }

}

    //String string = "Hello World";
    //int integerNumber = 12345;
    //double floatNumber = 12.99; //double biasanya dipake utk mata uang
    //boolean trueValue = true; //boolean hanya menerima true atau false
    //boolean falseValue = false;
    //char charValue = 'A'; //hanya menerima satu value, jarang digunakan
    //tipe data yang biasa digunakan String, int, double, boolean.