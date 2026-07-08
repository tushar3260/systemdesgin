package desginPattern.Behavioral;
import java.util.*;

interface Subscriber{
    void update(String message);
}
class User implements Subscriber{
    private String name;
    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void update(String message) {
        System.out.println("User " + name + " received message: " + message);
    }
}
class Channel{
    private List<Subscriber> subscribers = new ArrayList<>();
    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
    }

    public void notifySubscribers(String videoTitle) {
        for (Subscriber s : subscribers) {
            s.update(videoTitle);
        }
    }
    public void uploadVideo(String title) {
        System.out.println("New Video Uploaded: " + title);
        notifySubscribers(title);
    }
}


public class ObserverPatter {
    public static void main(String[] args) {
        Channel channel = new Channel();
        Subscriber s1 = new User("Tushar");
        Subscriber s2 = new User("Rahul");
        Subscriber s3 = new User("Aman");
        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);
        channel.uploadVideo("Observer Pattern in Java");
    }
}
