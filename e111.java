class Test {
    public static void main(String[] args) {
        show(new Cat());
        show(new Dog());

        Cat a = new Cat();
        a.eat();
        a.work();
    }

    public static void show(Animal a)  {
        a.eat();

        if (a instanceof Cat)  {  //
            Cat c = (Cat)a;
            c.work();
        } else if (a instanceof Dog) { //
            Dog c = (Dog)a;
            c.work();
        }
    }
}

interface Animal {
    void eat();
}

class Cat implements Animal {
    public void eat() {
        System.out.println("吃鱼");
    }
    public void work() {
        System.out.println("抓老鼠");
    }
}

class Dog implements Animal {
    public void eat() {
        System.out.println("吃骨头");
    }
    public void work() {
        System.out.println("看家");
    }
}