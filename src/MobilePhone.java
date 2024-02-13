public class MobilePhone extends Phone{

    private Integer screenSize;

    private Boolean isFoldAble;

    public void sendMessage(String message, int number){
        System.out.println("Сообщение \"" + message + "\" отправлено на номер " + number);
    }

    public Integer getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
    }

    public Boolean getFoldAble() {
        return isFoldAble;
    }

    public void setFoldAble(Boolean foldAble) {
        isFoldAble = foldAble;
    }

    @Override
    public void ring(){
        System.out.println("Играет твоя любимая мелодия мобильника");
    }
}
