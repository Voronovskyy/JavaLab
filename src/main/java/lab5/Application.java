package lab5;

public class Application {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Вороновський Данило Юрійович, 25.07.2001");
        System.out.println("1.\t"+str);

        str = str.delete(30,36);
        System.out.println("2.\t"+str);

        str = str.append(", м.Львів");
        System.out.println("3.\t"+str);

        str = str.insert(str.indexOf("1")+1, ", ч");
        System.out.println("4.\t"+str);

        System.out.println("5.\t"+"Довжина рядка (символи) : "+str.length()+"\n\t(байти) : "+str.capacity());

        str.setLength(28);
        System.out.println("6.\t"+str);

        str.setLength(12);
        System.out.println("7.\t"+str.reverse());
    }
}
