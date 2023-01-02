/*
Adott egy csv fájl, ami munkavállalókat tartalmaz egy IT cégnél. A munkavállalónak van pozíciója, neve, fizetése és egy “egyéb mező” amibe egyéb információkat lehet tárolni a munkavállalóról.
Position, Name, Salary, Custom Field
Tester, Teszt Elek, 1000000, -
Developer, Mekk Elek, 1150000, contractor
HrAssistant, Eszet Lenke, 550000, -
FinanceAssistant, Mezei Virág, 620000, -
ExecutiveDirector, Dísz Nóra, 1200000, -
Developer, Vincs Eszter, 1300000, -
Tester, Gipsz Jakab, 1210000, contractor

Készítsetek egy programot, ami képes a megadott fájl tartalmát egy List<Employee> listába
felolvasni. Az Employee legyen egy abstract osztály, melynek leszármazottai a Tester,
Developer, HrAssistant, FinanceAssistant és ExecutiveDirector osztályok.
A programban bizonyosodjunk meg róla, hogy a fájlokban szereplő employee-k mind
a fentebbi öt kategória valamelyikébe tartoznak ellenkező esetben dobjunk hibát.

 */
public class Main {
    public static void main(String[] args) {
        EmployeeReader employeeReader = new EmployeeReader();
        employeeReader.read();

        System.out.println(employeeReader.getListOfEmployee());
    }
}
