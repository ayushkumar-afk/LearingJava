
class Keyboard {
    private int keys;
    String Colors;
    public Keyboard() {
                         // when we create the constructor when the object is called it directly takes the value from here
        Colors = "Red";
    }// these are the instance varibales that are Stored with the object

    public void setkey(int keys){
    this.keys = keys;
    }
    public void pressed(){
        System.out.println("Pressed!");

    }



    public void throwit(){
        System.out.println("Throw!"+keys);
        keys = 18;
    }
}


// final constant value dont change it is thougout the code
//ambuguity issue in the java for the mutliple inheritance so thats why they have removed it


public class Main {
    public static void main(String[] args) {
        int num;
        num =8;

        Keyboard keyboardobj = new Keyboard();
        keyboardobj.pressed();
        keyboardobj.throwit();
        System.out.println(keyboardobj.Colors);

    }
}


//encapsulation is a Method is which we Bind our Vardiables with the methods so that we will be able to access the private variable of the class with the setter and getter methods

