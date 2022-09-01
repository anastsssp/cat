public class Dog extends Animal{
    String name;
    String type;
    String nickname;

    public Dog(Object head, Object leg, String name, String type, String nickname) {
        super(head, leg);
        this.name = name;
        this.type = type;
        this.nickname = nickname;
    }

    public Dog(String name, String type, String nickname) {
        this.name = name;
        this.type = type;
        this.nickname = nickname;
    }

    public Dog() {

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + "'Baggy" +
                ", type='" + type + "'Schpitz"+
                ", nickname='" + nickname + "'Bag" +
                '}';
    }
}
