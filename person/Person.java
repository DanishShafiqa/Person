
package person;


class Person {
//    public String name;
//   
//    public void setName(String name){
//        this.name=name;
//    }
//    
//    public String getName(){
//        return this.name;
//    }
//    
//
//    public static void main(String[] args){
//               Person mPerson = new Person();
//               mPerson.setName("Danish");
//               
//               System.out.println("Person Name: "+ mPerson.getName());
//} 
    private String username;
    private String password;
    
    public Person() {
        System.out.println(""); 
    }
    
//    public void setName(String name) {
//        
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public static void main(String[] args) {
        Person Danish = new Person();
        
        Danish.setUsername("chioch4");
        Danish.setPassword("avatar");
        
        System.out.println("Username: "+ Danish.getUsername());
        System.out.println("Password: "+ Danish.getPassword());
    }
}
    




