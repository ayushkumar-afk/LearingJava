
class Keyboard {
    private int keys;
    String Colors;


    public void pressed(){
        System.out.println("Pressed!");

    }



    public void throwit(){
        System.out.println("Throw!"+keys);
        keys = 18;
    }
}
class AdvKeyborad extends Keyboard {
    public void unPressed(){
        System.out.println("Unpressed!");
    }
    public void pressed(){
        System.out.println("Pressed by AdvKEYBOARD !");

    }
}


// final constant value dont change it is thougout the code
//ambuguity issue in the java for the mutliple inheritance so thats why they have removed it
//METHOD OVERLOADING( inside the same class) - here we can have the same method name with the differnet parameter or the other one cannot have it
//POLYMORHPHISM - samething with the differnet behaviour callled the same Method but the object is that it matter of which you have made then its blueprint will be there for it.
//METHOD OVERRIDING( same method name in different classes here )
// Abstraction is like hiding of the work we know that we can use the car but its of no use how the engine is working like what kind of pistons it is Using
// Static Varibales or the Methods can be Direclty be Called by the Classes And shares the single Value as they are stored Elsewhere and we call them wihtout the obj
public class Main {
    public static void main(String[] args) {
        int num;
        num =8;

        Keyboard keyboardobj;
        keyboardobj = new AdvKeyborad();

        keyboardobj.pressed();






    }
}


//encapsulation is a Method is which we Bind our Vardiables with the methods so that we will be able to access the private variable of the class with the setter and getter methods

