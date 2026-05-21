package patterns.behaviour.template;

abstract class Beverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }


    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    //customized by subclasses
    abstract void brew();
    abstract void addCondiments();


}
