public class Adapter {
    public static void main(String[] args) {
        URL url = new URL("https://pokeapi.co/api/v2/pokemon");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
    }
}