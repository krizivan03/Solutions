/*
This method takes numbers of pages in a Book and the Specific page you'll turn to.
What it'll return in an Integer value is the least amount of pages that itll take to get to the 
specific page.
*/

static int pageCount(int numPages, int page) {
        String side= (page/(float)numPages)<=.50? "LEFT":"RIGHT" ;
        int starting,extra;
        
        switch(side){
            case "LEFT":
                starting=1;
                extra = page%2==0? 1:0;
                return (page-starting)/2+extra;//distance from starting to page in pages
                
            case "RIGHT":
                starting=numPages;
                
                return (numPages-page)/2;//distance from last page to page in pages
                
            
            default: return 0;
                
        }
            
    }
