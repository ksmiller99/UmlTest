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
public class ControllerTypeA implements MyController {

    @Override
    public void method1(String str) {
        System.out.println("This is controller type A and the string is: " + str);
    }

    @Override
    public void method2(int num) {
        System.out.println("This is controller type A and the number is: " + num);
    }

}
