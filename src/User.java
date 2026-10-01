
public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username.toLowerCase();

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
            if (password.length() >= 8) {
                this.password = password;
            } else {
                System.out.println("Password must be at least 8 characters.");
            }
        }
        }




