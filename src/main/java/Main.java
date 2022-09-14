public class Main {
    public static void main(String[] args){
        Doctor doctor = new Doctor();
        Animals[] animals= new Animals[3];
        animals[0]= new  Cat("Shella","Kity", "Pokrov", "Siamese");

        animals[1]=new Horse("Sendy","Derevnya","Morkov","White");

        animals[2]=new Dog("Tobby","proizvostvo","myaso","shpic");
        for (Animals animals1 : animals){
            doctor.treatAnimal(animals1);
        }
    }
}
