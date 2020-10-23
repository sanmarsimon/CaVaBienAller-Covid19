package tp1;

import java.util.*;
import java.util.stream.Collectors;

public class BaseShape implements Cloneable {
    private Collection<Point2d> coords;
    
    public BaseShape() {
        coords = new ArrayList<Point2d>();
    }

    public BaseShape(Collection<Point2d> coords) {
        this.coords = new ArrayList<Point2d>();
        this.coords.addAll(coords);
    }

    public BaseShape add(Point2d coord) {
        coords.add(coord);
        return this;
    }
    public BaseShape add(BaseShape shape) {
        this.coords.addAll(shape.coords);
        return this;
    }
    public BaseShape addAll(Collection<Point2d> coords) {
        this.coords.addAll(coords);
        return this;
    }
    public BaseShape remove(Point2d coord) {
        this.coords.remove(coord);
        return this;
    }
    public BaseShape remove(BaseShape shape) {
        this.coords.removeAll(shape.coords);
        return this;
    }
    public BaseShape removeAll(Collection<Point2d> coords) {
        this.coords.removeAll(coords);
        return this;
    }

    public Collection<Point2d> getCoords() {
        Collection<Point2d> copy = new ArrayList<Point2d>();
        Point2d[] temp = new Point2d[coords.size()];
        coords.toArray(temp);
        for(int i = 0; i < coords.size(); i++){
            copy.add(temp[i]);
        }
        return copy;
    }

    public Collection<Point2d> getCoordsDeepCopy() {
        BaseShape copy = new BaseShape();
        Point2d[] temp = new Point2d[coords.size()];    // Tableau de Point2d pour y mettre tous les élements de coords
        coords.toArray(temp);                           // Tous les élements de coords sont copier dans temp (shallowCopy)
        for(int i = 0; i < coords.size(); i++){
            Point2d pointToCopy = new Point2d(temp[i].X(), temp[i].Y());   // DeepCopy de chaque Point2d
            copy.coords.add(pointToCopy);
        }
        return copy.coords;
    }

    public BaseShape translate(Point2d point) {
        Point2d[] list = new Point2d[coords.size()];
        coords.toArray(list);
        removeAll(coords);
        for(int i = 0; i < list.length; i++){
            list[i].translate(point);
            coords.add(list[i]);
        }
        return this;
    }

    public BaseShape rotate(Double angle) {
        Point2d[] list = new Point2d[coords.size()];
        coords.toArray(list);
        removeAll(coords);
        for(int i = 0; i < list.length; i++){
            list[i].rotate(angle);
            coords.add(list[i]);
        }
        return this;
    }

    public Double getMaxX() {
        Point2d[] list = new Point2d[coords.size()];
        coords.toArray(list);
        double max = list[0].X();
        for (int i = 0; i < list.length; i++){
            if(list[i].X() > max){
                max = list[i].X();
            }
        }
        return max;
    }

    public Double getMaxY() {
        Point2d[] list = new Point2d[coords.size()];
        coords.toArray(list);
        double max = list[0].Y();
        for (int i = 0; i < list.length; i++){
            if(list[i].Y() > max){
                max = list[i].Y();
            }
        }
        return max;
    }

    public Point2d getMaxCoord() {
        Point2d point = new Point2d(getMaxX(), getMaxY());
        return point;
    }

    public Double getMinX() {
        Point2d[] list = new Point2d[coords.size()];
        coords.toArray(list);
        double min = list[0].X();
        for (int i = 0; i < list.length; i++){
            if(list[i].X() < min){
                min = list[i].X();
            }
        }
        return min;
    }
    public Double getMinY() {
        Point2d[] list = new Point2d[coords.size()];
        coords.toArray(list);
        double min = list[0].Y();
        for (int i = 0; i < list.length; i++){
            if(list[i].Y() < min){
                min = list[i].Y();
            }
        }
        return min;
    }

    public Point2d getMinCoord() {
        Point2d point = new Point2d(getMinX(), getMinY());
        return point;
    }

    public BaseShape clone() {
        BaseShape clone = new BaseShape(this.coords);
        return clone;
    }
}
