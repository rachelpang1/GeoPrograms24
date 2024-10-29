public class B0_BasicLoop extends World {

    public void go() {
        plane.isTrail=true;
        plane.trailWidth=5;
        plane.pausetime =0;

            plane.teleport(50, 500);
            house();
            plane.teleport(100, 550);
            window();
            plane.teleport(300, 500);
            house();
            plane.teleport(350, 550);
            window();
            plane.teleport(550, 500);
            house();
            plane.teleport(600,550);
            window();

            plane.startingAngle(0);
            plane.teleport(-20,705);
            plane.setColor(162,227,172);
            plane.trailWidth=200;
            plane.move(1000);

            plane.teleport(50,100);
            clouds();
            plane.teleport(220,250);
            clouds();
            plane.teleport(500,160);
            clouds();

            plane.teleport(1000,-60);
        plane.setColor(255,181,81);
        plane.trailWidth=150;
            plane.circle(150);



        }





    public void house() { //define the square method
        plane.isTrail = true;
        plane.setColor(177,148,233);
        plane.trailWidth=5;
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
        plane.turn(94);
        plane.move(150);
        plane.isTrail = false;
        plane.turn(340);
        plane.move(30);
        plane.turn(90);
        plane.move(20);
        plane.isTrail = true;

    }

        public void window() {
        plane.setColor(255,199,187);
        plane.trailWidth=5;
        plane.startingAngle(90);
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

    }

    public void clouds() {
        plane.startingAngle(0);
        plane.setColor(137,207,240);
        plane.trailWidth=30;
        plane.move(40);
        plane.isTrail=false;
        plane.turn(90);
        plane.move(30);
        plane.turn(270);
        plane.isTrail=true;
        plane.trailWidth=60;
        plane.move(60);
        plane.isTrail=false;
        plane.turn(270);
        plane.move(20);
        plane.turn(90);
        plane.isTrail=true;
        plane.trailWidth=40;
        plane.move(20);
        plane.trailWidth=30;
        plane.move(70);

    }

    }

