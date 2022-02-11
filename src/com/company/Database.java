package com.company;

public class Database {
    String db_name;
    MemStore[] memStores;
    void create_Db(String db_name){
        memStores=new MemStore[1024];
        this.db_name=db_name;
    }
}
