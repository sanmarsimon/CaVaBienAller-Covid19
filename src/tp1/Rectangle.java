package tp1;

import java.util.Collection;

public class Rectangle extends BaseShape {
    public Rectangle(Double width, Double height) {
        for (Double i = -(width/2); i <=width; i++){
           for (Double j = -(height/2); j <= height; j++){
               add(new Point2d(i, j));
           }
        }
    }

    public Rectangle(Point2d dimensions) {
        Rectangle rectangle = new Rectangle(dimensions.X(), dimensions.Y());
        add(rectangle);
    }

    private Rectangle(Collection<Point2d> coords) {
        super(coords);
    }

    @Override
    public Rectangle translate(Point2d point) {
        super.translate(point);
        return this;
    }

    @Override
    public Rectangle rotate(Double angle) {
        super.rotate(angle);
        return this;
    }

    @Override
    public Rectangle clone() {
        super.clone();
        return this;
    }
}
