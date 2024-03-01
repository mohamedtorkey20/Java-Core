class Counterword2 {
    public static void main(String args[]) {
       
        int counter= 0;
          if(args.length==2)
          {
        int firstindex = 0;
        

        while (firstindex != -1) {
            firstindex = args[0].indexOf(args[1], firstindex);
            if (firstindex != -1) {
                counter++;
                firstindex = firstindex + args[1].length() + 1; 
            }
        }
}
        System.out.println("number of words:" +counter);
    }
}
