public class Ex_8 {
    public static void main(String[] args) {
        var workHours = 640;
        var oneEmployeeHours = 8;
        var numberOfEmloyees = workHours / oneEmployeeHours;
        System.out.println("Ex_8");
        System.out.println("Всего сотрудников в компании - " + numberOfEmloyees + " человек");

        System.out.println("Если в компании работет " + (numberOfEmloyees + 94) + " человек, то всего "
        + (numberOfEmloyees + 94) * oneEmployeeHours + " часов работы может быть поделено между сотрудниками");
    }
}
