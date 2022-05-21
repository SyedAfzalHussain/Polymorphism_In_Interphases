/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprogram.newpackage;

/**
 *
 * @author TECHNIFI
 */
public class CellPhone {
    void call(){
        System.out.println("Calling...");
    }
}
interface Gps{
    void allowLocationing();
}
interface Camera{
    void openCamera();
}
class SmartPhone extends CellPhone implements Gps,Camera{

    @Override
    public void allowLocationing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public void openCamera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    
}
class Check{
    public static void main(String[] args){
        Camera c=new SmartPhone();
        CellPhone cell=new SmartPhone();
        SmartPhone smart=new SmartPhone();
//        smart.allowLocationing();//Allow all functions because we have the reference of SmartPhone and SmartPhone Inherits all the functionality...
       
//        cell.openCamera();//throw an error because it is not inherited from Cellphone -->openCamera method is inherited from interface Camera.
//        c.allowLocationing(); //Throws an error ...
    }
}