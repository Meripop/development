//létre hozok egy string változót ami a szövegét html-ből kapja a "nom" nevű klasszokból
// ha az inPString szövege "blue" akkor játsza le a bl-1 soundot és lépjen ki,
// ha "red a szöveg értéke akkor játsza le a rd-1 mp3-at", stb...
// ha egyik sem érvényeül akkor a default érték utáni kód fusson le.

var inPString = document.querySelectorAll(".nom").innerHTML;
switch (inPString) {
  case "blue":
    var bl = new Audio('sounds/bl-1.mp3');
    bl.play();
    break;
  case "red":
    var rd = new Audio('sounds/rd-1.mp3');
    rd.play();
    break;
  case "yellow":
    var yellow = new Audio('sounds/yw-1.mp3');
    yellow.play();
    break;
  default:
    console.log(inPString);
}
