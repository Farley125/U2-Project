public class LinearEquation {
    private String original1;
    private String original2;
    public int x1;
    public int x2;
    public int y1;
    public int y2;
    public int distanceX;
    public int distanceY;
    public double slopeVal;
    public String slopeStr;

    public LinearEquation(String input1, String input2) {
        int comma = input1.indexOf(","); //Locate position of the comma in the input1.
        int closePara = input1.indexOf(")");  //Locate position of the closed parenthesis in the input1.
        x1 = Integer.parseInt(input1.substring(1, comma));
        y1 = Integer.parseInt(input1.substring(comma + 1, closePara));
        int comma2 = input2.indexOf(",");
        int closePara2 = input2.indexOf(")");
        x2 = Integer.parseInt(input2.substring(1, comma));
        y2 = Integer.parseInt(input2.substring(comma + 1, closePara));
        original1 = input1; //Stores input1 as a string for use in display
        original2 = input2;
        distanceX = x2 - x1;
        distanceY = y2 - y1;
        slopeVal = distanceY/distanceX;
        slopeStr = Integer.toString(distanceY) + "/" +  Integer.toString(distanceX);
    }

    /*public double slopeVal(){
        return(distanceY/distanceX);
    }

    public String slopeStr(){
        return(Integer.toString(distanceY) + "/" +  Integer.toString(distanceX));
    }*/

    public double distanceBetween(){
        return(java.lang.Math.sqrt((Math. pow(distanceX, 2) + Math. pow(distanceY, 2)))); //returns distance between the two given coordinates(pythagorean theorem.)
    }

    public double yIntercept(){
        return(y1-(slopeVal*x1)); // y - mx = b
    }

    public String toString(){
        return("First Pair: " + original1 + System.lineSeparator()
                + "Second Pair: " + original2 + System.lineSeparator()
                + "Slope: " + slopeStr + System.lineSeparator() +
                "Distance between points: " + distanceBetween() + System.lineSeparator()
                + "y  = " + slopeStr + "x + " + yIntercept());
    }
    public double yCalc(int x){
        return(slopeVal * x + yIntercept()); // Calculates the y value for the given x input.
    }
}

