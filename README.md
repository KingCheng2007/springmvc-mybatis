# springmvc-mybatis

GIT for Windows地址：https://git-for-windows.github.io/

 Git错误non-fast-forward后的冲突解决： http://blog.csdn.net/chain2012/article/details/7476493

 执行Maven Install打包的时候，提示以下警告信息：
[WARNING] Using platform encoding (GBK actually) to copy filtered resources, i.e. build is platform dependent!

在Eclipse中使用workspace 使用编码UTF-8即可

Eclipse中使用GIT
http://yufenfei.iteye.com/blog/1750124/

修改上下文名字
settings/ org.eclipse.wst.common.component


?    匹配一个字符，如/index? 可以匹配 /index1 ， 但不能匹配 /index 或 /index12  
*    匹配零个或多个字符，如/index1/*，可以匹配/index1/demo，但不匹配/index1/demo/demo 
**   匹配零个或多个路径，如/index2/**：可以匹配/index2路径下的所有子路径，如匹配/index2/demo，或/index2/demo/demo 
 
如果我有如下模式，那Spring该选择哪一个执行呢？当我的请求为“/long/long”时如下所示： 
/long/long 
/long/**/abc  
/long/** 
/** 
Spring的AbstractUrlHandlerMapping使用：最长匹配优先； 
如请求为“/long/long” 将匹配第一个“/long/long”，但请求“/long/acd” 则将匹配 “/long/**”，如请求“/long/aa/abc”则匹配“/long/**/abc”，如请求“/abc”则将匹配“/**”

提示：推荐能使用servlet规范中的过滤器Filter实现的功能就用Filter实现，因为HandlerInteceptor只有在Spring Web MVC环境下才能使用，因此Filter是最通用的、最先应该使用的。如登录这种拦截器最好使用Filter来实现。

Mybatis的常用的网站
Mybatis支持saveOrupdate的处理方式
http://blog.csdn.net/isea533/article/details/45578415
Poi处理文件上传下载
http://wdmcygah.iteye.com/blog/2166081


http://blog.csdn.net/collonn/article/details/39259227

综合博客 http://www.cnblogs.com/Leo_wl/p/3530464.html

myBaits 深入浅出：http://blog.csdn.net/hupanfeng/article/details/9068003/

浅浅读源码show:http://haohaoxuexi.iteye.com/
