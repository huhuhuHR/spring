# 自动检测bean
    <context:annotation-config/> 与<context:component-scan/>区别:</br>
    简单说就是后者可以完成前者工作，还允许自动检测bean
# @component
    通用的构造注解，标示该类为Spring组件</br>
    Component工作方式：</br>
    Spring扫描包发现@component注解所标注的Guitar，并自动把它组册为springBean。</br>
    id默认为无限定类名。也可以为@Component("myGuitar")给id。
# 过滤组件扫描
    <context:include-filter/>:</br>
    场景：Instrument有很多实现类，我是不是要一个个都去@component组册，很麻烦。</br>
    通过<context:exclude-filter/>过滤器扫描制定类的派生类，并注册</br>
    <context:exclude-filter/>:</br>
    告诉spring那些类不需要注册成bean
# @Configuration
    告诉spring这个类将包含一个或者多个springbean
# @Bean
    装配spring基于java配置所声明的bean。
    