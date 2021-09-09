/* Stack diagram
anden gang zoop er kaldt, er bizz =5, buzz =2, bob = 2

bizz =5
buzz =2
(bob =5 føste gang)
bob =2

OUTPUT:
just for
any not more
It's breakfast
!

*/

package com.company;


public class Main {


    public static void zoop(String fred, int bob) { //5 : 15
        System.out.println(fred);                   //6 : 16
        if (bob == 5) {                             //7
            ping("not ");                //8->
        } else {                                    //    17
            System.out.println("!");                //    18
        }
    }
    public static void main(String[] args) {    //1
        int bizz = 5;                           //2
        int buzz = 2;                           //3
        zoop("just for", bizz);            //4->
        clink(2 * buzz);                   //11->
    }
    public static void clink(int fork) {        //12
        System.out.print("It's ");              //13
        zoop("breakfast ", fork);          //14->
    }
    public static void ping(String strangStrung) {          // 9
        System.out.println("any " + strangStrung + "more ");//10 tilbage
    }

}
