public class Cli {
    public static void main(String[] args) {
        Runtime comando = Runtime.getRuntime();
        String build = "docker build . -t " + args[0] + ":latest";
        //String dockerun = "docker run --rm -d -p 8080:8080/tcp " + args[0] + ":latest";
        Strig compose = "docker-compose up";
        try {

            Process buildar = comando.exec(build);
            buildar.waitFor();
            System.out.println(build);
            Process rodar = comando.exec(compose);
            rodar.waitFor();
            System.out.println(compose);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
