### spring
* scope singleton 单例 prototype 原型-每次创建一个</br>
        1.singleton单例模式,全局有且仅有一个实例</br>
        2.prototype原型模式，每次获取Bean的时候会有一个新的实例</br>
* default-lazy-init</br>
    true延长启动</br>
    当属性default-lazy-init设置为true时，Spring启动时不会再去加载整个对象实例图，不过这样做可以大大减小Spring的启动时间。所谓的加载整个对象实例图就是从初始化action配置、到service配置、到dao配置以及数据库连接等等
* Lazy-init 
    只有单例的bean才有可能在容器初始化的时候就完成依赖注入</br>
    当bean的scope="pototype"，即使设置Lazy-init=“false”也是不会起作用的（不会随Spring容器启动而实例化）</br>
    另外这当中有两个参数需要说明：</br>
    (1).init-method指定初始化Bean时执行的方法；</br>
    (2).destory-method指定Bean销毁是执行的方法；</br>
    bean的默认lazy-init=false，不需要延迟加载，IoC 容器将在服务器启动的时候，会解读ApplicationContext.xml文件，不管你是不是要使用该bean，都会先进行实例化。这会造成启动的时候，特别的慢。但是，也是最保险的方法

### spring加载配置web
* ClassPathXmlApplicationContext 从类路径中加载
* FileSystemXmlApplicationContext 从文件系统加载
* XmlWebApplicationContext 从web系统中加载

### ref 根据helloSpring相互依赖 property 属性注入
    <bean id="helloSpringService"
          scope="prototype"
          class="com.huhuhu.test.HelloSpringService">
        <property name="helloSpring" ref="helloSpring"></property>
    </bean>
    
### BeanPostProcessor
    <bean id="beanPostProcessor"
          class="com.huhuhu.test.BeanPostProcessorImpl"/>
     public interface BeanPostProcessor {
         //bean初始化方法调用前被调用
         Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;
         //bean初始化方法调用后被调用
         Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
     
     }
     --> Spring IOC容器实例化Bean
     --> 调用BeanPostProcessor的postProcessBeforeInitialization方法
     --> 调用bean实例的初始化方法
     --> 调用BeanPostProcessor的postProcessAfterInitialization方法
     
###  bean 注入set | list | array | map | Properties
       <bean id="collectionBean"
          class="com.huhuhu.test.CollectionBean"
          scope="singleton"
          lazy-init="default">
        <!-- set集合 -->
        <property name="sets">
            <set>
                <value>岑红军</value>
                <value>军哥</value>
                <value>哈哈</value>
                <value>呵呵</value>
                <value>嘿嘿</value>
                <value>洗洗</value>
            </set>
        </property>
        <!-- list集合 -->
        <property name="users">
            <list>
                <ref bean="u1"/>
                <ref bean="u2"/>
                <ref bean="u3"/>
                <ref bean="u4"/>
            </list>
        </property>
        <!-- Array -->
        <property name="arrays">
            <array>
                <ref bean="u1"/>
                <ref bean="u2"/>
                <ref bean="u3"/>
                <ref bean="u4"/>
            </array>
        </property>
        <!-- map -->
        <property name="map">
            <map>
                <entry key="1" value-ref="u1"></entry>
                <entry key="2">
                    <ref bean="u2"/>
                </entry>
                <entry key="3" value-ref="u3">
                </entry>
            </map>
        </property>

        <property name="props">
            <props>
                <prop key="1">${jdbc.username}</prop>
                <prop key="2">${jdbc.password}</prop>
                <prop key="3">${jdbc.url}</prop>
            </props>
        </property>
    </bean>
### bean 注入null属性
    <bean id="menberBean"
          class="com.huhuhu.test.MemberBean">
        <property name="name">
            <null></null>
        </property>
        <property name="member">
            <null></null>
        </property>
    </bean>
    
### bean 通过构造函数注入
    <bean id="employeeBean" class="com.huhuhu.test.EmployeeBean">
        <constructor-arg type="java.lang.String" value="陈红均" />
        <constructor-arg type="java.lang.String" value="男" />
        <constructor-arg type="java.lang.Double" value="100.0" />
        <constructor-arg type="com.huhuhu.test.Dept"ref="dept" />
    </bean>
    
### bean 根据索引index注入
    <bean id="employeeBean"
          class="com.huhuhu.test.EmployeeBean">
        <constructor-arg index="0" value="huhuhuHR"/>
        <constructor-arg index="1" value="100.0"/>
        <constructor-arg index="2" ref="dept"/>
        <constructor-arg index="3" value="男"/>
    </bean>
### bean 根据参数名称注入
    <bean id="employeeBean" class="www.csdn.spring.constructor.bean.EmployeeBean">
        <constructor-arg name="name" value="陈红均" />
        <constructor-arg name="salary" value="100.0" />
        <constructor-arg name="dept" ref="dept" />
        <constructor-arg name="sex" value="男" />
    </bean>