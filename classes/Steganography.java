import java.awt.Color;
public class Steganography {

    public static void clearLow( Pixel p ){
     p.setRed(p.getRed()/4*4);
     p.setGreen(p.getGreen()/4*4);
     p.setBlue(p.getBlue()/4*4);

    }
    public static Picture testClearLow(Picture a){
    Picture copy = a;

    Pixel[][] pixels = copy.getPixels2D();

    for(int i = 0; i< copy.getWidth(); i++){
        for(int k=0; k < copy.getHeight(); k++){
         clearLow(pixels[i][k]);
        }
    }
    
  return copy;

}
public static void main(String [] args){

    Picture beach = new Picture ("beach.jpg");
    beach.explore();
    Picture copy = testClearLow(beach);
    copy.explore();
}




}


