package Proxy;

public class RealImage implements Image{
    String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        display();
    }

    @Override
    public void display() {
        System.out.println("Загрузка изображения из файла " + fileName);
    }
}
