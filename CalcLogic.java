public class CalcLogic {

    //-- Instance variables.
    private int m_currentTotal;     // The current total is all we need to remember.
    private String by;
    
    private int total = 0;
    
    private String test;
    private int array1size = 0;
    private int array2size = 0;
    private String test2;


    /** Constructor */
    public CalcLogic() {
        m_currentTotal = 0;
    }

    public String getTotalString() {
        by = Integer.toBinaryString(m_currentTotal);
        return ""+ by ;
    }

    public void setTotal(String n) {
        test = n;
        m_currentTotal = convertToNumber(n);
    }

    public void add(String n) {

        m_currentTotal += convertToNumber(n);
    }

    public void subtract(String n) {
        m_currentTotal -= convertToNumber(n);
    }

    public void multiply(String n) {
        m_currentTotal *= convertToNumber(n);
    }

    public void divide(String n) {
        m_currentTotal /= convertToNumber(n);
    }

    public void AND(String n){
        String logical = "";
         int intArray1[];
     int intArray2[];
        //charArray1 = test.toCharArray();
      //  charArray2 = test2.toCharArray();
      //  array1size = charArray1.length;
       // array2size = charArray2.length;

        intArray1 = new int[test.length()];

for (int i = 0; i < test.length(); i++) {
    intArray1[i] = Character.digit(test.charAt(i), 10);
        }
        intArray2 = new int[n.length()];

for (int i = 0; i < n.length(); i++) {
    intArray2[i] = Character.digit(n.charAt(i), 10);
        }
            array1size = intArray1.length;
            array2size = intArray2.length;
   
        for (int i=0; i< array1size; i++)
        {
            if (intArray1[i] == 1)
            {

                if(intArray2[i] == 1)
                {
                    logical += "1";
                }
            
                else
                {
                 logical += "0";
              }
                }
            
            else
            {
                logical += "0";
                }
            }

            m_currentTotal = convertToNumber(logical);


                
            

        
        
        
        }

    public void convertStringToCharArray(String n){



    }



    private int convertToNumber(String n) {
        return Integer.parseInt(n, 2);
    }


}