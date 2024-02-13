public class LandLinePhone extends Phone{

    private Boolean isCallable;

    @Override
    public String toString(){
        return "Номер телефона: " + getNumber() + ". Модель телефона: " + getModelName() + ". Вес телефона: " + getWeight() + ". Можно звонить?: " + isCallable;
    }

    public Boolean getCallable() {
        return isCallable;
    }

    public void setCapable(Boolean callable) {
        isCallable = callable;
    }

    @Override
    public void ring(){
        System.out.println("Трезвонит стационарный телефон");
    }
}
