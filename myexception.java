 public class myexception extends Exception
    {
        public myexception()
        {
            this("the number is not between 1 and 10");
        }


        public myexception(String error_text)
        {
            super(error_text);
        }
    }
