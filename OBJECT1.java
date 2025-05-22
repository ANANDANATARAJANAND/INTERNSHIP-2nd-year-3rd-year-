abstract class OBJECT1 {
    abstract void draw();  

class Circle extends OBJECT1 {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square extends OBJECT1 {
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }
}
}

