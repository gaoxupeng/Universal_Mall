# FastDFS 一种分布式文件存储系统

<!--相关代码请查看mall_upload下的UploadController及UploadServiceImpl-->

## 交互过程

<h3>一，上传交互过程</h3>

1.  client询问tracker上传到storage，不需要附加参数。
2. tracker返回一台可用的storage。
3. client直接和storage通讯完成文件上传。

<h3>二，下载交互过程</h3>

1. client询问tracker下载文件的storage,参数为文件标识（卷名和文件名）
2. tracker返回一台可用的storage;
3. client直接和storage通讯完成下载；



