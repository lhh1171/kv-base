package com.company;

public class Trailer {
//    FileInfo信息在File中的偏移
    long file_offset;
//    数据块索引在File中的偏移
    long data_offset;
//    数据块索引的个数
    int dataIndex_count;
//    版本信息。当前该版本值为1
    Version version;
}
