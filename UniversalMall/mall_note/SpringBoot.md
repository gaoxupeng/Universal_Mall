## 注解解析



### 读取配置文件

- a.`@EnableConfigurationProperties` 
- b.`@ConfigurationProperties`

  ```java
  mall:
    uoload:
      baseUrl: "http://image.mall.com"
      allowTypes:
       - image/png
       - image/jpeg
       - image/jpg
  
  @Data
  @ConfigurationProperties(prefix = "mall.upload")
  public class UploadProperties {
      private String baseUrl;
      private List<String> allowTypes;
  }
  
  //业务层定义
  @EnableConfigurationProperties(UploadProperties.class)
  
  //声明注入
  @Autowired
  private UploadProperties uploadProperties;
  	
  //取用
  uploadProperties.getAllowTypes();
  ```

### 方法传参小于方法定义参数

- `@RequestParam(value = "gid",required = false)`

```java
@GetMapping("params")
    public ResponseEntity<List<SpecParam>> queryParamList(
            @RequestParam(value = "gid",required = false) Long groupId,
            @RequestParam(value = "cid",required = false) Long cid){
        return ResponseEntity.ok(specificationService.queryParamList(groupId,cid));
    }
```

