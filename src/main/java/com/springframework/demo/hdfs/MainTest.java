package com.springframework.demo.hdfs;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by fuqinqin on 2018/5/17.
 */
public class MainTest {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Configuration configuration = new Configuration();
        FileSystem fileSystem = FileSystem.get(new URI("hdfs://itaojin103:9000"), configuration, "root");
        fileSystem.copyFromLocalFile(new Path("E:\\workspace\\spring-ecosystem-student.zip"), new Path("/"));
        fileSystem.close();
    }

}
