package hello.core.singleton;

public class SingletonService {
    private static final SingletonService instaance = new SingletonService();

    public static SingletonService getInstance(){
        return instaance;
    }
    private SingletonService(){}
    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

}
