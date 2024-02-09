public class DatabaseConnection{
    private static DatabaseConnection _db;
    
    private DatabaseConnection(){
    }

    public static DatabaseConnection getConnection(){
        if (_db == null){
            _db = new DatabaseConnection();
        }
        return _db;
    }
}
/* Singleton */