package tp1;

import java.util.*;

public final class PointOperator {

    public static void translate(Double[] vector, Double[] translateVector) {
        for(int i = 0; i<vector.length; i++){
            vector[i]+=translateVector[i];
        }
    }

    public static void rotate(Double[] vector, Double[][] rotationMatrix) {
        Double[] vectorInitial = new Double[vector.length];
        for(int k = 0; k < vector.length; k++){
            vectorInitial[k] = vector[k];
        }
        for(int i = 0; i < vector.length; i++){
            double x = 0;
            for (int j = 0; j < vector.length; j++){
                x += rotationMatrix[i][j] * vectorInitial[j];
            }
            vector[i]=x;
        }
    }

    public static void divide(Double[] vector, Double divider) {
        for(int i = 0; i < vector.length; i++){
            vector[i] /= divider;
        }
    }

    public static void multiply(Double[] vector, Double multiplier) {
        for(int i = 0; i < vector.length; i++){
            vector[i] *= multiplier;
        }
    }

    public static void add(Double[] vector, Double adder) {
        for(int i = 0; i < vector.length; i++){
            vector[i] += adder;
        }
    }
}
