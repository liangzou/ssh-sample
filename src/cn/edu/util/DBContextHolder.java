package cn.edu.util;

public class DBContextHolder {
	
	public static final String DATA_SOURCE1 = "1";  
    public static final String DATA_SOURCE2 = "2";  
      
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();  
      
    public static void setDBType(String dbType) {  
        contextHolder.set(dbType);  
    }  
      
    public static String getDBType() {  
        return contextHolder.get();  
    }  
      
    public static void clearDBType() {  
        contextHolder.remove();  
    } 
    public static void set1(){
    	setDBType(DATA_SOURCE1);
    	System.out.println("selecting mysql database");
    }
    
    public static void set2(){
    	setDBType(DATA_SOURCE2);
    	System.out.println("selecting oracle database");
    }

}
