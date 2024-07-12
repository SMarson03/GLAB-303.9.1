public class EncapsulationExample {
    public static void main(String[] args) {
        HumanBeing h1 = new HumanBeing();

        h1.setHeight(5.07f);
        h1.setWeight(170);
        h1.setBmi(calculateBmi(h1));

        System.out.println("Person has " +h1.getWeight()+" lbs and is "+h1.getHeight()+" feet in height, which results in BMI of "+h1.getBmi());
    }

    public static float calculateBmi(HumanBeing h1) {
        return h1.getWeight()/(h1.getHeight()*h1.getHeight());
    }
}
