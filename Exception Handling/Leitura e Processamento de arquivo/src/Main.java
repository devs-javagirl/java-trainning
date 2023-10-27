public class Main {
    
    public static void main(String[] args){
        File file = new File("Color.txt");
        String pathAbs = file.getAbsolutePath();
        
        List<String> data = readFileReader(pathAbs);
        
        Collections.sort(data);
        data.forEach(System.out::println);
    }
    
    public static List<String> readFileReader(String pathAbs) {
        List<String> data = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathAbs))){
            String line;
            while(Objects.nonNull(line = bufferedReader.readLine())) {
                data.add(line);
            }
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado, verifique se ele existe!");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return data;
    }
}