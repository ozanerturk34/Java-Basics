// import Polymorphism.Polymorphism;
// import Encapsulation.Encapsulation;
// import CastingNumericalValues.CastingNumericalValues;
// import Interfaces.Interfaces;
// import AbstractClass.AbstractClass;

import ScannerClass.ScannerClass;

public class Application {
    public static void main(String[] args) {
        // Variable variableObj = new Variable();
        // variableObj.printVariable();
        // StringClass stringObj = new StringClass();
        // stringObj.printString();
        // While whileObj = new While();
        // whileObj.printWhile();
        // For forObj = new For();
        // forObj.printFor();
        // If ifObj = new If();
        // ifObj.printIf();
        // GettingUserInput gettingUserInput = new GettingUserInput();
        // gettingUserInput.print();
        // Switch switchClass = new Switch();
        // switchClass.print();
        // Array newArray = new Array();
        // newArray.print();
        // MultiDimensionalArray newMultiDimensionalArray = new MultiDimensionalArray();
        // newMultiDimensionalArray.print();
        // Objects newObjects = new Objects();
        // newObjects.print();
        // Car car = new Car();
        // Truck truck = new Truck();
        // Constructors constructors = new Constructors();
        // constructors.print();
        // StudentApp studentApp = new StudentApp();
        // studentApp.print();
        // CarApp carApp = new CarApp();
        // carApp.print();
        // Polymorphism polymorphism = new Polymorphism();
        // polymorphism.print();
        // Encapsulation encapsulation = new Encapsulation();
        // encapsulation.print();
        // CastingNumericalValues castingNumericalValues = new CastingNumericalValues();
        // castingNumericalValues.print();
        // Interfaces interfaces = new Interfaces();
        // interfaces.print();
        // AbstractClass abstractClass = new AbstractClass();
        // abstractClass.print();
        try {
            ScannerClass.getScannerClass().print();
        }catch(Exception e){
            System.out.println("Error");
            System.out.println(e);
        }
    }
}
