/* Macy Matthews
 * mlm2363
 * Class that calculates zipcodes and barcodes
 */

public class Zipcode {
    
    //instance variables 
    private final String[] barArray = {"||:::", ":::||", "::|:|", "::||:", ":|::|",
                                       ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
        private int zip;
        private String bar;
        private int check;
    
        //constructor
        public Zipcode(int zip){
           this.zip = zip;
           calcBarcode(zip);
        }
    
        //constructor
        public Zipcode(String bar){
            this.bar = bar;
            calcZipcode(bar);
        }
    
        //calculates check digit
        public int checkDigit(int zip){
            int remaining = zip;
            int sum = 0;
            int check;
        
        while (remaining > 0){  
            sum += remaining % 10;
            remaining /= 10;   
        }
            if(sum % 10 == 0){
                check = 0;
            }else{
                check = 10 - (sum % 10);
            }   
        
        return check;
    }

    //turns zip code into barcode
    public void calcBarcode(int zip){
        String zipcode = String.valueOf(zip);
    
            if(zipcode.length() > 5 || zipcode.length() < 5){
                System.out.println("Please input a valid Zipcode");
            }
        
            zipcode += String.valueOf(checkDigit(zip)); 
            char digit;
            String result = "";
    
            for(int i = 0; i < zipcode.length(); i++){
                digit = zipcode.charAt(i);
            
               if(digit == '0'){
                    result += barArray[0];
                }
                else if(digit == '1'){
                    result += barArray[1];
                }
                else if(digit == '2'){
                    result += barArray[2];
                }
                else if(digit == '3'){
                    result += barArray[3];
                }
                else if(digit == '4'){
                    result += barArray[4];
                }
                else if(digit == '5'){
                    result += barArray[5];
                }
                else if(digit == '6'){
                    result += barArray[6];
                }
                else if(digit == '7'){
                    result += barArray[7];
                }
                else if(digit == '8'){
                    result += barArray[8];
                }
                else if(digit == '9'){
                    result += barArray[9];
                }
            
            }
        
            String finalBar = "|";
            finalBar += result += "|";
            bar = finalBar;
    }

    //turns barcode into zip code
    public void calcZipcode(String bar){
        
        String bar1 = bar.substring(1,6); 
        String bar2 = bar.substring(6,11);
        String bar3 = bar.substring(11,16);
        String bar4 = bar.substring(16,21);
        String bar5 = bar.substring(21,26);
        String bar6 = bar.substring(26);
        String barcode;
        String result2 = "";
        String[] barArray2 = {bar1, bar2, bar3, bar4, bar5, bar6};
        
        for(int i = 0; i < barArray2.length; i++){ 
            barcode = barArray2[i];
            
            if(barcode.equals(barArray[0])){
                System.out.println("here0");
                result2 += "0";
            }
            else if(barcode.equals(barArray[1])){
                result2 += "1";
            }
            else if(barcode.equals(barArray[2])){
                result2 += "2";
            }
            else if(barcode.equals(barArray[3])){
                result2 += "3";
            }
            else if(barcode.equals(barArray[4])){
                result2 += "4";
            }
            else if(barcode.equals(barArray[5])){
                result2 += "5";
            }
            else if(barcode.equals(barArray[6])){
                result2 += "6";
            }
            else if(barcode.equals(barArray[7])){
                result2 += "7";
            }
            else if(barcode.equals(barArray[8])){
                result2 += "8";
            }
             else if(barcode.equals(barArray[9])){
                result2 += "9";
            }
          
        }
        
        int code = Integer.parseInt(result2);
        
        /*if(checkDigit(code) != code % 10){
            System.out.println("Please enter a barcode with the correct check digit");
        }*/
        
        zip = code;
        
        }

        public int getZIPcode(){
        return zip; 
        }
    
        public String getBarcode(){  
        return bar;
        }
    
}




        
        
        
        
        
    
      
        
    











