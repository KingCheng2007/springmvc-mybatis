#
spring-mvc中配置説明：
BeanNameUrlHandlerMapping：表示将请求的URL和Bean名字映射，如URL为 “上下文/hello”，
则Spring配置文件必须有一个名字为“/hello”的Bean，上下文默认忽略。

SimpleControllerHandlerAdapter：表示所有实现了org.springframework.web.servlet.mvc.Controller
接口的Bean可以作为Spring Web MVC中的处理器。如果需要其他类型的处理器可以通过实现HadlerAdapter来解决。

InternalResourceViewResolver：用于支持Servlet、JSP视图解析；

viewClass：JstlView表示JSP模板页面需要使用JSTL标签库，classpath中必须包含jstl的相关jar包；

prefix和suffix：查找视图页面的前缀和后缀（前缀[逻辑视图名]后缀），比如传进来的逻辑视图名为hello，
则该该jsp视图页面应该存放在“WEB-INF/jsp/hello.jsp”
#####################################################################################
集成Web环境的通用配置：

<context-param>
      <param-name>contextConfigLocation</param-name>
      <param-value>
          classpath:spring-common-config.xml,
          classpath:spring-budget-config.xml
      </param-value>
</context-param>
<listener>  <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
</listener>

 

如上配置是Spring集成Web环境的通用配置；一般用于加载除Web层的Bean（如DAO、Service等），以便于与其他任何Web框架集成。

contextConfigLocation：表示用于加载Bean的配置文件；

contextClass：表示用于加载Bean的ApplicationContext实现类，默认WebApplicationContext。