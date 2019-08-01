package com.mall.service;

import com.mall.controller.UploadController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import java.util.List;

@Service
public class UploadService {

    private static final Logger logger = LoggerFactory.getLogger(UploadController.class);

    //支持的文件类型
    private static final List<String> suffixes = Arrays.asList("image/png","image/jpeg");

    public String upload(MultipartFile file){
        try {
            //1.图片信息校验
            //校验文件类型
            String type = file.getContentType();
            if (!suffixes.contains(type)){
                logger.info("上传失败，文件类型不匹配:{}",type);
                return null;
            }

            //校验图片内容
            BufferedImage image = ImageIO.read(file.getInputStream());
            if (image == null){
                logger.info("上传失败，文件内容不符合要求");
                return null;
            }

            //2.保存图片
            //生成保存目录
            File dir = new File("D:\\upload");
            if (!dir.exists()){
                dir.mkdirs();
            }

            //保存图片
            file.transferTo(new File(dir,file.getOriginalFilename()));

            //拼接图片地址
            String url ="http://image.mall.com/upload/"+file.getOriginalFilename();

            return url;

        }catch (Exception e){
            return null;
        }

    }
}
