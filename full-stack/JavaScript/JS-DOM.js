Get Property: étéket ad vissza
bicycle.colour;  //white

Set Property: értéket vár
bicycle.colorOfB="white";

Method: objetumon belüli funkció
bicycle.bike();
button.click();


I. HTML elemek kiválasztása .js fájlban:

//elem hívása tag név alapján (itt a li elem darabját kéri le):
document.getElementsByTagName("li").length;

//elem hívása kalssz név alapján:
document.getElementsByClassName("btnClass")....;

//elem hívása id név alapján (mainTitle szövegét változtatja Bye-ra):
document.getElementsById("mainTitle").innerHTML="Bye";

//itt hivásnál a klassz név elé .-ot, id elé # jelet kell tenni:
document.querySelector(".btnClass");
document.querySelector("#mainTitle");

//ha mainClass nevű klasszon belül szeretném az első h1-es elemet kiválasztani, akkor így kell hívni:
 document.querySelector("#mainClass h1");

// ha két ismertető alapján szeretnénk hívni (div tag legyen és titleClass nevű klassza):
document.querySelector("div.titleClass");

//ha mainClass nevű klasszon belül szeretném az összes h1-es elemet kiválasztani, akkor így kell hívni (listát ad vissza):
document.querySelectorAll("#mainClass h1");
// indexel pontosan meghatározhatjuk, hogz az összesből hánzadik elemre vagzunk kiváncsiak:
document.querySelectorAll("#mainClass h1")[2];


II. Kiválasztott elemek manipulálása

	1. Stílus manipulálása:
		álltalában az elnevezés ugyanaz mint CSS-ben de itt egybe írják és nagybetükkel a szavak első betüjét:
	  backgroundColor, fontSize, listStyleType
   	a megadott értéket color,fontSize,visibility... Stringként kell megadni: "hidden","blue"
//megváltoztattja a gomb színét pirosra:
document.querySelector("button").styles.backgroundColor="red";

//megadja a button klasszainak lisáját:
document.querySelector("button").classList;

//hozzá ad a gomb klasszaihoz egy invisible klasszt (aminek az értékét a css fájlban meghatároztuk):
document.querySelector("button").classList.add("invisible");

//elveszi a gomb klasszaiból az invisible klasszt (aminek az értékét a css fájlban meghatároztuk):
document.querySelector("button").classList.remove("invisible");


//ha ott van akkor elveszi a gomb klasszaiból az invisible klasszt, ha nincs ott akkor hozzá adja (aminek az értékét a css fájlban meghatároztuk):
document.querySelector("button").classList.toggle("invisible");

	2.szöveg manipulálása:
//szöveg megváltoztatasa:
document.getElementsById("mainTitle").innerHTML="Bye";
//ha döltbetükkel akarom írni  és megváltoztatni a szövegét akkor:
document.getElementsById("mainTitle").innerHTML="<em>Bye</em>";

	3.tulajdonságok manipulálása:
//megadja az összes tulajdonságát az elemnek:
document.querySelector("button").attributes;
//kiveszi az elem adott tulajdonságát:
document.querySelector("a").getAttribute("href");
//megváltoztatja az adott tulajdonságot (itt átírja a href link szöveget):
document.querySelector("a").setAttribute("href","https://www.google.com");
