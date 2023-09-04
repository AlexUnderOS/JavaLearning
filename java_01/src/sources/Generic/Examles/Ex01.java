package sources.Generic.Examles;

public class Ex01<T, E> {

    private static String string = "";

    public static String getString() {
        return string;
    }


    public void addToString(T t, E e){
        if (this.string.equals("")){
            this.string = this.string + t.toString() + e.toString();
        }else {
            this.string = this.string + "\n" + t.toString() + e.toString();
        }
    }
}
