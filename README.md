# bingo-game-publisher-subscriber

It's a publisher/subscriber multi-thread Bingo simulation game with 5 players.

`Mary`, `John`, `Mark`, `Ana` and `Paul` try their luck in a Bingo. Who is going to win?

Each player has one card with 8 numbers (randomly selected from 1 to 50).

Who first fills all the numbers, announced by the `Caller`, wins!

Sample output:
```console
Available numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]
## Caller: the number is.. 18
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=false, 32=false, 34=false, 35=false, 49=false}
John: :) YES!
John: {1=false, 7=false, 8=false, 10=false, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=false, 5=false, 11=false, 19=false, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=false}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=false, 36=false, 39=false, 41=false, 46=false, 48=false}
Available numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]
## Caller: the number is.. 40
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=false, 32=false, 34=false, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=false, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=false, 5=false, 11=false, 19=false, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=false}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=false, 36=false, 39=false, 41=false, 46=false, 48=false}
Available numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 38, 39, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]
## Caller: the number is.. 31
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=false, 32=false, 34=false, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=false, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=false, 5=false, 11=false, 19=false, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=false}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=false, 36=false, 39=false, 41=false, 46=false, 48=false}
Available numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 38, 39, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]
## Caller: the number is.. 13
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=false, 32=false, 34=false, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=false, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=false, 5=false, 11=false, 19=false, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=false}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=false, 36=false, 39=false, 41=false, 46=false, 48=false}
Available numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 19, 20, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 38, 39, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]
## Caller: the number is.. 21
Mary: :) YES!
Mary: {2=false, 8=false, 9=false, 21=true, 32=false, 34=false, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=false, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=false, 5=false, 11=false, 19=false, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=false}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=false, 36=false, 39=false, 41=false, 46=false, 48=false}
Available numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 14, 15, 16, 17, 19, 20, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 38, 39, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]
## Caller: the number is.. 10
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=true, 32=false, 34=false, 35=false, 49=false}
John: :) YES!
John: {1=false, 7=false, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=false, 5=false, 11=false, 19=false, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=false}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=false, 36=false, 39=false, 41=false, 46=false, 48=false}
Available numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 14, 15, 16, 17, 19, 20, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 38, 39, 41, 42, 43, 44, 45, 46, 47, 49, 50]
## Caller: the number is.. 48
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=true, 32=false, 34=false, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=false, 5=false, 11=false, 19=false, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=false}
Paul: :) YES!
Paul: {3=false, 22=false, 34=false, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 16, 17, 19, 20, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 38, 39, 41, 42, 43, 44, 45, 46, 47, 49, 50]
## Caller: the number is.. 14
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=true, 32=false, 34=false, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=false, 5=false, 11=false, 19=false, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=false}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=false, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 16, 17, 19, 20, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 38, 39, 41, 42, 43, 44, 45, 46, 47, 49]
## Caller: the number is.. 50
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=true, 32=false, 34=false, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=false, 5=false, 11=false, 19=false, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=false}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=false, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 16, 17, 19, 20, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 38, 39, 41, 42, 43, 44, 45, 46, 49]
## Caller: the number is.. 47
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=true, 32=false, 34=false, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=false, 5=false, 11=false, 19=false, 24=false, 41=false, 42=false, 45=false}
Ana: :) YES!
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=false, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 16, 17, 19, 20, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 35, 36, 37, 38, 39, 41, 42, 43, 44, 45, 46, 49]
## Caller: the number is.. 34
Mary: :) YES!
Mary: {2=false, 8=false, 9=false, 21=true, 32=false, 34=true, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=false, 5=false, 11=false, 19=false, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :) YES!
Paul: {3=false, 22=false, 34=true, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 16, 17, 19, 20, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 35, 36, 37, 38, 39, 41, 42, 43, 44, 45, 46, 49]
## Caller: the number is.. 15
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=true, 32=false, 34=true, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=false, 5=false, 11=false, 19=false, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 16, 17, 19, 20, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 35, 36, 37, 39, 41, 42, 43, 44, 45, 46, 49]
## Caller: the number is.. 38
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=true, 32=false, 34=true, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=false, 5=false, 11=false, 19=false, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 16, 17, 19, 20, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 35, 36, 37, 39, 41, 42, 43, 44, 45, 46, 49]
## Caller: the number is.. 5
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=true, 32=false, 34=true, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :) YES!
Mark: {4=false, 5=true, 11=false, 19=false, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 16, 17, 19, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 35, 36, 37, 39, 41, 42, 43, 44, 45, 46, 49]
## Caller: the number is.. 20
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=true, 32=false, 34=true, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=false, 5=true, 11=false, 19=false, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 16, 17, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 35, 36, 37, 39, 41, 42, 43, 44, 45, 46, 49]
## Caller: the number is.. 19
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=true, 32=false, 34=true, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :) YES!
Mark: {4=false, 5=true, 11=false, 19=true, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 16, 17, 22, 23, 24, 25, 26, 27, 28, 29, 30, 33, 35, 36, 37, 39, 41, 42, 43, 44, 45, 46, 49]
## Caller: the number is.. 32
Mary: :) YES!
Mary: {2=false, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=false, 5=true, 11=false, 19=true, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 2, 3, 6, 7, 8, 9, 11, 12, 16, 17, 22, 23, 24, 25, 26, 27, 28, 29, 30, 33, 35, 36, 37, 39, 41, 42, 43, 44, 45, 46, 49]
## Caller: the number is.. 4
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :) YES!
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 2, 3, 6, 7, 8, 9, 11, 12, 16, 17, 22, 23, 24, 25, 26, 27, 28, 29, 30, 33, 35, 36, 37, 39, 41, 42, 44, 45, 46, 49]
## Caller: the number is.. 43
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 2, 3, 6, 7, 8, 9, 11, 12, 16, 17, 22, 23, 24, 25, 26, 28, 29, 30, 33, 35, 36, 37, 39, 41, 42, 44, 45, 46, 49]
## Caller: the number is.. 27
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 2, 3, 6, 7, 8, 9, 11, 12, 16, 17, 22, 23, 24, 25, 26, 28, 30, 33, 35, 36, 37, 39, 41, 42, 44, 45, 46, 49]
## Caller: the number is.. 29
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 2, 3, 6, 7, 8, 9, 11, 12, 16, 17, 22, 23, 24, 26, 28, 30, 33, 35, 36, 37, 39, 41, 42, 44, 45, 46, 49]
## Caller: the number is.. 25
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=false, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 2, 3, 6, 8, 9, 11, 12, 16, 17, 22, 23, 24, 26, 28, 30, 33, 35, 36, 37, 39, 41, 42, 44, 45, 46, 49]
## Caller: the number is.. 7
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=false}
John: :) YES!
John: {1=false, 7=true, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=false, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 2, 3, 6, 8, 9, 11, 12, 16, 17, 22, 23, 24, 26, 28, 30, 33, 35, 36, 37, 39, 41, 44, 45, 46, 49]
## Caller: the number is.. 42
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=true, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :) YES!
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=true, 45=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 2, 3, 8, 9, 11, 12, 16, 17, 22, 23, 24, 26, 28, 30, 33, 35, 36, 37, 39, 41, 44, 45, 46, 49]
## Caller: the number is.. 6
Mary: :( Noo..
Mary: {2=false, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=true, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=true, 45=false}
Ana: :) YES!
Ana: {2=false, 6=true, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 3, 8, 9, 11, 12, 16, 17, 22, 23, 24, 26, 28, 30, 33, 35, 36, 37, 39, 41, 44, 45, 46, 49]
## Caller: the number is.. 2
Mary: :) YES!
Mary: {2=true, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=true, 8=false, 10=true, 17=false, 18=true, 36=false, 41=false}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=true, 45=false}
Ana: :) YES!
Ana: {2=true, 6=true, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=false, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 3, 8, 9, 11, 12, 16, 17, 22, 23, 24, 26, 28, 30, 33, 35, 37, 39, 41, 44, 45, 46, 49]
## Caller: the number is.. 36
Mary: :( Noo..
Mary: {2=true, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=false}
John: :) YES!
John: {1=false, 7=true, 8=false, 10=true, 17=false, 18=true, 36=true, 41=false}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=true, 45=false}
Ana: :( Noo..
Ana: {2=true, 6=true, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :) YES!
Paul: {3=false, 22=false, 34=true, 36=true, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 3, 8, 9, 11, 12, 16, 17, 22, 23, 24, 26, 28, 30, 33, 35, 37, 39, 41, 45, 46, 49]
## Caller: the number is.. 44
Mary: :( Noo..
Mary: {2=true, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=true, 8=false, 10=true, 17=false, 18=true, 36=true, 41=false}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=true, 45=false}
Ana: :( Noo..
Ana: {2=true, 6=true, 12=false, 17=false, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=true, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 3, 8, 9, 11, 12, 16, 22, 23, 24, 26, 28, 30, 33, 35, 37, 39, 41, 45, 46, 49]
## Caller: the number is.. 17
Mary: :( Noo..
Mary: {2=true, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=false}
John: :) YES!
John: {1=false, 7=true, 8=false, 10=true, 17=true, 18=true, 36=true, 41=false}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=true, 45=false}
Ana: :) YES!
Ana: {2=true, 6=true, 12=false, 17=true, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=true, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 3, 8, 9, 11, 12, 16, 22, 24, 26, 28, 30, 33, 35, 37, 39, 41, 45, 46, 49]
## Caller: the number is.. 23
Mary: :( Noo..
Mary: {2=true, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=true, 8=false, 10=true, 17=true, 18=true, 36=true, 41=false}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=true, 45=false}
Ana: :( Noo..
Ana: {2=true, 6=true, 12=false, 17=true, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=true, 39=false, 41=false, 46=false, 48=true}
Available numbers: [1, 3, 8, 9, 11, 12, 16, 22, 24, 26, 28, 30, 33, 35, 37, 41, 45, 46, 49]
## Caller: the number is.. 39
Mary: :( Noo..
Mary: {2=true, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=false}
John: :( Noo..
John: {1=false, 7=true, 8=false, 10=true, 17=true, 18=true, 36=true, 41=false}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=true, 45=false}
Ana: :( Noo..
Ana: {2=true, 6=true, 12=false, 17=true, 26=false, 37=false, 41=false, 47=true}
Paul: :) YES!
Paul: {3=false, 22=false, 34=true, 36=true, 39=true, 41=false, 46=false, 48=true}
Available numbers: [1, 3, 8, 9, 11, 12, 16, 22, 24, 26, 28, 30, 33, 35, 37, 41, 45, 46]
## Caller: the number is.. 49
Mary: :) YES!
Mary: {2=true, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=true}
John: :( Noo..
John: {1=false, 7=true, 8=false, 10=true, 17=true, 18=true, 36=true, 41=false}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=true, 45=false}
Ana: :( Noo..
Ana: {2=true, 6=true, 12=false, 17=true, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=true, 39=true, 41=false, 46=false, 48=true}
Available numbers: [1, 3, 8, 9, 11, 12, 22, 24, 26, 28, 30, 33, 35, 37, 41, 45, 46]
## Caller: the number is.. 16
Mary: :( Noo..
Mary: {2=true, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=true}
John: :( Noo..
John: {1=false, 7=true, 8=false, 10=true, 17=true, 18=true, 36=true, 41=false}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=true, 45=false}
Ana: :( Noo..
Ana: {2=true, 6=true, 12=false, 17=true, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=true, 39=true, 41=false, 46=false, 48=true}
Available numbers: [1, 3, 8, 9, 11, 12, 22, 24, 26, 28, 30, 33, 35, 37, 41, 46]
## Caller: the number is.. 45
Mary: :( Noo..
Mary: {2=true, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=true}
John: :( Noo..
John: {1=false, 7=true, 8=false, 10=true, 17=true, 18=true, 36=true, 41=false}
Mark: :) YES!
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=true, 45=true}
Ana: :( Noo..
Ana: {2=true, 6=true, 12=false, 17=true, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=true, 39=true, 41=false, 46=false, 48=true}
Available numbers: [1, 3, 8, 9, 11, 12, 22, 24, 26, 28, 30, 33, 35, 37, 41]
## Caller: the number is.. 46
Mary: :( Noo..
Mary: {2=true, 8=false, 9=false, 21=true, 32=true, 34=true, 35=false, 49=true}
John: :( Noo..
John: {1=false, 7=true, 8=false, 10=true, 17=true, 18=true, 36=true, 41=false}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=true, 45=true}
Ana: :( Noo..
Ana: {2=true, 6=true, 12=false, 17=true, 26=false, 37=false, 41=false, 47=true}
Paul: :) YES!
Paul: {3=false, 22=false, 34=true, 36=true, 39=true, 41=false, 46=true, 48=true}
Available numbers: [1, 3, 8, 9, 11, 12, 22, 24, 26, 28, 30, 33, 37, 41]
## Caller: the number is.. 35
Mary: :) YES!
Mary: {2=true, 8=false, 9=false, 21=true, 32=true, 34=true, 35=true, 49=true}
John: :( Noo..
John: {1=false, 7=true, 8=false, 10=true, 17=true, 18=true, 36=true, 41=false}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=true, 45=true}
Ana: :( Noo..
Ana: {2=true, 6=true, 12=false, 17=true, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=true, 39=true, 41=false, 46=true, 48=true}
Available numbers: [1, 3, 8, 9, 11, 22, 24, 26, 28, 30, 33, 37, 41]
## Caller: the number is.. 12
Mary: :( Noo..
Mary: {2=true, 8=false, 9=false, 21=true, 32=true, 34=true, 35=true, 49=true}
John: :( Noo..
John: {1=false, 7=true, 8=false, 10=true, 17=true, 18=true, 36=true, 41=false}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=false, 41=false, 42=true, 45=true}
Ana: :) YES!
Ana: {2=true, 6=true, 12=true, 17=true, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=true, 39=true, 41=false, 46=true, 48=true}
Available numbers: [1, 3, 8, 9, 11, 22, 26, 28, 30, 33, 37, 41]
## Caller: the number is.. 24
Mary: :( Noo..
Mary: {2=true, 8=false, 9=false, 21=true, 32=true, 34=true, 35=true, 49=true}
John: :( Noo..
John: {1=false, 7=true, 8=false, 10=true, 17=true, 18=true, 36=true, 41=false}
Mark: :) YES!
Mark: {4=true, 5=true, 11=false, 19=true, 24=true, 41=false, 42=true, 45=true}
Ana: :( Noo..
Ana: {2=true, 6=true, 12=true, 17=true, 26=false, 37=false, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=true, 39=true, 41=false, 46=true, 48=true}
Available numbers: [1, 3, 8, 9, 11, 22, 26, 28, 30, 33, 41]
## Caller: the number is.. 37
Mary: :( Noo..
Mary: {2=true, 8=false, 9=false, 21=true, 32=true, 34=true, 35=true, 49=true}
John: :( Noo..
John: {1=false, 7=true, 8=false, 10=true, 17=true, 18=true, 36=true, 41=false}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=true, 41=false, 42=true, 45=true}
Ana: :) YES!
Ana: {2=true, 6=true, 12=true, 17=true, 26=false, 37=true, 41=false, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=true, 39=true, 41=false, 46=true, 48=true}
Available numbers: [1, 3, 8, 9, 11, 22, 26, 28, 30, 33]
## Caller: the number is.. 41
Mary: :( Noo..
Mary: {2=true, 8=false, 9=false, 21=true, 32=true, 34=true, 35=true, 49=true}
John: :) YES!
John: {1=false, 7=true, 8=false, 10=true, 17=true, 18=true, 36=true, 41=true}
Mark: :) YES!
Mark: {4=true, 5=true, 11=false, 19=true, 24=true, 41=true, 42=true, 45=true}
Ana: :) YES!
Ana: {2=true, 6=true, 12=true, 17=true, 26=false, 37=true, 41=true, 47=true}
Paul: :) YES!
Paul: {3=false, 22=false, 34=true, 36=true, 39=true, 41=true, 46=true, 48=true}
Available numbers: [1, 3, 8, 9, 11, 22, 26, 28, 33]
## Caller: the number is.. 30
Mary: :( Noo..
Mary: {2=true, 8=false, 9=false, 21=true, 32=true, 34=true, 35=true, 49=true}
John: :( Noo..
John: {1=false, 7=true, 8=false, 10=true, 17=true, 18=true, 36=true, 41=true}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=true, 41=true, 42=true, 45=true}
Ana: :( Noo..
Ana: {2=true, 6=true, 12=true, 17=true, 26=false, 37=true, 41=true, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=true, 39=true, 41=true, 46=true, 48=true}
Available numbers: [3, 8, 9, 11, 22, 26, 28, 33]
## Caller: the number is.. 1
Mary: :( Noo..
Mary: {2=true, 8=false, 9=false, 21=true, 32=true, 34=true, 35=true, 49=true}
John: :) YES!
John: {1=true, 7=true, 8=false, 10=true, 17=true, 18=true, 36=true, 41=true}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=true, 41=true, 42=true, 45=true}
Ana: :( Noo..
Ana: {2=true, 6=true, 12=true, 17=true, 26=false, 37=true, 41=true, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=true, 39=true, 41=true, 46=true, 48=true}
Available numbers: [3, 8, 11, 22, 26, 28, 33]
## Caller: the number is.. 9
Mary: :) YES!
Mary: {2=true, 8=false, 9=true, 21=true, 32=true, 34=true, 35=true, 49=true}
John: :( Noo..
John: {1=true, 7=true, 8=false, 10=true, 17=true, 18=true, 36=true, 41=true}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=true, 41=true, 42=true, 45=true}
Ana: :( Noo..
Ana: {2=true, 6=true, 12=true, 17=true, 26=false, 37=true, 41=true, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=true, 39=true, 41=true, 46=true, 48=true}
Available numbers: [3, 8, 11, 22, 28, 33]
## Caller: the number is.. 26
Mary: :( Noo..
Mary: {2=true, 8=false, 9=true, 21=true, 32=true, 34=true, 35=true, 49=true}
John: :( Noo..
John: {1=true, 7=true, 8=false, 10=true, 17=true, 18=true, 36=true, 41=true}
Mark: :( Noo..
Mark: {4=true, 5=true, 11=false, 19=true, 24=true, 41=true, 42=true, 45=true}
Ana: :) YES!
Ana: {2=true, 6=true, 12=true, 17=true, 26=true, 37=true, 41=true, 47=true}
Paul: :( Noo..
Paul: {3=false, 22=false, 34=true, 36=true, 39=true, 41=true, 46=true, 48=true}
## Caller: THE WINNER IS ANA !!!
```
