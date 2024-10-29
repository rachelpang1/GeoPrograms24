public class FinalFilter extends World {
    public int red;
    public int blue;
    public int green;

    public void go(){
        plane.loadBackGround("stitch.png");
        plane.showBackGround();
        plane.pausetime=0;

        purpleFilter(); //shade body
        whiteFilter(); //shade fur
        star(); //draw star on his head
        plane.startingAngle(0);
        background(); // draw background
        //shade half of his nose black, half white





    }//end of go method
    public void purpleFilter(){ // make gradient
        for (int y = 0; y < 800; y = y + 1) {
            for (int x = 0; x < 1000; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if(red > 90 && red < 100 && blue > 140 && blue < 170 && green > 110 && green < 130   ) {
                    plane.setPixelColor(252, 210-x/6, 251);
                }
            }
        }

    }// end of pink gradient method

    public void background() {
        for (int y = 0; y < 900; y = y + 15) {
            for (int x = 0; x < 1000; x = x + 15) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red > 254 && red < 256 && blue > 254 && blue < 256 && green > 254 && green < 256) {
                    plane.setColor(50, 200, x / 4);
                    square(15);
                    System.out.println("x: " + x);
                }
            }
        }
    }



    public void square (int distance){
        for (int z = 0; z < 4; z=z+1){
            plane.isTrail = true;
            plane.move(distance);
            plane.turn(90);
            System.out.println("z: " + z);
        }

    }


    public void star(){
        plane.teleport(663,355);
        plane.setColor(255,252,179);
        plane.trailWidth=10;
        plane.isTrail = true;
        plane.move(100);
        plane.turn(140);
        plane.move(100);
        plane.turn(140);
        plane.move(100);
        plane.turn(140);
        plane.move(100);
        plane.turn(150);
        plane.move(100);
        plane.teleport(0,0);
        plane.teleport(663,355);
        plane.setColor(0,0,0);
        plane.startingAngle(90);
        plane.trailWidth=3;
        plane.isTrail = true;
        plane.move(100);
        plane.turn(140);
        plane.move(100);
        plane.turn(140);
        plane.move(100);
        plane.turn(140);
        plane.move(100);
        plane.turn(150);
        plane.move(100);
        plane.teleport(0,0);
    }//end of star method


    public void whiteFilter(){
        for (int y = 0; y < 800; y = y + 1) {
            for (int x = 0; x < 1000; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(x, 488 - y);
                if(red > 110 && red < 125 && green > 160 && green < 200   ) { //196,152,242
                    plane.setPixelColor(255, 255, 255);
                }
            }
        }


    }// end of method

}
