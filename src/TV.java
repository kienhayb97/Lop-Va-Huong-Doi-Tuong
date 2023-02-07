public class TV {
    int channel = 1;
    int volumeLeve1 = 1;
    boolean on = false;

    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void setChannel(int newChannel1){
        if (on && newChannel1 >= 1 &&newChannel1 <= 120){
            channel = newChannel1;
        }
    }
    public void setVolume(int newVolumeLever1){
        if (on && newVolumeLever1 >=1 && newVolumeLever1 <= 7){
            volumeLeve1 = newVolumeLever1;
        }
    }
    public void channelUp(){
        if (on && channel < 120){
            channel++;
        }
    }
    public void channelDown(){
        if (on && channel > 1){
            channel--;
        }
    }
    public void VolumeUp(){
        if (on && volumeLeve1 <7){
            volumeLeve1++;
        }
    }
    public void volumeDown(){
        if (on && volumeLeve1>1){
            volumeLeve1--;
        }
    }
}
