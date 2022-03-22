package com.company;

import java.util.ArrayList;
import java.util.List;

//对应的是一个表的一个版本的数据
public class MemStore {

    FileInfo fileInfo;
    Trailer trailer;
    BPlusTree<KeyValue,String> bPlusTree=new BPlusTree<>();

    /*alter*/
    public void alter(){

    }

    public void insert(String rowKey,String cf_name,String cname,String value,long valueLength){
        //检查

        bPlusTree.insert(new KeyValue(cf_name,rowKey,valueLength,cname,value),rowKey);
    }



    //对应的是一个表的一个版本的基本元数据
    public static class FileInfo {
        //当ddl的时候，这些东西就会创建
        String Tab_name;
        Long init_time;
        List<TFilter> tFilter=new ArrayList<>();

        public static class TFilter {
        //    列族名称
            String cf_name;
        //    列族类型
            short type;
        //    最小长度,默认为0
            long min=Long.MIN_VALUE;
        //    最大长度，默认为最大值
            long max=Long.MAX_VALUE;
        //   是否唯一
            boolean isUnique=false;

            public TFilter(String cf_name, short type, long min, long max, boolean isUnique) {
                this.cf_name = cf_name;
                this.type = type;
                this.min = min;
                this.max = max;
                this.isUnique = isUnique;
            }
        }
    }
}
