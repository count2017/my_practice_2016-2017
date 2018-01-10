package Test1201;

class Insect {
    private int i = printInt("Inset.i init\n");
    protected int j ;
    {
    	System.out.println("¸¸Àà·Ç¾²Ì¬´úÂë¿é");
    }
    static{
    	System.out.println("¸¸Àà¾²Ì¬´úÂë¿é");
    }
    public Insect() {
        System.out.print("i=" + i + ",j = " + j +"\n");
        j=39;
    }
    
    private static int x1 = printInt("Inset.x1 init\n"); 
            
    static int printInt(String s) {
        System.out.print(s);
        return 47;
    }        
   
}

