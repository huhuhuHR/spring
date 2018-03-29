package chapter4.declareParent;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopConfig {
//
    @DeclareParents(value = "chapter4.declareParent.Person+", defaultImpl = SkillImpl.class)
    public Skill skill;
}
