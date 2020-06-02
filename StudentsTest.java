package homework3;

public class StudentsTest {
    public static void main (String [ ] args){

        Students aleksandr = new Students();

        aleksandr.name = "Aleksandr";
        aleksandr.lastName = "Ivanov";
        aleksandr.yearStudy = 1985;
        aleksandr.numberStudy = 123466;
        aleksandr.economy = 4.8;
        aleksandr.english = 3.7;
        aleksandr.math = 4.5;


        Students andrey = new Students();

        andrey.name = "Andrey";
        andrey.lastName = "Petrov";
        andrey.yearStudy = 1987;
        andrey.numberStudy = 123456;
        andrey.economy = 4.9;
        andrey.english = 5.0;
        andrey.math = 3.7;

        Students summ = new Students();
        summ.summ(aleksandr.math, aleksandr.economy, aleksandr.english);
    }

}
