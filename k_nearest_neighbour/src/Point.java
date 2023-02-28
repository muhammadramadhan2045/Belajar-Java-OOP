public class Point {

    private double mSepalLength;
    private double mSepalWidth;
    private double mPetalLength;
    private double mPetalWidth;
    private double mDistance;
    private int mAnswer;

    public Point() {
        this(0, 0, 0, 0, 0);
    }

    public Point(double sepalLength, double sepalWidth, double petalLength, double petalWidth) {
        this(sepalLength, sepalWidth, petalLength, petalWidth, 0);
    }

    public Point(double sepalLength, double sepalWidth, double petalLength, double petalWidth, int answer) {
        this.mSepalLength = sepalLength;
        this.mSepalWidth = sepalWidth;
        this.mPetalLength = petalLength;
        this.mPetalWidth = petalWidth;
        this.mAnswer = answer;
    }

    public double getSepalLength() {
        return mSepalLength;
    }

    public void setSepalLength(double sepalLength) {
        this.mSepalLength = sepalLength;
    }

    public double getSepalWidth() {
        return mSepalWidth;
    }

    public void setSepalWidth(double sepalWidth) {
        this.mSepalWidth = sepalWidth;
    }

    public double getPetalLength() {
        return mPetalLength;
    }

    public void setPetalLength(double petalLength) {
        this.mPetalLength = petalLength;
    }

    public double getPetalWidth() {
        return mPetalWidth;
    }

    public void setPetalWidth(double petalWidth) {
        this.mPetalWidth = petalWidth;
    }

    public double getDistance() {
        return mDistance;
    }

    public void setDistance(double distance) {
        mDistance = distance;
    }

    public int getAnswer() {
        return mAnswer;
    }

    public void setAnswer(int answer) {
        mAnswer = answer;
    }

    public String dataPoint() {
        return mAnswer == 0 ? "Setosa" : mAnswer == 1 ? "Versicolor" : "Virginica";
    }

    public boolean searchDistance(double distance) {
        return mDistance == distance;
    }
}
