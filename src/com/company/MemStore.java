package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemStore {
    List<TFilter> tFilter=new ArrayList<>();
    FileInfo fileInfo;
    Trailer trailer;
    BPlusTree<String,KeyValue> bPlusTree;
    public MemStore(String cf_name, short type, long min, long max, boolean isUnique, boolean isNull) {
        //可能有多个列的约束
        tFilter.add(new TFilter(cf_name,type,min,max,isUnique,isNull)) ;
    }
    /*alter*/
    public void alter(String method,String old_cf_name,String cf_name,short type, long min, long max, boolean isUnique, boolean isNull){
        if (method.equals("put")&&!cf_name.equals("")){
            tFilter.add(new TFilter(cf_name,type,min,max,isUnique,isNull)) ;
        }else if (method.equals("delete")&&cf_name.equals("")){
            /*
            Iterator<TFilter> iterator=tFilter.listIterator();
            while (iterator.hasNext()){
                if (iterator.next().cf_name.equals(old_cf_name)){
                    iterator.remove();
                }
            }*/
            tFilter.removeIf(tFilter -> tFilter.cf_name.equals(old_cf_name));
        }else if (method.equals("update")&&!old_cf_name.equals("")){
            Iterator<TFilter> iterator=tFilter.listIterator();
            while (iterator.hasNext()){
                if (iterator.next().cf_name.equals(old_cf_name)){
                    iterator.remove();
                    tFilter.add(new TFilter(cf_name,type,min,max,isUnique,isNull));
                }
            }
        }
        System.out.println("method or parameter is error!");
    }

    public void insert(String cf_name,String cname,String value){

    }
}
