package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("https://google.com/");
        history.push("https://github.com/");
        history.push("https://stackoverflow.com/");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
