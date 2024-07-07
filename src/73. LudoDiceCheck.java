class LudoDiceCheck {
    public static void main(String[] args) {
        System.out.println("Welcome to Dice Check for Ludo\n");
        double value=(int)(10*Math.random());
            if(value<=6){
                System.out.print("Hey! System throw the dice...\n......" +
                        "and the you have got: "+value);
            }else{
                System.out.println("Try again...Dice out of Bounds");
            }
    }
}
