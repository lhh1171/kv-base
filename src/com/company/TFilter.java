package com.company;

public class TFilter {
//    列族名称
    String cf_name;
//    列族类型
    short type;
//    最小长度
    long min;
//    最大长度
    long max;
//   是否唯一
    boolean isUnique;
//    是否可以为空
    boolean isNull;

    public TFilter(String cf_name, short type, long min, long max, boolean isUnique, boolean isNull) {
        this.cf_name = cf_name;
        this.type = type;
        this.min = min;
        this.max = max;
        this.isUnique = isUnique;
        this.isNull = isNull;
    }
}
