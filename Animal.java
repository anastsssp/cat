public class Animal <A, B> {
     private A head;
     private B leg;

     public Animal(A head, B leg) {
          this.head = head;
          this.leg = leg;
     }

     public Animal() {

     }

     public A getHead() {
          return head;
     }

     public void setHead(A head) {
          this.head = head;
     }

     public B getLeg() {
          return leg;
     }

     public void setLeg(B leg) {
          this.leg = leg;
     }
}
