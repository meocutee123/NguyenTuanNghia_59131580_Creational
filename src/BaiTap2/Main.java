package BaiTap2;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder("Nghia ")
        .addFloat(10f).addbool(true);
        System.out.println(builder.toString());

    }
}