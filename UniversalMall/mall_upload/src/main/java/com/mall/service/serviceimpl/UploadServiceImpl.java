package com.mall.service.serviceimpl;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.mall.config.UploadProperties;
import com.mall.service.UploadService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: 98050
 * Time: 2018-08-09 14:44
 * Feature:
 */
@Service
@EnableConfigurationProperties(UploadProperties.class)
public class UploadServiceImpl implements UploadService {

    @Autowired
    private FastFileStorageClient storageClient;

    @Autowired
    private UploadProperties uploadProperties;

    private static final Logger logger= LoggerFactory.getLogger(UploadServiceImpl.class);

    /**
     * 1.图片信息校验
     *      1)校验文件类型
     *      2)校验图片内容
     * 2.保存图片
     *      1)生成保存目录
     *      2)保存图片
     *      3)拼接图片地址
     */
    @Override
    public String upload(MultipartFile file) {
        try {
            String type = file.getContentType();
            if (!uploadProperties.getAllowTypes().contains(type)) {
                logger.info("上传文件失败，文件类型不匹配：{}", type);
                return null;
            }
            BufferedImage image = ImageIO.read(file.getInputStream());
            if (image == null) {
                logger.info("上传失败，文件内容不符合要求");
                return null;
            }

            StorePath storePath = this.storageClient.uploadFile(
                  file.getInputStream(), file.getSize(), getExtension(file.getOriginalFilename()), null);
            String url = uploadProperties.getBaseUrl()+storePath.getFullPath();
            return url;
        }catch (Exception e){
            return null;
        }
    }

    public String getExtension(String fileName){
        return StringUtils.substringAfterLast(fileName,".");
    }
}
