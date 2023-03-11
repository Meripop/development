package rooms;

public class KingRoom extends AbstractRoom {
    private int additionalRoomPrice = 11000;

    public KingRoom(boolean isExtraBedNeeded) {
        super(isExtraBedNeeded);
    }


    @Override
    public int calculateRoomPrice() {
        if (isExtraBedNeeded) {
            return getSeasonBasedPrice() + getExtraBedPrice() + additionalRoomPrice;
        } else
            return getSeasonBasedPrice() + additionalRoomPrice;
    }
}
