package inheritanceTask7;
/*
Készítsétek el az alábbi, együtt elkészített diagramon láthatszó osztályhierarchiát.
A metódusokat is tartalmazzák az osztályok, de elég akár egy System.out.println()
utasítást megvalósítaniuk, amely kiírja a konzolra hogy éppen mi az adott tevékenység.
Pl.: dudálás() metódus kiírja, hogy “A versenyautó dudál”.

 */
public class Main {

    public static void main(String[] args) {

        Racecar merci=new Racecar("Alfa Romeo", "GT", "fekete", 1, false,true,true);
        AmbulanceCar ford=new AmbulanceCar("Ford","Ford transit","white",4,false,true);

        merci.race();
        ford.hooter();
    }

}