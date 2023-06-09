
package dental;


public class User {
    
    int id;
    String name;
    String email;
    String password;
    String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public User() {
        
    }
    
    public User(int id, String name, String email, String password, String type) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.type = type;
    }
    
    public void displayUserConsole(int id, String name, String email, String password, String type) {
            System.out.println(this.id + " " + this.name + " " + this.email + " " + this.password + " " + this.type);
    }
        
}
