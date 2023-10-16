import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;

public class StringTest {

    public static void main(String[] args) {
        String s = "hello world aaa bbb     ";
        System.out.println(s);

        String trimmedS = s.trim();

        System.out.println(s);
        System.out.println(trimmedS);

        Integer intVar = Integer.valueOf(99);

        AtomicInteger ai = new AtomicInteger(9);
        System.out.println("ai.incrementAndGet() = " + ai.incrementAndGet());

        String str = "";

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            str = str + i;
        }
        long end = System.currentTimeMillis();
        System.out.println("It takes " + (end - start));

        String a = "hello" + "from" + "santa" + "claus";


        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("asd");

        StringBuilder sb = new StringBuilder();
        long startSB = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
        }
        long endtSB = System.currentTimeMillis();
        System.out.println("It takes with SB " + (endtSB - startSB));

        String s1 = sb.toString();


    }
}
