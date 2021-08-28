public class rectangle {

    double width, height;

        public double area(){
            return width * height;
    
        }
        public double perimiter (){
            return 2 * (width + height);
             
        }
        public double diagonal () {
            return Math.sqrt(width * width + height *width);

        }
}
