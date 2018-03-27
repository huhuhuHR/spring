package chapter1.di;

public class BetterKnight {
    private Quest quest;

    // 通过构造松耦合
    public BetterKnight(Quest quest) {
        this.quest = quest;
    }

    public void doSomething() {
        quest.bark();
    }
}
