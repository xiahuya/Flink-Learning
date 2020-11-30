package cn.xhjava.datasource;

import cn.xhjava.domain.*;
import org.apache.flink.api.java.tuple.Tuple4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiahu
 * @create 2020/10/27
 */
public class DataSource {
    private static String words = "hello flink hello world";

    public static final String[] WORDS = new String[]{
            "To be, or not to be,--that is the question:--",
            "Whether 'tis nobler in the mind to suffer"
    };

    public static final String[] MAP = new String[]{
            "xiahu aaa bbb ccc ddd"
    };

    public static final Student[] Studens = new Student[]{
            new Student(1, "张三", "男", 89),
            new Student(2, "里斯", "女", 89),
            new Student(3, "王五", "男", 100),
            new Student(4, "赵六", "女", 89),
            new Student(5, "翠花", "男", 100),
            new Student(6, "秋香", "女", 100)
    };


    public static final MetricEvent[] MetricEvent = new MetricEvent[]{
            new MetricEvent(1, "tom", "web", "1"),
            new MetricEvent(2, "jack", "phone", "2"),
            new MetricEvent(3, "linda", "app", "3"),
            new MetricEvent(4, "寂寞的男人", "app", "3"),
            new MetricEvent(5, "张三", "web", "1"),
            new MetricEvent(6, "李四", "web", "1"),
            new MetricEvent(7, "王五", "phone", "2")
    };

    public static final Student[] Studens2 = new Student[]{
            new Student(7, "张三", "男", 111),
            new Student(8, "里斯", "女", 111),
            new Student(9, "王五", "男", 100),
            new Student(10, "赵六", "女", 111),
            new Student(11, "翠花", "男", 100),
            new Student(12, "秋香", "女", 100)
    };

    public static final Tuple4<Integer, String, String, Integer>[] Tuple4_Student = new Tuple4[]{
            new Tuple4(1, "张三", "男", 89),
            new Tuple4(2, "里斯", "女", 89),
            new Tuple4(3, "王五", "男", 100),
            new Tuple4(4, "赵六", "女", 89),
            new Tuple4(5, "翠花", "男", 100),
            new Tuple4(6, "秋香", "女", 100)
    };

    public static List<Word> getWordCollection() {
        List<Word> result = new ArrayList<>();
        for (String msg : words.split("\\W+")) {
            result.add(new Word(msg, 1));
        }

        return result;
    }

    public static final OrderEvent[] orderEvent = new OrderEvent[]{
            new OrderEvent("1", "AA", 1000l),
            new OrderEvent("2", "BB", 2000l),
            new OrderEvent("3", "CC", 3000l),
            new OrderEvent("4", "DD", 4000l),
            new OrderEvent("5", "EE", 5000l),
            new OrderEvent("6", "FF", 6000l),
            new OrderEvent("8", "HH", 7000l)
    };

    public static final PayEvent[] payEvent = new PayEvent[]{
            new PayEvent("1", "1", "AAA", 1000l),
            new PayEvent("2", "2", "BBB", 2000l),
            new PayEvent("3", "3", "CCC", 3000l),
            new PayEvent("4", "4", "DDD", 4000l),
            new PayEvent("5", "5", "EEE", 5000l),
            new PayEvent("6", "7", "GGG", 7000l)
    };
}
