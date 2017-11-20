# s1sh

**Struts1属于过时产品，此项目作为学习使用**


##### Demo页面

<img src="https://github.com/yongzhian/s1sh/blob/master/doc/login.png"/>

<img src="https://github.com/yongzhian/s1sh/blob/master/doc/index.png"/>

##### 流程说明

基于ActionServlet进行分流，配置文件struts-config.xml，参数提交需要form-bean，继承ActionForm或DynaActionForm，后者无须手动书写类，只需要配置属性，同时配置action-mappings，JSP默认为.do请求。通过ContextLoaderPlugIn配置加载Spring。Hibernate中sessionFactory在Spring中配置，DaoImpl使用注解进行注入，同时给sessionFactory配置hibernate.cfg.xml和hbm.xml。

##### 版本说明

struts1只能兼容spring3，而spring3只支持hibernate到4。Hibernate4.3.X中，org.hibernate.service.jta.platform.spi.JtaPlatform类换成了： org.hibernate.engine.transaction.jta.platform.spi.JtaPlatform;故使用hibernate 4.2.21.Final。故采用版本struts 1.3.10+spring 3.2.17.RELEASE + hibernate 4.2.21.Final

##### 项目特色
1. 使用Struts1标签
1. 国际化
1. 添加MD5Util
1. 声明式事务，配置在Service
1. bean使用配置进行注入
1. 添加Jetty的Web测试
2. 添加SPI测试，动态查找指定目录下的实现类,参考http://blog.csdn.net/tonyhuang_google_com/article/details/49702291和http://blog.csdn.net/fenglibing/article/details/7083071
3.基于Form的简单提交
4.Hibernate注解中，SysNode使用配置，其他使用注解
5.直接使用Hibernate的SessionFactory