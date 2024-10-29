public class B1_MoreLoop extends World {

    public void go() {
        plane.pausetime = 0;
        plane.trailWidth = 1;

        for (int y = 0; y < 800; y = y + 20) {
            for (int x = 0; x < 1000; x = x + 20) {
                plane.teleport(x, y);
               plane.setColor(50,200,x/4);
                square(20);
                System.out.println("x: " + x);
            }

        }
    }
    //        plane.teleport(300, 300);
//        hexagon(200);
    public void square(int distance) { //distance is the parameter
        for (int z = 0; z < 4; z=z+1){
            plane.isTrail = true;
            plane.move(distance);
            plane.turn(90);
            System.out.println("z: " + z);
        }
    }

    public void hexagon(int length){
        for (int y = 0; y < 6; y=y+1) {
            plane.isTrail = true;
            plane.move(length);
            plane.turn(60);
            System.out.println("y:" + y);
            //level 4 draw a shape with n number of sides where n is a parameter
        }

    }
}

