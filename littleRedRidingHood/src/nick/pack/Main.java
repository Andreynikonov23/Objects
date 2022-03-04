package nick.pack;

public class Main {
    /* Сказка «Красная Шапочка»
       1. Есть пять классов: красная шапочка, бабушка, пирожок, дровосек, волк.
       2. У каждого класса есть 2 поля: убил (killed ArrayList) и съел (ate ArrayList).
       3. Необходимые объекты созданы (hood, grandmother, ...).
       4. Расставь правильно связи, кто кого съел и убил, чтобы получилась логика сказки «Красная Шапочка».
       PS: пирожки никто не ел. Их только несли. Волк чуток поел. А его потом убили.
     */
    public static void main(String[] args) {
        Hood hood = new Hood();
        Grandmother grandmother = new Grandmother();
        Wolf wolf = new Wolf();
        Woodcutter woodcutter = new Woodcutter();
        Pie pie = new Pie();
        wolf.ate(grandmother.getNAME());
        wolf.ate(hood.getNAME());
        wolf.ate(pie.getNAME());
        woodcutter.killed(wolf.getNAME());
        System.out.println(pie);
        System.out.println(hood);
        System.out.println(grandmother);
        System.out.println(wolf);
        System.out.println(woodcutter);

    }
}
