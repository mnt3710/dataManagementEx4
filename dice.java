public class dice{
  public static void main(String[] args){

System.out.println("Rolling the dice...");
      int firstDice = 0;
      int secondDice = 0;
      int totalValue = 0;
for(int i = 1;i <= 2; i++){
    int randomValue = new java.util.Random().nextInt(7);
    int diceValue = randomValue;
  System.out.println("Die " + i + ":" + diceValue);
  totalValue += diceValue;
}

System.out.println("Total value: " + totalValue);
if(totalValue>7){
  System.out.println("You won");
}else{
  System.out.println("You lost");
}
  }
}