## Hibernate框架
1. Hibernate核心配置文件
	- ORM(对象关系映射) 思想
	- 数据库信息
	- hibernate信息
	- 映射配置
	- Hibernate核心配置文件
		> 如果单纯使用Hibernate框架, 核心配置文件名称 Hibernate.cfg.xml 和 位置(src)是固定的
		> Hibernate 和Spring 整合时候, hibernate 核心配置文件名称和位置没有固定要求.
2. Hibernate映射配置文件
	- 实体类和数据库表映射关系使用ORM思想
3. Hibernate操作的步骤
	- 在Spring框架对Hibernate框架进行封装, 使用hibernateTemplate
------------------------------------------------------------------
## Struts2 框架
1. Action 操作
	- action 创建的三种方式
		> 继承类 ActionSupport *
		> 普通类
		> 实现接口
	- 配置action访问路径
		> 创建struts.xml配置文件, 这个文件名称和位置固定src下面
	- 配置访问action的多个方法
		> 是用通配符方式配置
	- 在action获取表单提交数据
		> 获取request对象(使用ServletActionContext类获取)
		> 属性封装
		> 模型驱动(重点)
		> 表达式封装
	- 在action操作域对象
		> 使用ServletActionContext获取域对象
	- 配置struts2的过滤器
2. 值栈
	- 向值栈放数据
		> set方法
		> push方法
		> 定义变量, 生产get方法
	- 从值栈获取数据
		> 在jsp中使用struts2标签+ognl标签
		> <s:property>
		> <s:iterator>
		
3. 拦截器
	- AOP和责任链模式
	- 自定义拦截器
		> 继承MethodFilterInterceptor
		> 重写类里面的方法
		> 配置拦截器和action的关联
----------------------------------------------------
## Spring框架
1. Spring核心配置文件
	- 名称和位置没有固定要求
	- 在Spring核心配置文件中引入schema约束
2. 创建对象
	- xml配置方式: <bean id="" class="" scope=""/>
	- 注解方法:四个注解
3. 注入属性(对象类型的属性)		
	- xml配置方式
	- 注解方法: 两个注解(@Autowired @Resource)
4. 使用ServletContext对象和监听器实现
	- 在服务器启动时候, 加载Spring配置文件, 创建对象
	- 配置服务器监听器
	- 指定Spring配置文件的位置
5. JdbcTemplate
6. Spring事务配置
	- XML方式
	- 注解方式

## 整合
1. 两个框架整合
	- struts2框架和Spring框架整合
		> 把struts2的action对象创建, 交给Spring进行管理
		> <bean id="" class="" scope="prototype"/>
	- Spring和Hibernate整合
		> 把hibernate核心配置文件里面的数据库配置, 直接写在Spring配置文件中
		> 第一次访问很慢, 因为第一次访问时候创建sessionFactory对象
		> 把sessionFactory对象创建交给Spring管理
		> 在服务器启动时创建sessionFactory

## Spring 分模块开发
1. 在Spring里面配置多个内容, 造成配置混乱, 不利于维护.
2. 把Spring核心配置文件中, 一部分配置 放到单独的配置文件中, 在Spring核心配置文件中引入单独配置文件
	```
	 <import resource="classpath:user.xml"/>
	```

		
		
		