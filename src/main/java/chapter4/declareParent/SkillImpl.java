package chapter4.declareParent;

import org.springframework.stereotype.Component;

@Component
public class SkillImpl implements Skill {
    public void getSkill(String skill) {
        System.out.println(skill);
    }
}
