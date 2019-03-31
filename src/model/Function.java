package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Function {
    public static final double MIN_X_DOWN_LIMIT = -1000;
    public static final double MAX_X_UP_LIMIT = 1000;

    private double xDownLimit;
    private double xUpLimit;

    private ObservableList<Point> points;


    public Function(double xDownLimit, double xUpLimit) {
        this.xDownLimit = xDownLimit;
        this.xUpLimit = xUpLimit;

        points = FXCollections.observableArrayList();
    }

    public Function() {
        this(MIN_X_DOWN_LIMIT, MAX_X_UP_LIMIT);
    }

    public double getXUpLimit() {
        return xUpLimit;
    }

    public void setXUpLimit(double xUpLimit) {
        this.xUpLimit = xUpLimit;
    }

    public double getXDownLimit() {
        return xDownLimit;
    }

    public void setXDownLimit(double xDownLimit) {
        this.xDownLimit = xDownLimit;
    }

    public ObservableList<Point> getPoints() {
        return points;
    }
}
