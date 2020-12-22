package com.xuecheng.test.freemarker;


import com.sun.corba.se.spi.ior.ObjectId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Company 才源软件科技有限公司
 * @Project xcEduService01
 * @Author 刘盼盼
 * @Date 2020-12-16 16:10
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class GridFsTemplate {
    @Autowired
    GridFsTemplate gridFsTemplate;

    @Test
    public void testGridFs() throws FileNotFoundException {
        //要存储的文件
        File file = new File("d:/index_banner.html");
        //定义输入流
        FileInputStream inputStram = new FileInputStream(file);
        //向GridFS存储文件
        ObjectId objectId =  gridFsTemplate.store(inputStram, "index_banner.ftl");
        //得到文件ID
        String fileId = objectId.toString();
        System.out.println(file);
    }
}
