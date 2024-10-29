public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("SpongeBob.jpeg");
        plane.showBackGround();

        greenFilter();

        purpleEyes();

        whiteFloor();

    }//end of go method

    public void greenFilter(){
        for (int y = 185; y < 250; y = y + 1) {
            for (int x = 205; x < 300; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(x, 488 - y);
                if(red > 200 && red < 255 && green > 200 && green < 255 && blue > 200 && blue < 255  ) { //196,152,242
                    plane.setPixelColor(100, 50, 100);
                }
                if (red <=20 && green <=20 && blue <=20 ) {
                    plane.setPixelColor(250, 105, 100);
                }
            }
        }


    }

    public void purpleEyes(){
        for (int y = 380; y < 500; y = y + 1) {
            for (int x = 1; x < 696; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(x, 488 - y);
                if(red > 170 && red < 230 && green > 170 && green < 250   ) { //196,152,242
                    plane.setPixelColor(255, 255, 255);
                }
            }
        }

    }

    public void whiteFloor(){
        for (int y = 0; y < 500; y = y + 1) {
            for (int x = 0; x < 695; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(x, 488 - y);
                if(red > 200 && red < 230 && green > 220 && green < 250   ) { //196,152,242
                    plane.setPixelColor(100, 255, 100);
                }
                if (red <=20 && green <=20 && blue <=20 ) {
                    plane.setPixelColor(250, 105, 100);
                }
            }
        }

    }

}

