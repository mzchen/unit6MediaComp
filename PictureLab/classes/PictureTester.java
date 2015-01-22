/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
    /** Method to test zeroBlue */
    public static void myCollage()
    {
        Picture main = new Picture("MyCollage.jpg");
        Picture cheadle = new Picture("shrek.jpg");
        Picture cheadle2 = new Picture("shrek.jpg");
        Picture cheadle3 = new Picture("shrek.jpg");
        Picture cheadle4 = new Picture("shrek.jpg");
        Picture cheadle5 = new Picture("shrek.jpg");
        Picture cheadle6 = new Picture("shrek.jpg");
        cheadle.zeroRed();
        cheadle.mirrorHorizontal();
        cheadle.mirrorDiagonalBotToTop();
        cheadle.zeroBlue();
        cheadle.mirrorHorizontalBotToTop();
        cheadle.mirrorTemple2();
        cheadle.mirrorVertical();
        cheadle.explore();
        cheadle2.seeFish();
        cheadle2.mirrorDiagonal();
        cheadle2.mirrorHorizontal();
        cheadle2.explore();
        cheadle3.mirrorDiagonal();
        //cheadle3.mirrorDiagonalBotToTop();
        cheadle3.explore();
        cheadle4.zeroGreen();
        cheadle4.mirrorSnowman();
        cheadle4.explore();
        main.copy(cheadle,0,0);
        main.copy(cheadle2,0,1000);
        main.copy(cheadle3,562,0);
        main.copy(cheadle4, 562, 1000);
        main.explore();
        main.write("C:\\Users\\My Slave\\Desktop\\New folder\\PictureLab\\images\\MyCollage.jpg");
    }
    public static void testZeroBlue()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }
    public static void testSeeFish()
    {
        Picture fish = new Picture("water.jpg");
        fish.explore();
        fish.seeFish();
        fish.explore();
    }
    
    public static void testkeepBlue()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.keepBlue();
        beach.explore();
    }
    public static void testnegate()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.negate();
        beach.explore();
    }
    public static void testgrayScale()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.grayScale();
        beach.explore();
    }
    
    public static void testMirrorSnowman()
    {
        Picture snowman = new Picture("snowman.jpg");
        snowman.explore();
        snowman.mirrorSnowman();
        snowman.explore(); 
    }
    /** Method to test mirrorVertical */
    public static void testMirrorVertical()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }
    public static void testMirrorHorizontal()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorHorizontal();
        caterpillar.explore();
    }
    public static void testMirrorHorizontalBotToTop()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorHorizontalBotToTop();
        caterpillar.explore();
    }
    public static void testMirrorVerticalRightToLeft()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVerticalRightToLeft();
        caterpillar.explore();
    }
    public static void testMirrorDiagonal()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorDiagonal();
        caterpillar.explore();
    }
    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /** Method to test the collage method */
    public static void testCollage()
    {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }
    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args)
    {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        testZeroBlue();
        //testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        //testNegate();
        //testGrayscale();
        //testFixUnderwater();
        //testMirrorVertical();
        //testMirrorTemple();
        //testMirrorArms();
        //testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
        //testCopy();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}