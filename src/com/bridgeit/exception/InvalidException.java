package com.bridgeit.exception;

public class InvalidException extends Exception
{
	private static final long serialVersionUID = 4664456874499611218L;

    private String errorCode="Unknown_Exception";

  public InvalidException(String s,String errorCode) 
     {
		 super(s);
		 this.errorCode=errorCode;
    }
  public String getErrorCode()
  {
		return this.errorCode;
  }
    
    /**
     * @param s string,
     * 
     */
    public InvalidException(String s) 
    {
		 super(s);
		 
   }  
    
	}

