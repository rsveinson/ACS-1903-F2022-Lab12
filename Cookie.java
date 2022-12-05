/** 
 * ACS-1903 Lab 12 Q7
 * @key
*/
public class Cookie{
    // fields
    private String flavour;
    
    // the associatino field is a Jar object
    private Jar jar;
    
    // constructors
    public Cookie(){
        flavour = "unkown";
    }
    
    public Cookie(String f){
        flavour = f;
    }
    
    // getters and setters
    public String getFlavour(){
        return flavour;
    }
    
    public Jar getJar(){
        return this.jar;
    }
    
    public void setFlavour(String f){
        flavour = f;
    }
    
    public void setJar(Jar j){
        this.jar = j;
    }
    
    // other methods
    public String toString(){
      return flavour; 
    }
    
    
}
