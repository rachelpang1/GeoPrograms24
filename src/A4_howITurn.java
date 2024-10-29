public class A4_howITurn extends World {

    public void go() {

        plane.startingAngle(90);
        plane.pausetime=0;
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);


        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(130);
        plane.turn(90);
        plane.move(60);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(60);
        plane.turn(90);
        plane.move(100);
        plane.move(20);
        plane.turn(90);
        plane.move(200);
        plane.turn(45);
        plane.move(150);
        plane.turn(90);
        plane.move(150);
        plane.teleport(250,310);
        plane.setColor(0,0,200);
        plane.trailWidth=5;
        plane.turn(45);
        plane.move(50);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(25);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(25);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(50);
        plane.teleport(600,700);
    }

    public void square() { //define the square method
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
    }


}


