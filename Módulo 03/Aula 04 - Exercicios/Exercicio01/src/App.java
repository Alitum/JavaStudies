public class App {
    public static void main(String[] args) throws Exception {
        Artist artist = new Artist();
        Square square = new Square("red");
        Circle circle = new Circle("green");

        artist.CreateDrawing(square);
        artist.CreateDrawing(circle);

    }
}
