package Clients;
public class Clients {
    private String name;
    private String email;
    private int id ;
    
   
    public Clients(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
      
    }
    public Clients() {       
        
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
   
}
