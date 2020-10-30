
package vidu6;
public class IntPhoneNumber extends PhoneNumber{
    private String countryCode;
    public IntPhoneNumber(){
         super();
    }
    public IntPhoneNumber(String countryCode, int area, String number) {
        super(area, number);
        this.countryCode = countryCode;
    }
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    @Override
    public void display(){
        System.out.println(countryCode+" = "+super.getArea()+
                " - "+super.getNumber());
    }
    
    
}
