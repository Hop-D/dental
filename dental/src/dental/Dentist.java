
package dental;


public class Dentist extends User {
    
    public Dentist() {
        
    }
    
    public Dentist(int id, String name, String email, String password, String type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.type = type;
    } 
}
