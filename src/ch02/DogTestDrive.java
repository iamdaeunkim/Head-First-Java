package ch02;

public class DogTestDrive {
    public static void main (String [] args) {

        Dog d = new Dog(); //Dog 객체를 만든다
        d.size = 40; //점 연산자(.)를 써서 Dog의 크기를 설정
        d.bark(); //그리고 그 bark()메소드를 호풀
    }
}
