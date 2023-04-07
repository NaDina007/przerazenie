package dz003;
public class poker {
     public static void main(String[] args) {
            // 1 - инициализация пр
         int cardsPerPlayer = 5;
         int appropriatePlayers =0;

            String[] suits = {
                    "Пик", "Бубен", "Черв", "Треф"
            };

            String[] rank = {
                    "2", "3", "4", "5", "6", "7", "8", "9", "10",
                    "Валет", "Королева", "Король", "Туз"
            };

            int n = suits.length * rank.length; // количество карт

            // часть 2
         for(;;){
                int players = 4;

                if (players){
                    // (>-<)

                    appropriatePlayers = players;
                    if(cardsPerPlayer * appropriatePlayers <= n){
                        break;
                    } else {
                        if (appropriatePlayers ==0){

                            System.out.println("Игра прекращена.");
                            break;

                        } else if (appropriatePlayers<0){

                            System.out.println("Число игроков не может быть меньше 0");

                        } else{

                            System.out.println("Слишком много игроков!");
                        }
                    }

                } else{
                    System.out.println("Не число, или слишком большое!");

                }
            }

            // 3 - инициализация колоды
            String[] deck = new String[n];
            for (int i = 0; i < rank.length; i++) {
                for (int j = 0; j < suits.length; j++) {
                    deck[suits.length*i + j] = rank[i] + " " + suits[j];
                }
            }

            // 4 - перетасовка колоды
            for (int i = 0; i < n; i++) {
                int r = i + (int) (Math.random() * (n-i)); // случайная карта в колоде
                String temp = deck[r];
                deck[r] = deck[i];
                deck[i] = temp;
            }

            // 5 - вывод
            for (int i = 0; i < appropriatePlayers * cardsPerPlayer; i++) {
                System.out.println(deck[i]);
                if (i % cardsPerPlayer == cardsPerPlayer - 1)
                    System.out.println();
            }
         }
    }

