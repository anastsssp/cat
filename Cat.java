public class Cat extends Animal {
    String name;
    String nickname;

    public Cat(Object head, Object leg, String name, String nickname) {
        super(head, leg);
        this.name = name;
        this.nickname = nickname;
    }

    public Cat(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public Cat() {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + "'Funny" +
                ", nickname='" + nickname + "'Fun" +
                '}';
    }
}
