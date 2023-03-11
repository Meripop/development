package rooms;

public class SuperiorRoom extends AbstractRoom {
    private int additionalRoomPrice = 3500;

    public SuperiorRoom(boolean isExtraBedNeeded) {
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
