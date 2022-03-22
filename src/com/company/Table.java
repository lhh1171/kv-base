package com.company;

public class Table {
    Version head;
    Version tail;
    public Table(){
        head=new Version();
        head.index=0;
        tail=head;
    }
    /*
     * create a table with parameters
     * */
    public void createTab(String cf_name, short type, long min, long max, boolean isUnique, boolean isNull){
        Version version=new Version();
        version.index=tail.index+1;
        version.memStore=new MemStore();
        tail=version;
    }
}
