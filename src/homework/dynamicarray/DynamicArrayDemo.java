package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(5);
        da.add(10);
        da.add(15);
        da.add(20);
        da.add(25);
        da.print();
        System.out.println();
        for (int i = 1; i <= 12; i++) {
            da.add(i * 2);
        }
        da.print();
        System.out.print(da.getByIndex(0)+" ");
        System.out.print(da.getByIndex(1)+" ");
        System.out.print(da.getByIndex(2)+" ");
        System.out.print(da.getByIndex(3)+" ");
        System.out.print(da.getByIndex(4)+" ");
        System.out.print(da.getByIndex(5)+" ");
        System.out.print(da.getByIndex(-1));
    }
}
