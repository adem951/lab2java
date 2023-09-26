 public class Myexception extends Exception
    {
        public Myexception()
        {
            this("the number is not between 1 and 10");
        }


        public Myexception(String error_text)
        {
            super(error_text);
        }
    }
