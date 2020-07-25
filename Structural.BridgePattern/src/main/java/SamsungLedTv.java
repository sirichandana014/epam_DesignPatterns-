public class SamsungLedTv implements LEDTV
{
    public void switchOn()
    {
        System.out.println("Turning ON.. Samsung TV.");
    }

    public void switchOff()
    {
        System.out.println("Turning Off.. Samsung TV.");

    }

    public void setChannel( int channelNumber )
    {
        System.out.println("Setting channel Number " + channelNumber + ".. on Samsung TV");

    }

}