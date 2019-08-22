## 注解解析



- 读取配置文件

  - a.`@EnableConfigurationProperties` 
  - b.`ConfigurationProperties`

  ```java
  @EnableConfigurationProperties(UploadProperties.class)
  
  
  @Data
  @ConfigurationProperties(prefix = "mall.upload")
  public class UploadProperties {
      private String baseUrl;
      private List<String> allowTypes;
  }
  
  
  mall:
    uoload:
      baseUrl: "http://image.mall.com"
      allowTypes:
       - image/png
       - image/jpeg
       - image/jpg
  ```

