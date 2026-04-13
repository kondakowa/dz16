/* Создайте класс, в котором создайте метод email. Данный метод должен принимать 
в инпут 1 String параметр. Данный параметр должен содержать в себе email-ы в следующем виде:
ya@yahoo.com
; on@mail.ru
; ona@gmail.com
; , т.е.
После каждого e-mail должен стоять знак препинания “;”. Ваш метод должен выводить 
на экран информацию о том, какой почтой пользуются, исходя из параметра, т.е. output 
должен быть следующего вида:
yahoo
mail
gmail
Продемонстрируйте данный метод.*/
package Lesson16;

public class DZ16 {

    public static void email(String s) {

        String[] s1 = s.split(";");

        for (int i = 0; i < s1.length; i++) {
            String e = s1[i].trim();

            if (!e.isEmpty()) {

                String partAfterDog = e.substring(e.indexOf("@") + 1);
                String service = partAfterDog.substring(0, partAfterDog.indexOf("."));

                System.out.println(service);
            }
        }
    }

    public static void main(String[] args) {

        String s = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";
        email(s);

    }
}