package code.wars.java.BouncingBalls;

public class BouncingBalls {
    public static void main(String[] args) {
        System.out.println(bouncingBall(15.0, 0.66, 1.5));
    }

    public static int bouncingBall(double height, double bounce, double window){
        if ((height > 0 && bounce > 0) && (bounce < 1 && window > bounce)){
            double bouncingBallHeight = height * bounce;
            double result = bouncingBallHeight * window;
            return (int)Math.round(result);
        }
        return -1;
    }
}
