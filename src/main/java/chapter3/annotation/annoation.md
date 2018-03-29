# @Atutowired
* 场景一：Setter方法
* 场景二：任意需要自动装配Bean引用的地方
* 场景三：构造器注入
* 场景四：属性注入

# @Atutowired @Qualifer
> 定义了一个Instrument接口 两个实现类 通过Atutowired给instrument注入
> 'chapter3.annotation.Instrument' available: expected single matching bean but found 2: guitar,piano

# @Qualifer用法
    1.对应属性上@Qualifer("类的非限定名字")</br>
    2.对应被注入类@Qualifier("huhuhuHR")自定义id，然后去对应注入属性上面@Qualifier("huhuhuHR")
    3.自定义注解方式，详细见本例StringedInstrument用法