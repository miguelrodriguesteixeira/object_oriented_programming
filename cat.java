public static void cat(File file){//throws FileNotFound, IOException {
    RandomAccessFile input = null;
    String line = null;

    try { //RandomAcessFile input = new RandomAcessFile(file,"r")
        input = new RandomAccessFile(file, "r");
        while ((line = input.readLine()) != null) {
            System.out.println(line);
        }
        return;
    }
    catch(FileNotFound ex){
        System.out.println(ex.getMessage());}
    
    catch(IOException ex){
        System.out.println(ex.getMessage());}

    finally {
        try {
        if (input != null) {
            input.close();
        }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());}
    }
}
