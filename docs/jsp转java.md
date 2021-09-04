idea的web项目不是直接将webapp放在tomcat容器中。而是将生成的webapp与tomcat按照idea的“技术”形成连接，这样减少了很大的配置tomcat的时间，一次配置，一劳永逸。

当webapp放置在tomcat容器中的时候，jsp生成的java文件与编译好的class文件会被放置在tomcat的work目录下，方便查看生成的java文件。

idea 的jsp的java与class文件目录：

    C:\Users\登录名\.IntelliJIdea2017.2\system\tomcat\Tomcat-pure_工程名\work\Catalina\localhost\appcontext名称\org\apache\jsp