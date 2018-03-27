package chapter1.aop;

public class KnightA {
    private Quest quest;

    public KnightA(Quest quest) {
        this.quest = quest;
    }

    public void handler() {
        quest.kill();
    }
}
