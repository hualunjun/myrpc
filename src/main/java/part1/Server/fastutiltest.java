package part1.Server;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;

import java.util.LinkedList;

public class fastutiltest {
    public static void main(String[] args) {
        Int2IntOpenHashMap map = new Int2IntOpenHashMap();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.forEach((k, v) -> System.out.println(k + ": " + v));
        map.remove(2);
        LinkedList<Integer> list = new LinkedList<>();
    }
}
