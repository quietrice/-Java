package Z3;

class Shape {
    private double volume;

    //Получение объёма
    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}

class Pyramid extends Shape {
    private double s;
    private double h;

}


class Box extends Shape {


    //Добавление фигуры в контейнер
    public boolean add(Shape shape) {
        if (this.getVolume() < shape.getVolume()) {
            return false;
        } else {
            //Оставшееся свободное место
            double freeVolume = this.getVolume() - shape.getVolume();
            this.setVolume(freeVolume);
            return true;
        }
    }
}

class SolidOfRevolution extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

}

class Cylinder extends SolidOfRevolution {
    private double height;


}

class Ball extends SolidOfRevolution {

}



public class Main {

    public static void main(String[] args) {
        Box box = new Box();
        box.setVolume(100.5);

        Ball ball1 = new Ball();
        ball1.setVolume(33.5);

        System.out.println("\nОбъём коробки: " + box.getVolume());
        boolean result = box.add(ball1);
        System.out.println("Флаг добавления объекта: " + result);
        System.out.println("Объём коробки: " + box.getVolume());

        SolidOfRevolution obj = new SolidOfRevolution();
        obj.setVolume(435);
        System.out.println("\nОбъём коробки: " + box.getVolume());
        result = box.add(obj);
        System.out.println("Флаг добавления объекта: " + result);
        System.out.println("Объём коробки: " + box.getVolume());

    }

}
