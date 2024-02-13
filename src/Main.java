import javax.swing.plaf.BorderUIResource;

public class Main {
    public static void main(String[] args) {

        Phone firstPhone = new Phone();
        firstPhone.setModelName("iPhone");
        firstPhone.setNumber("1234567890");
        firstPhone.setWeight(100);

        Phone secondPhone = new Phone();
        secondPhone.setModelName("Samsung");
        secondPhone.setNumber("0987654321");
        secondPhone.setWeight(150);

        LandLinePhone firstLandLinePhone = new LandLinePhone();
        firstLandLinePhone.setModelName("Siemens");
        firstLandLinePhone.setNumber("1234554321");
        firstLandLinePhone.setWeight(1000);
        firstLandLinePhone.setCapable(Boolean.TRUE);

        LandLinePhone secondLandLinePhone = new LandLinePhone();
        secondLandLinePhone.setModelName("Loc");
        secondLandLinePhone.setNumber("2345665432");
        secondLandLinePhone.setWeight(1500);
        secondLandLinePhone.setCapable(Boolean.FALSE);

        MobilePhone firstMobilePhone = new MobilePhone();
        firstMobilePhone.setModelName("Nokia");
        firstMobilePhone.setNumber("3456776543");
        firstMobilePhone.setWeight(500);
        firstMobilePhone.setScreenSize(4);
        firstMobilePhone.setFoldAble(Boolean.FALSE);

        MobilePhone secondMobilePhone = new MobilePhone();
        secondMobilePhone.setModelName("Motorola");
        secondMobilePhone.setNumber("4567887654");
        secondMobilePhone.setWeight(600);
        secondMobilePhone.setScreenSize(5);
        secondMobilePhone.setFoldAble(Boolean.TRUE);

        System.out.println(firstPhone.toString());
        System.out.println(secondPhone.toString());

        System.out.println(firstLandLinePhone.toString());
        System.out.println(secondLandLinePhone.toString());

        System.out.println(firstMobilePhone.toString());
        System.out.println(secondMobilePhone.toString());

        firstPhone.receiveCall("Вася");
        secondPhone.receiveCall("Петя");

        firstLandLinePhone.receiveCall("Витя");
        secondLandLinePhone.receiveCall("Степа");

        firstMobilePhone.receiveCall("Женя");
        secondMobilePhone.receiveCall("Саша");

        firstMobilePhone.sendMessage("Привет!", 12345);
        firstMobilePhone.sendMessage("Пока!", 54321);

        aboutPhone(firstPhone);
        aboutPhone(secondPhone);

        aboutPhone(firstLandLinePhone);
        aboutPhone(secondLandLinePhone);

        aboutPhone(firstMobilePhone);
        aboutPhone(secondMobilePhone);

        System.out.println(firstPhone.toString());
        firstPhone.setNumber("45678");
        System.out.println(firstPhone.toString());

        System.out.println(firstLandLinePhone.toString());
        firstLandLinePhone.setModelName("Panasonic");
        System.out.println(firstLandLinePhone.toString());

        System.out.println(firstMobilePhone.toString());
        firstMobilePhone.setWeight(900);
        System.out.println(firstMobilePhone.toString());
    }

    public static void aboutPhone(RingAble currentDevice){
        currentDevice.ring();
    }
}