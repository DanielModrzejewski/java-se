package ObjectProgramming.exercise.figure;

public class testClass {
    public static void main(String[] args) {
        /*        Diamond diamond = new Diamond(3,4);
        Diamond diamond2 = new Diamond (20, 15.5);

        Diamond[] diamonds = new Diamond[10];

        for (int i=0; i<diamonds.length ; i++){
            diamonds[i] = new Diamond(i,i);
            System.out.println("Pole rombu z tablicy o indeksie " + i +": " +diamonds[i].countArea());
        }

        System.out.println("Pole rombu: " + diamond.countArea());
        System.out.println("Pole rombu 2: " + diamond2.countArea());*/
        Rectangle rectangle = new Rectangle(2,5);
        System.out.println("pole prostokata = " + rectangle.countArea());
        System.out.println("obwod prostokata = "+ rectangle.countPeriphery());

        System.out.println(Rectangle.CountArea(10,20));
    }
}
