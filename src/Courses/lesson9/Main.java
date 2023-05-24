package Courses.lesson9;

import Courses.lesson7.Animal;

public class Main {
    boolean code;

    @Override
    public boolean equals(Object obj) {
        return code;
    }

    public static void main(String[] args) {
        String name1 = "Kate";
        String name2 = "Max";
        System.out.println(name1.equals(name2));
        //Память делится на Стэк и Хип
        //При создании обьекта выделяется новая область памяти и записывается в свою область
        //equals по умолчанию сравнивает ссылки, которые ведут в области памяти
        //чтоб equals была true надо приравнять обьекты друг к другу name1 = name2
        //equals переопределенный сравнивает значения полей обьекта
        //equals и hashcode - контракт. Переопределяются вместе
        //Коллекции используют и equals, и hashcode вместе

        //Clone
        //Клонирование поверхностное и глубокое
        //Поверхностное клонирует строки, но не обьекты
        //Глубокое клонирует полностью, включая обьекты (все клонируемые классы должны быть имплементированы Cloneable
        //Придется вручную прописываь клонирование обьектов (явно)
    }
}
