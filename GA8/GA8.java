//Group Activity 8
package GA8;

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {//override superclass 
    System.out.println("The pig oinks");
  }
}

class Dog extends Animal {
  public void animalSound() {//override superclass 
    System.out.println("The dog barks");
  }
}

class Cat extends Animal {
  public void animalSound() {//override superclass 
    System.out.println("The cat meows");
  }
}

class Birds extends Animal {
  public void animalSound() {//override superclass 
    System.out.println("The birds Chirp");
  }
}

class Lion extends Animal {
  public void animalSound() {//override superclass 
    System.out.println("The Lion roars");
  }
}


class Main {
  public static void main(String[] args) {

      
      
    Animal[] animals = new Animal[6]; // Creating a list to display all the sounds 
    
    //Adding the all the animal sounds 
    animals[0] = new Animal();  
    animals[1] = new Dog(); 
    animals[2] = new Pig();
    animals[3] = new Cat();
    animals[4] = new Birds();
    animals[5] = new Lion();
    
    //Display all the animal sounds 
    for (Animal a: animals){
      a.animalSound(); 
    }
  }
}