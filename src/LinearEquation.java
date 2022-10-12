public class U2Project {
    private String original;
    private String original2;
    private int x1;
    private int x2;
    private int x3;
    private int y1;
    private int y2;
    private String slopeStr;
    private double slopeVal;
    private int distanceX;
    private int distanceY;

    public U2Project(int x1, int x2, int y1, int y2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public void dataSort(String input, String input2)
    {
        int comma = input.indexOf(",");
        int closePara = input.indexOf(")");
        x1 = Integer.parseInt(input.substring(1,comma));
        y1 = Integer.parseInt(input.substring(comma + 1, closePara));
        int comma2 = input2.indexOf(",");
        int closePara2 = input2.indexOf(")");
        x2 = Integer.parseInt(input2.substring(1,comma));
        y2 = Integer.parseInt(input2.substring(comma + 1, closePara));
        original = input;
        original = input2;
    }

    public void distanceX(){
        distanceX = x2-x1;
    }

    public void distanceY(){
        distanceY = y2-y1;
    }

    public void slopeVal(){
        slopeVal = distanceY/distanceX;
    }

    public void slopeStr(){
        slopeStr =  Integer.toString(distanceY) + "/" +  Integer.toString(distanceX);
    }

    public double distanceBetween(){
        return(java.lang.Math.sqrt((Math. pow(distanceX, 2) + Math. pow(distanceY, 2))));
    }

    public double yIntercept(){
        return(y1-(slopeVal*x1));
    }

    public String toString(){

    }

}

