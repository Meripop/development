package rooms;

import java.time.LocalDate;

public abstract class AbstractRoom {
    protected boolean isExtraBedNeeded;
    protected int extraBedPrice = 3000;
    private int seasonBasedPrice;

    public AbstractRoom(boolean isExtraBedNeeded) {
        this.isExtraBedNeeded = isExtraBedNeeded;
        setSeasonBasedPrice(getSeasonBasedDefaultPrice());
        //beállítja a seasonBasedPrice privát osztályváltozót az aktualis honap arara

    }

    public int getSeasonBasedDefaultPrice() {
        LocalDate monthToday = LocalDate.from(LocalDate.now());
        int calculateMonth = monthToday.getMonthValue();
        switch (calculateMonth) {
            case 1, 2, 12, 3, 4, 5 -> seasonBasedPrice = 11000;
            case 6, 7, 8 -> seasonBasedPrice = 21000;
            case 9, 10, 11 -> seasonBasedPrice = 15000;
        }

        //aktualis honap alapara: seasonBasedPrice=
        return seasonBasedPrice;
    }

    public boolean isExtraBedNeeded() {
        return isExtraBedNeeded;
    }

    public int getExtraBedPrice() {
        return extraBedPrice;
    }

    public int getSeasonBasedPrice() {
        return seasonBasedPrice;
    }

    public void setSeasonBasedPrice(int seasonBasedPrice) {
        this.seasonBasedPrice = seasonBasedPrice;
    }


    public abstract int calculateRoomPrice();
}
