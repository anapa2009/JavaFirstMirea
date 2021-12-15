package ru.mirea.task4.opt1;

public class TestAuthor {
    public static void main (String[] args) {

        // Создаем экземпляр класса Author
        Author author =
                new Author("Алекс Прайм","email@email.com", 'м');
        System.out.println("\n"+author);

        // Меняем Email
        author.setEmail ("new_email@email.com");

        //Меняем признак gender
        author.setGender ('m');

        System.out.println(author);
    }
}
