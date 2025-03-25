package Theory_Assignment_2;

class HotDogStand {
    private int standId;
    private int hotDogsSold;

    public HotDogStand(int standId, int hotDogsSold) {
        this.standId = standId;
        this.hotDogsSold = hotDogsSold;
    }

    public int getStandId() {
        return standId;
    }

    public void setStandId(int standId) {
        this.standId = standId;
    }

    public int getHotDogsSold() {
        return hotDogsSold;
    }

    public void setHotDogsSold(int hotDogsSold) {
        this.hotDogsSold = hotDogsSold;
    }

    public void justSold() {
        hotDogsSold++;
    }


    public void displaySales() {
        System.out.println("Hot Dog Stand ID: " + standId + " | Hot Dogs Sold: " + hotDogsSold);
    }
}
