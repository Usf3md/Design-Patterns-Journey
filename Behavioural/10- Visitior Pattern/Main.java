public class Main {
    public static void main(String[] args) {
        WavFile file = new WavFile();
        file.read("123");
        file.applyFilter(new AddReverbFilter());
        file.applyFilter(new NormalizeFilter());
        file.applyFilter(new ReduceNoiseFIlter());
    }
}