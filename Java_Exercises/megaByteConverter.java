package Java_Exercises;

public class megaByteConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kilobyte){
        int MB= kilobyte/1024;
        int KB= kilobyte%1024;
        System.out.println(kilobyte + " KB = "+ MB + " MB and "+ KB + " KB");
    }
}
