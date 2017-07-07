/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umltest;

/**
 *
 * @author kmiller
 */
public class MyFinal {

    public MyController myController;

    public MyFinal(MyController mc) {
        myController = mc;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               MyFinal mf1 = new MyFinal(new ControllerTypeA());
            MyFinal mf2 = new MyFinal(new ControllerTypeB());

            mf1.myController.method1("From mf1");
            mf1.myController.method2(1);
            mf2.myController.method1("From mf2");
            mf2.myController.method2(2);
            try{System.in.read();} 
            catch(Exception e){}
}

}
