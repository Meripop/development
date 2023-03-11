package rooms;

public class StrandardRoom extends AbstractRoom {


    public StrandardRoom(boolean isExtraBedNeeded) {
        super(isExtraBedNeeded);
    }

    @Override
    public int calculateRoomPrice() {
        return getSeasonBasedPrice();
    }
}