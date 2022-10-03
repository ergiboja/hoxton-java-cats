public class Cat {
    public String name;
    public int age;
    public boolean likesCuddles;

    public Cat(String name, int age, boolean likesCuddles) {
        this.name = name;
        this.age = age;
        this.likesCuddles = likesCuddles;
    }

       void displayInfo(){
        if (likesCuddles){

            System.out.printf("This is %s, and it is  %s years old and It loves to  cuddle!\n", name, age); 

        } else {



            System.out.printf("THis is  %sand it is %s years old and I does't like to  cuddle!\n", name, age); 
        }
    }
}