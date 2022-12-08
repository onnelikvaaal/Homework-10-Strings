public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Ёжиков";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника -- " + fullName);
        System.out.println();
        //второй варик от Коляна с использованием стрингбилдера
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(lastName).append(" ").append(firstName).append(" ").append(middleName);
        System.out.println(stringBuilder);
        System.out.println();

        System.out.println("Task 2");
        String fullNameUp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчёта -- " + fullNameUp);
        System.out.println();

        System.out.println("Task 3");
        if (fullName.contains("ё")) {
            fullName = fullName.replace("ё", "е");
        }
        if (fullName.contains("Ё")) {
            fullName = fullName.replace("Ё", "Е");
        }
        System.out.println("Данные ФИО сотрудника -- " + fullName);
        //в подсказке к задаче сказано использовать методы split и contains, я сделала задачу с contains и replace, мне кажется так проще и быстрее
    }
}