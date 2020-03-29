package laba8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Catalog {
    public static void main(String[] args) {

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Вороновський","Львів");
        linkedHashMap.put("Підставський","Київ");
        linkedHashMap.put("Скрекля","Одеса");
        linkedHashMap.put("Буца","Харків");
        linkedHashMap.put("Іванцік","Ужгород");
        linkedHashMap.put("Кіцера","Полтава");
        linkedHashMap.put("Ракович","Житомир");
        linkedHashMap.put("Піщулін","Суми");
        linkedHashMap.put("Кулик","Луцьк");
        linkedHashMap.put("Антоник","Трускавець");

        System.out.println("Кількість студентів : "+linkedHashMap.size());
        System.out.println("Виберіть операцію : ");
        System.out.println("1 - Занести у каталог. ");
        System.out.println("2 - Пошук у каталозі. ");
        System.out.println("3 - Видалення з каталогу. ");
        System.out.println("4 - Вихід з програми.");

        String s1 = "Вибачте , такого студента немає , спробуйте ще раз";
        String s2 = "Введіть прізвище : ";
        String s3 = "Введіть місто : ";

        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = scanner.nextInt();

        while (true)
        if(n==1){

            System.out.println(s2);
            String surname = null;
            try {
                surname = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(s3);
            String country = null;
            try {
                country = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            linkedHashMap.put(surname,country);
            System.out.println("Операція пройшла успішно : "+linkedHashMap.keySet());
            System.out.println("Виберіть пунк з меню : ");
            n = scanner.nextInt();
        } else if (n==2){

            System.out.println("Введіть прізвище яке ви шукаєте : ");
            String surname1 = null;

            try {
                surname1 = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if(linkedHashMap.containsKey(surname1)){
                System.out.println(linkedHashMap.get(surname1));
                System.out.println("Виберіть пунк з меню : ");
                n = scanner.nextInt();
            } else {
                System.out.println("Вибачте , такого прізвища немає.");
                System.out.println("Виберіть пунк з меню : ");
                n = scanner.nextInt();
            }

        } else if (n==3){

            System.out.println("Введіть прізвище студента якого ви хочете видалити : ");
            String surname2 = null;

            try {
                surname2 = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if(linkedHashMap.containsKey(surname2)){
                linkedHashMap.remove(surname2);
                System.out.println("Успішно видалено : ");
                System.out.println(linkedHashMap.keySet());
                System.out.println("Виберіть пунк з меню : ");
                n = scanner.nextInt();
            } else {
                System.out.println("Вибачте , такого прізвища немає.");
                System.out.println("Виберіть пунк з меню : ");
                n = scanner.nextInt();
            }

        } else if(n==4){

            break;

        } else {
            System.out.println("Такого пункту немає , спробуйте ще раз.");
            n = scanner.nextInt();

        }
    }
}
