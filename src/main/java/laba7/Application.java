package laba7;

public class Application {
    public static void main(String[] args) {

        String str = "5";
        float f = new Float(str).floatValue();
        System.out.println("Float : "+f);

        byte b = new Byte(str).byteValue();
        System.out.println("Byte : "+b);

        short s = new Short(str).shortValue();
        System.out.println("Short : "+s);

        int i = new Integer(str).intValue();
        System.out.println("Integer : "+i);

        long l = new Long(str).longValue();
        System.out.println("Long : "+l);

        double d = new Double(str).doubleValue();
        System.out.println("Double : "+d);

        int n = 6;
        System.out.println("Двійкова система : "+Integer.toBinaryString(n));
        System.out.println("Вісімкова система : "+Integer.toOctalString(n));
        System.out.println("Шістнадцяткова система : "+Integer.toHexString(n));



    }
}
