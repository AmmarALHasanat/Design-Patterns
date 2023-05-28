package DP.Flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Point {
    private int x;
    private int y;
    private int z;
    private static Map<PointKey, Point> pointMap = new HashMap<>();

    private Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static Point getInstance(int x, int y, int z) {
        PointKey key = new PointKey(x, y, z);
        if (pointMap.containsKey(key)) {
            return pointMap.get(key);
        }
        Point point = new Point(x, y, z);
        pointMap.put(key, point);
        return point;
    }
    private static class PointKey {
        private int x;
        private int y;
        private int z;

        private PointKey(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y, z);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PointKey other = (PointKey) obj;
            return x == other.x && y == other.y && z == other.z;
        }
        //  && Objects.equals(name, other.name)

    }
    @Override
    public String toString() {
        return super.toString()+", PointKey{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}



