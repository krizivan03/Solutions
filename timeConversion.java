static String timeConversion(String s) {
       //Converts a String representing normal AM/PM time and converts to military time.
    
        if(s.contains("AM")){
           if(s.contains("12")){
            return String.valueOf(Integer.valueOf(s.substring(0,2))-12)+"0"+s.substring(2,s.length()-2);
           }
           return s.substring(0, s.length()-2);
       }
       else {
           if(s.contains("12")){
            return String.valueOf(Integer.valueOf(s.substring(0,2)))+s.substring(2,s.length()-2);
           }
           return String.valueOf(Integer.valueOf(s.substring(0,2))+12)+s.substring(2,s.length()-2);
       }
      
    }
