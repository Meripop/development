
=== Egyenlő
!== Nem egyenlő
> nagyobb mint valami
< kisebb  mint valami
>= nagyobb egyenlő mint valami
<= kisebb egyenlő mint valami

&& és
|| vagy
! ellenkezoje valaminek


Két egyenlőségjel használata esetén a JavaScript a számot automatikusan stringgé (automatikus típusátalakítás) alakítja az összehasonlítás előtt, ezért lesz az első sor igaz.
26 == "26";
//eredmény: true

Három egyenlőségjelnél nem végez automatikus típusátalakítást, ezért nem egyenlő a két érték. Ilyenkor a típusnak is meg kellene egyeznie.
26 === "26" ;
//eredmény: false

26 === 26;
//eredmény: true

IF: ha az if zárójelébe írt érték igaz akkor fusson le az if után kapcsoszárójelbe írt kód, ha nem igaz akkor megy a következő ágra(else if) átmeny az else ágra és megnézi igaz-e, ha nem akkor tovább megy a következőre (else) és annak kódja fut le

if(){
//csinald ezt
}
else if{
//csinald ezt
}
else{
//csinald ezt
}



Eloszor ES muvelet utana VAGY muveletet vegzi el
