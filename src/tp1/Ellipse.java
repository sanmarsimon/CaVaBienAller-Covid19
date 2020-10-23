package tp1;

import java.util.Collection;

public class Ellipse extends BaseShape {
    public Ellipse(Double widthRadius, Double heightRadius) {
        for (Double i = -(widthRadius/2); i <= (widthRadius/2); i++) {
            for (Double j = -(heightRadius/2); j <= (heightRadius/2); j++) {
                if (((i*i)/((widthRadius/2)*(widthRadius/2)) + ((j*j)/((heightRadius/2)*(heightRadius/2))) < 1)) {
                    add(new Point2d(i, j));
                }
            }
        }
    }

    public Ellipse(Point2d dimensions) {
        Ellipse ellipse = new Ellipse(dimensions.X(), dimensions.Y());
        add(ellipse);
    }

    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    @Override
    public Ellipse translate(Point2d point) {
        super.translate(point);
        return this;
    }

    @Override
    public Ellipse rotate(Double angle) {
        super.rotate(angle);
        return this;
    }

    @Override
    public Ellipse clone() {
        super.clone();
        return this; }
}
