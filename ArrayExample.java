public class ArrayExample {
    public static void main(String[] args) {
        String[] truck= {"Engine","Wheel","Brake","Mirror","Seat"};

        System.out.println("truck is carrying these parts");

        for(int i =0;i<truck.length;i++){
            System.out.println("Part"+(i+1)+":"+truck[i]);
        }
    }
    
}
