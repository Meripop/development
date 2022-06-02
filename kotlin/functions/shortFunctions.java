Kattintásra(id=btnLogin) az imageView id-jú helyre a "piggybank" nevű kép rajzolódik ki:
binding.btnLogin.setOnClickListener{
    binding.imageView.setImageResource(R.drawable.piggybank)
	}


Felugró Toast szöveg:
Toast.makeText(this@MainActivity,"Welcome",Toast.LENGTH_LONG).show()


Kettő tizedesjegyű számmá kerekítés felfelé:
var eur=453/382
var eurRounded= eur.toBigDecimal().setScale(2, RoundingMode.UP).toDouble()

Levágja kettőtizedesjegyre a számot:
var eurRounded2=String.format("%.2f",345.647575)

Üres mező esetén(id=etMoney) kiírja az üzenetet amit megadok.
Ha nem üres akkor lefut a kód amit megadok:
if (binding.etMoney.text.isNotEmpty()){
    //some code 
}else{
    binding.etMoney.error="This field can not be empty"
}


Képre kattintásnál lassan eltűnik a kép:
binding.imageView.setOnClickListener{
    binding.imageView.animate().alpha(0F).setDuration(2000)
}

Képre kattintásnál atvált egyik képről a másikra:(a masodik képnél az alpha=0)
var isShowingPiggy=true
binding.ivPiggy.setOnClickListener {
    if (isShowingPiggy) {
        isShowingPiggy=false
        binding.ivPiggy.animate().alpha(0F).setDuration(2000)
        binding.ivVan.animate().alpha(1F).setDuration(2000)
    } else {
        isShowingPiggy=true
        binding.ivPiggy.animate().alpha(1F).setDuration(2000)
        binding.ivVan.animate().alpha(0F).setDuration(2000)
    }

}

Elcsúszik a kép balra:
binding.ivPiggy.animate().translationXBy(-1150F).setDuration(2000)

Elfordul 180 fokot a kep:
binding.ivPiggy.animate().rotation(180F).setDuration(1000)

Forog s eltűnik:
binding.ivPiggy.animate().rotation(1800F).alpha(0F).setDuration(1000)

Lekicsinyíti a képet fele akkorára:
binding.ivPiggy.animate().scaleX(0.5F).scaleY(0.5F).setDuration(1000)

Balról pörög be a képernyőre:
a kép bal margoja -1150px,
binding.ivPiggy.setX(-1150F)
binding.ivPiggy.animate().translationXBy(1150F).rotation(3600F).setDuration(2000)



Video hozzáadása és video kontroller hozzáadása
val video=binding.video
video.setVideoPath("android.resource://"+packageName+"/"+R.raw.blue)
var mediaC=MediaController(this)
mediaC.setAnchorView(video)
video.setMediaController(mediaC)
video.start()

Media hozzáadása és gombal elindítása, megaáállítása(raw a könyvtár neve és music1 a lejátszandó media neve)
val media=MediaPlayer.create(this,R.raw.music1)
binding.btnPlay.setOnClickListener{
    media.start()
}
binding.btnPause.setOnClickListener{
    media.pause()
}

Plussz sor
