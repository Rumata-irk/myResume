package com.rumata;

public class PreviousEmployment {
    final static String TAB = "\t";
    final static String DOUBLE_TAB = "\t\t";

    private static void btk() {
        System.out.println(TAB + "11.2019 - настоящее время. ООО «БТК-хим», должность Логист\n");
    }

    private static void leroy() {
        System.out.println(TAB + "04.2019 – 11.2019. ООО «Леруа Мерлен Восток», должность Специалист по приемке товаров\n");
    }

    private static void irpac() {
        System.out.println(TAB + "06.2015 – 12.2018. ООО «Ирпак», должность Менеджер по продажам\n");
    }

    private static void pronto() {
        System.out.println(TAB + "12.2006 – 06.2016. ООО «Пронто-Байкал», должность Сотрудник тех.отдела, позже старший верстальщик:");
        System.out.println(DOUBLE_TAB + "— Планирование и организация закупок компьютерной техники, оргтехники и расходных материалов");
        System.out.println(DOUBLE_TAB + "— Обслуживание компьютерного парка организации (диагностика, замена з/ч, установка ПО и пр.)");
        System.out.println(DOUBLE_TAB + "— Консультирование пользователей по использованию компьютерной техники и ПО");
        System.out.println(DOUBLE_TAB + "— Дизайн и верстка печатной продукции");
        System.out.println(DOUBLE_TAB + "— Подготовка макетов к печати");
        System.out.println(DOUBLE_TAB + "— Организация работы отдела\n");
    }

    private static void ocntid() {
        System.out.println(TAB + "04.2005 – 11.2006. Областной центр народного творчества и досуга при Комитете по культуре Иркутской области, \n\t\t\t\t\t   должность Главный специалист аналитического отдела\n");
    }

    private static void irgtu() {
        System.out.println(TAB + "02.2000 – 05.2005. Иркутский государственный технический университет, должность Лаборант, \n\t\t\t\t\t   позже программист Лаборатории информационных технологий:");
        System.out.println(DOUBLE_TAB + "— Обслуживание компьютерного парка организации (диагностика, замена з/ч, установка ПО и пр.)");
    }

    public static void previousEmployment() {
        btk();
        leroy();
        irpac();
        pronto();
        ocntid();
        irgtu();
    }

}
