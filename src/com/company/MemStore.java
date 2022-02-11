package com.company;

public class MemStore {
    FileInfo fileInfo;
    DataBlocks dataBlocks;
    Trailer trailer;
    private void createMemStore(){
        fileInfo = new FileInfo();
        fileInfo.avgKey=0;
        fileInfo.lastKey=0;
        fileInfo.size=0;
        dataBlocks=new DataBlocks();
        trailer=new Trailer();
        trailer.data_offset=0;
        trailer.dataIndex_count=0;
        trailer.file_offset=0;
    }


}
