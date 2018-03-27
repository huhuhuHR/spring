package chapter1.di;

public class WorseKnight {
    private QuestA quest;

    public WorseKnight() {
        // 这里就使得 WorseKnight 和new QuestA()下次再换个QuestB他就不兼容要改
        quest = new QuestA();
    }

    // 该方法的前提条件是一定做过quest = new QuestA();否则找不到，并且不便于测试
    public void doSomething() {
        quest.bark();
    }
}
