package lab4;

public class Application {
    public static void main(String[] args) {

        char Array [] = {'Н','Л','Т','У',' ','І','Д','К','Т','Д',' ','К','Н','2','1',' ','К','О','М','П','Ю','Т','Е','Р','Н','І',' ','Н','А','У','К','И'};
        System.out.println(Array);

        String str = new String(Array,0,Array.length-16);
        System.out.println("Завдання 2: \n"+str);

        String str2 = new String("");
        for (int i = str.length()-1; i >=0 ; i--) {
            str2+=str.charAt(i);
        }
        System.out.println("Завдання 3: \n"+str2);

        String str3 = str.toUpperCase();
        System.out.println("Завдання 4: \n"+str3);
        if(str3.compareToIgnoreCase(str)==0){
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }

        System.out.println("Завдання 5: \n"+str.substring(5,11));
        String str4 = str+str3;

        System.out.println("Завдання 6: \n"+str4);
        String s="Д";

        System.out.println("Завдання 7: \n Перше та останнє входження букви: "+s+" "+str.indexOf(s)+" "+str.lastIndexOf(s));

    }
}
