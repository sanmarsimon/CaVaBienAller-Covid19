package tp1;

public final class LetterFactory {
    final static Double maxHeight = 200.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;

    public static BaseShape create_e() {
        Ellipse mainBody = new Ellipse(maxWidth, maxHeight);
        Ellipse middleToRemove = new Ellipse(maxWidth - stripeThickness,
                maxHeight - stripeThickness);
        BaseShape rightToRremove = new Rectangle(halfMaxWidth, maxHeight/4).translate(new Point2d(halfMaxWidth/2, 0.0));
        BaseShape middleToAdd =  new Rectangle(halfStripeThickness-5,halfMaxWidth).rotate(Math.toRadians(90.0)).translate(new Point2d(halfStripeThickness+5, -15.0));

        mainBody.remove(middleToRemove);
        mainBody.remove(rightToRremove);
        mainBody.add(middleToAdd);
        return mainBody;

    }

    public static BaseShape create_a() {
        Ellipse mainBody = new Ellipse(maxWidth, maxHeight);
        Ellipse middleToRemove = new Ellipse(maxWidth - stripeThickness,
                maxHeight - stripeThickness);

        BaseShape rightToAdd = new Rectangle(halfStripeThickness-5, halfMaxHeight+stripeThickness).translate(new Point2d(halfMaxWidth, -28.0));
        mainBody.remove(middleToRemove);
        mainBody.add(rightToAdd);
        return mainBody;
    }

    public static BaseShape create_C() {
        Ellipse mainBody = new Ellipse(maxWidth, maxHeight);
        Ellipse middleToRemove = new Ellipse(maxWidth - stripeThickness,
                maxHeight - stripeThickness);
        BaseShape rightToRremove = new Rectangle(halfMaxWidth, halfMaxHeight/1.5).translate(new Point2d(halfMaxWidth/2, -10.0));

        mainBody.remove(middleToRemove);
        mainBody.remove(rightToRremove);
        return mainBody;
    }

    public static BaseShape create_l() {

        Rectangle body = new Rectangle(halfStripeThickness-5,110+stripeThickness);
        return body;
    }

    public static BaseShape create_i() {
        Ellipse point = new Circle(stripeThickness/2).translate(new Point2d(0.0, -(maxHeight-halfStripeThickness)));

        BaseShape body = new Rectangle(halfStripeThickness-5,100.0).translate(new Point2d(0.0, -100.0));
        body.add(point);

        return body;
    }

    public static BaseShape create_A() {
        Rectangle left = new Rectangle(halfStripeThickness-5, halfMaxHeight+stripeThickness+10).rotate(Math.toRadians(15));
        Rectangle right = new Rectangle(halfStripeThickness-5, halfMaxHeight+stripeThickness+10).rotate(Math.toRadians(-15)).translate(new Point2d(halfMaxWidth-5,0.0));
        Rectangle middleToAdd =  new Rectangle(halfStripeThickness-5,halfMaxWidth).rotate(Math.toRadians(90.0)).translate(new Point2d(30.0, 25.0));

        left.add(right);
        left.add(middleToAdd);
        return left;
    }

    public static BaseShape create_V() {
        Rectangle left = new Rectangle(halfStripeThickness-5, halfMaxHeight+stripeThickness+10).rotate(Math.toRadians(-15));
        Rectangle right = new Rectangle(halfStripeThickness-5, halfMaxHeight+stripeThickness+10).rotate(Math.toRadians(15)).translate(new Point2d(maxWidth-5,0.0));

        left.add(right);
        return left;
    }

    public static BaseShape create_n() {
        Rectangle left = new Rectangle(halfStripeThickness-5, 105+stripeThickness).translate(new Point2d(0.0, -(maxHeight-halfStripeThickness)+5));
        Rectangle right = new Rectangle(halfStripeThickness-5, 80+stripeThickness).translate(new Point2d(maxWidth, -(maxHeight-(1.5*stripeThickness))));
        BaseShape top = new Circle(maxWidth+stripeThickness-12.5).translate(new Point2d(halfMaxWidth+2, -(maxHeight-stripeThickness+25)));
        BaseShape middleToRemove = new Circle(maxWidth-12.5).translate(new Point2d(halfMaxWidth+2, -(maxHeight-stripeThickness+25)));
        BaseShape halfToRemove = new Square(maxWidth).translate(new Point2d(halfMaxWidth+9, -(maxHeight-stripeThickness+25)+halfMaxWidth));
        top.remove(middleToRemove);
        top.remove(halfToRemove);
        left.add(right);
        left.add(top);

        return left;
    }

    public static BaseShape create_r() {
        Rectangle left = new Rectangle(halfStripeThickness-5, 105+stripeThickness).translate(new Point2d(0.0, -(maxHeight-halfStripeThickness)+5));
        BaseShape top = new Circle(maxWidth+stripeThickness-12.5).translate(new Point2d(halfMaxWidth+2, -(maxHeight-stripeThickness+25)));
        BaseShape middleToRemove = new Circle(maxWidth-12.5).translate(new Point2d(halfMaxWidth+2, -(maxHeight-stripeThickness+25)));
        BaseShape halfToRemove = new Square(maxWidth).translate(new Point2d(halfMaxWidth+9, -(maxHeight-stripeThickness+25)+halfMaxWidth));
        top.remove(middleToRemove);
        top.remove(halfToRemove);
        left.add(top);

        return left;
    }

    public static BaseShape create_B() {

        Rectangle left = new Rectangle(halfStripeThickness-5, 105+stripeThickness).translate(new Point2d(0.0, -(maxHeight-halfStripeThickness)+5));

        BaseShape top = new Circle(halfMaxHeight).translate(new Point2d(0.0, -maxHeight));
        BaseShape bottom = new Circle(halfMaxHeight).translate(new Point2d(0.0, -(halfMaxHeight)));
        BaseShape middleToRemove = new Circle(halfMaxHeight - stripeThickness);
        BaseShape halfToRemove = new Square(halfMaxHeight);
        top.remove(middleToRemove.translate(new Point2d (0.0, -maxHeight)));
        top.remove(halfToRemove.translate(new Point2d(-100.0,-maxHeight)));
        bottom.remove(middleToRemove.translate(new Point2d(0.0, halfMaxHeight)));
        bottom.remove(halfToRemove.translate(new Point2d(0.0, halfMaxHeight)));
        left.add(bottom);
        left.add(top);
        return left;
    }
}
