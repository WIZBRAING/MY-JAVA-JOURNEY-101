/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppthinking;

public class BoundingRectangle {
    private double width;
    private double height;
    private double cx;
    private double cy;
    private double xMin;
    private double xMax;
    private double yMin;
    private double yMax;

    public BoundingRectangle(double[][] points) {
        minAndMaxPoints(points);
    }

    private void setWidth() {
        this.width = xMax - xMin;
    }

    public double getWidth() {
        return this.width;
    }

    private void setHeight() {
        this.height = yMax - yMin;
    }

    public double getHeight() {
        return this.height;
    }

    private void setX() {
        this.cx = (xMax + xMin) / 2.0;
    }

    public double getX() {
        return this.cx;
    }

    private void setY() {
        this.cy = (yMax + yMin) / 2.0;
    }

    public double getY() {
        return this.cy;
    }

    private void setAll() {
        setX();
        setY();
        setWidth();
        setHeight();
    }

    private double min(double[][] p, int index) {
        double min = p[0][index];
        for (double[] point : p) {
            if (point[index] < min) {
                min = point[index];
            }
        }
        return min;
    }

    private double max(double[][] p, int index) {
        double max = p[0][index];
        for (double[] point : p) {
            if (point[index] > max) {
                max = point[index];
            }
        }
        return max;
    }

    private void minAndMaxPoints(double[][] points) {
        xMin = min(points, 0);
        yMin = min(points, 1);
        xMax = max(points, 0);
        yMax = max(points, 1);
        setAll();
    }

    public static Rectangle2D getRectangle(double[][] points) {
        BoundingRectangle br = new BoundingRectangle(points);
        return new Rectangle2D(br.getX(), br.getY(), br.getWidth(), br.getHeight());
    }
}
