public class Phone implements RingAble {

    private String number;
    private String modelName;
    private Integer weight;

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    @Override
    public String toString(){
        return "Номер телефона: " + number + ". Модель телефона: " + modelName + ". Вес телефона: " + weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public void ring() {
        System.out.println("Звенит телефон");
    }
}
