打开tomcat文件夹到conf目录下

修改logging.properties

找到

    java.util.logging.ConsoleHandler.encoding = utf-8

更改为

    java.util.logging.ConsoleHandler.encoding = GBK

就可以了！