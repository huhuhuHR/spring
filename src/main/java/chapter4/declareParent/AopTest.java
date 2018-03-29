package chapter4.declareParent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// @RunWith(SpringJUnit4ClassRunner.class) 来启动 Spring 对测试类的支持
@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration 注释标签来指定 Spring 配置文件或者配置类的位置
@ContextConfiguration(classes = SpringConfig.class)
public class AopTest {

    @Autowired
    private Student student;

    @Test
    public void test() {
        // 通过类型转换，student对象就拥有了SkillImp 类的方法
        Skill skill = (Skill) student;
        skill.getSkill("我会英语");
        student.sayIdentification();
    }
}
