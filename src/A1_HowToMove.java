public class A1_HowToMove extends World {
//comment
    public void go() { //method has parentheses

        System.out.println("This message will be printed to the window below.");
        plane.pausetime = 2; //no parentheses not method -- variable
        plane.startingAngle(180); // method
        plane.isTrail = true;
        plane.move(200);
        plane.isTrail = false;
        plane.move(100);
        plane.isTrail = true;
        plane.move(200);

    }

}

