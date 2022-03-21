package com.company;

import java.util.Date;

public class KeyValue implements Comparable<KeyValue> {
    short cf_type;
    String cf_name;
    String rowKey;
    long timeStamp;
    String cname;
    String value;
    int valueLength;

    public KeyValue(short cf_type, String cf_name, String rowKey, int valueLength,String cname,String value) {
        Date date=new Date();
        this.timeStamp=date.getTime();
        this.cf_type = cf_type;
        this.cf_name = cf_name;
        this.rowKey = rowKey;
        this.valueLength = valueLength;
        this.cname=cname;
        this.value=value;
    }

    @Override
    public int compareTo(KeyValue o) {
        return 0;
    }

}
