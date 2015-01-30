package foo.unitest.enums;

public enum Currency {
	  PENNY(1),    NICKLE(5),    DIME(10),    QUARTER(25);
	    private int valu;
	   
	    private Currency(int cur){
	        this.valu=cur;
	    }//end constructor
	   
	   
	    public int getValue(Currency curncy){
	        return curncy.valu;
	    }//end getValue
}//end class
