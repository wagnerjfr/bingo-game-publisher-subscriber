# bingo-game-publisher-subscriber

Mary, John, Mark, Ana and Paul try their luck in a Bingo. Who is going to win?

It's a publisher/subscriber multi-thread Bingo simulation game with 5 players.

Sample output:
```
Available numbers: [1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]
## Caller: the number is.. 2
Mary: :( Noo..
Mary: {6=false, 8=false, 10=false, 21=false, 23=false, 32=false, 45=false, 46=false, 47=false}
John: :( Noo..
John: {1=false, 3=false, 4=false, 15=false, 18=false, 25=false, 35=false, 47=false, 49=false}
Mark: :( Noo..
Mark: {1=false, 7=false, 12=false, 18=false, 26=false, 30=false, 37=false, 42=false, 50=false}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=false, 50=false}
Paul: :( Noo..
Paul: {1=false, 6=false, 10=false, 11=false, 20=false, 29=false, 32=false, 40=false, 48=false}
Available numbers: [1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]
## Caller: the number is.. 31
Mary: :( Noo..
Mary: {6=false, 8=false, 10=false, 21=false, 23=false, 32=false, 45=false, 46=false, 47=false}
John: :( Noo..
John: {1=false, 3=false, 4=false, 15=false, 18=false, 25=false, 35=false, 47=false, 49=false}
Mark: :( Noo..
Mark: {1=false, 7=false, 12=false, 18=false, 26=false, 30=false, 37=false, 42=false, 50=false}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=false, 50=false}
Paul: :( Noo..
Paul: {1=false, 6=false, 10=false, 11=false, 20=false, 29=false, 32=false, 40=false, 48=false}
Available numbers: [1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]
## Caller: the number is.. 12
Mary: :( Noo..
Mary: {6=false, 8=false, 10=false, 21=false, 23=false, 32=false, 45=false, 46=false, 47=false}
John: :( Noo..
John: {1=false, 3=false, 4=false, 15=false, 18=false, 25=false, 35=false, 47=false, 49=false}
Mark: :) YES!
Mark: {1=false, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=false, 50=false}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=false, 50=false}
Paul: :( Noo..
Paul: {1=false, 6=false, 10=false, 11=false, 20=false, 29=false, 32=false, 40=false, 48=false}
Available numbers: [1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 45, 46, 47, 48, 49, 50]
## Caller: the number is.. 44
Mary: :( Noo..
Mary: {6=false, 8=false, 10=false, 21=false, 23=false, 32=false, 45=false, 46=false, 47=false}
John: :( Noo..
John: {1=false, 3=false, 4=false, 15=false, 18=false, 25=false, 35=false, 47=false, 49=false}
Mark: :( Noo..
Mark: {1=false, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=false, 50=false}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=false, 50=false}
Paul: :( Noo..
Paul: {1=false, 6=false, 10=false, 11=false, 20=false, 29=false, 32=false, 40=false, 48=false}
Available numbers: [1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 37, 38, 39, 40, 41, 42, 43, 45, 46, 47, 48, 49, 50]
## Caller: the number is.. 36
Mary: :( Noo..
Mary: {6=false, 8=false, 10=false, 21=false, 23=false, 32=false, 45=false, 46=false, 47=false}
John: :( Noo..
John: {1=false, 3=false, 4=false, 15=false, 18=false, 25=false, 35=false, 47=false, 49=false}
Mark: :( Noo..
Mark: {1=false, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=false, 50=false}
Ana: :) YES!
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=false}
Paul: :( Noo..
Paul: {1=false, 6=false, 10=false, 11=false, 20=false, 29=false, 32=false, 40=false, 48=false}
Available numbers: [1, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 37, 38, 39, 40, 41, 42, 43, 45, 46, 47, 48, 49, 50]
## Caller: the number is.. 3
Mary: :( Noo..
Mary: {6=false, 8=false, 10=false, 21=false, 23=false, 32=false, 45=false, 46=false, 47=false}
John: :) YES!
John: {1=false, 3=true, 4=false, 15=false, 18=false, 25=false, 35=false, 47=false, 49=false}
Mark: :( Noo..
Mark: {1=false, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=false, 50=false}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=false}
Paul: :( Noo..
Paul: {1=false, 6=false, 10=false, 11=false, 20=false, 29=false, 32=false, 40=false, 48=false}
Available numbers: [1, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 37, 38, 39, 40, 41, 42, 43, 45, 46, 47, 48, 49, 50]
## Caller: the number is.. 23
Mary: :) YES!
Mary: {6=false, 8=false, 10=false, 21=false, 23=true, 32=false, 45=false, 46=false, 47=false}
John: :( Noo..
John: {1=false, 3=true, 4=false, 15=false, 18=false, 25=false, 35=false, 47=false, 49=false}
Mark: :( Noo..
Mark: {1=false, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=false, 50=false}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=false}
Paul: :( Noo..
Paul: {1=false, 6=false, 10=false, 11=false, 20=false, 29=false, 32=false, 40=false, 48=false}
Available numbers: [1, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 24, 25, 26, 27, 29, 30, 32, 33, 34, 35, 37, 38, 39, 40, 41, 42, 43, 45, 46, 47, 48, 49, 50]
## Caller: the number is.. 28
Mary: :( Noo..
Mary: {6=false, 8=false, 10=false, 21=false, 23=true, 32=false, 45=false, 46=false, 47=false}
John: :( Noo..
John: {1=false, 3=true, 4=false, 15=false, 18=false, 25=false, 35=false, 47=false, 49=false}
Mark: :( Noo..
Mark: {1=false, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=false, 50=false}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=false}
Paul: :( Noo..
Paul: {1=false, 6=false, 10=false, 11=false, 20=false, 29=false, 32=false, 40=false, 48=false}
Available numbers: [1, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 24, 25, 26, 27, 29, 30, 32, 33, 34, 35, 37, 38, 39, 41, 42, 43, 45, 46, 47, 48, 49, 50]
## Caller: the number is.. 40
Mary: :( Noo..
Mary: {6=false, 8=false, 10=false, 21=false, 23=true, 32=false, 45=false, 46=false, 47=false}
John: :( Noo..
John: {1=false, 3=true, 4=false, 15=false, 18=false, 25=false, 35=false, 47=false, 49=false}
Mark: :( Noo..
Mark: {1=false, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=false, 50=false}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=false}
Paul: :) YES!
Paul: {1=false, 6=false, 10=false, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [1, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 24, 25, 26, 27, 29, 30, 32, 33, 34, 35, 37, 38, 39, 41, 42, 43, 45, 46, 47, 48, 49]
## Caller: the number is.. 50
Mary: :( Noo..
Mary: {6=false, 8=false, 10=false, 21=false, 23=true, 32=false, 45=false, 46=false, 47=false}
John: :( Noo..
John: {1=false, 3=true, 4=false, 15=false, 18=false, 25=false, 35=false, 47=false, 49=false}
Mark: :) YES!
Mark: {1=false, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=false, 50=true}
Ana: :) YES!
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=false, 6=false, 10=false, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [1, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 24, 25, 26, 27, 29, 30, 32, 34, 35, 37, 38, 39, 41, 42, 43, 45, 46, 47, 48, 49]
## Caller: the number is.. 33
Mary: :( Noo..
Mary: {6=false, 8=false, 10=false, 21=false, 23=true, 32=false, 45=false, 46=false, 47=false}
John: :( Noo..
John: {1=false, 3=true, 4=false, 15=false, 18=false, 25=false, 35=false, 47=false, 49=false}
Mark: :( Noo..
Mark: {1=false, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=false, 50=true}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=false, 6=false, 10=false, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [1, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 24, 25, 26, 27, 29, 30, 32, 34, 35, 37, 38, 39, 42, 43, 45, 46, 47, 48, 49]
## Caller: the number is.. 41
Mary: :( Noo..
Mary: {6=false, 8=false, 10=false, 21=false, 23=true, 32=false, 45=false, 46=false, 47=false}
John: :( Noo..
John: {1=false, 3=true, 4=false, 15=false, 18=false, 25=false, 35=false, 47=false, 49=false}
Mark: :( Noo..
Mark: {1=false, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=false, 50=true}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=false, 6=false, 10=false, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [1, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 24, 25, 26, 27, 29, 30, 32, 34, 35, 37, 38, 39, 43, 45, 46, 47, 48, 49]
## Caller: the number is.. 42
Mary: :( Noo..
Mary: {6=false, 8=false, 10=false, 21=false, 23=true, 32=false, 45=false, 46=false, 47=false}
John: :( Noo..
John: {1=false, 3=true, 4=false, 15=false, 18=false, 25=false, 35=false, 47=false, 49=false}
Mark: :) YES!
Mark: {1=false, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=false, 6=false, 10=false, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [1, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 20, 21, 22, 24, 25, 26, 27, 29, 30, 32, 34, 35, 37, 38, 39, 43, 45, 46, 47, 48, 49]
## Caller: the number is.. 19
Mary: :( Noo..
Mary: {6=false, 8=false, 10=false, 21=false, 23=true, 32=false, 45=false, 46=false, 47=false}
John: :( Noo..
John: {1=false, 3=true, 4=false, 15=false, 18=false, 25=false, 35=false, 47=false, 49=false}
Mark: :( Noo..
Mark: {1=false, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=false, 6=false, 10=false, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 20, 21, 22, 24, 25, 26, 27, 29, 30, 32, 34, 35, 37, 38, 39, 43, 45, 46, 47, 48, 49]
## Caller: the number is.. 1
Mary: :( Noo..
Mary: {6=false, 8=false, 10=false, 21=false, 23=true, 32=false, 45=false, 46=false, 47=false}
John: :) YES!
John: {1=true, 3=true, 4=false, 15=false, 18=false, 25=false, 35=false, 47=false, 49=false}
Mark: :) YES!
Mark: {1=true, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=true}
Paul: :) YES!
Paul: {1=true, 6=false, 10=false, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 5, 6, 7, 8, 9, 11, 13, 14, 15, 16, 17, 18, 20, 21, 22, 24, 25, 26, 27, 29, 30, 32, 34, 35, 37, 38, 39, 43, 45, 46, 47, 48, 49]
## Caller: the number is.. 10
Mary: :) YES!
Mary: {6=false, 8=false, 10=true, 21=false, 23=true, 32=false, 45=false, 46=false, 47=false}
John: :( Noo..
John: {1=true, 3=true, 4=false, 15=false, 18=false, 25=false, 35=false, 47=false, 49=false}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=true}
Paul: :) YES!
Paul: {1=true, 6=false, 10=true, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 5, 6, 7, 8, 9, 11, 13, 14, 15, 16, 17, 18, 20, 21, 22, 24, 25, 26, 27, 29, 30, 32, 34, 37, 38, 39, 43, 45, 46, 47, 48, 49]
## Caller: the number is.. 35
Mary: :( Noo..
Mary: {6=false, 8=false, 10=true, 21=false, 23=true, 32=false, 45=false, 46=false, 47=false}
John: :) YES!
John: {1=true, 3=true, 4=false, 15=false, 18=false, 25=false, 35=true, 47=false, 49=false}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=false, 10=true, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 5, 6, 7, 8, 9, 11, 13, 14, 15, 16, 17, 18, 20, 21, 22, 24, 25, 26, 27, 29, 30, 32, 34, 37, 38, 39, 43, 45, 46, 48, 49]
## Caller: the number is.. 47
Mary: :) YES!
Mary: {6=false, 8=false, 10=true, 21=false, 23=true, 32=false, 45=false, 46=false, 47=true}
John: :) YES!
John: {1=true, 3=true, 4=false, 15=false, 18=false, 25=false, 35=true, 47=true, 49=false}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=false, 10=true, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 5, 6, 7, 8, 9, 11, 13, 14, 16, 17, 18, 20, 21, 22, 24, 25, 26, 27, 29, 30, 32, 34, 37, 38, 39, 43, 45, 46, 48, 49]
## Caller: the number is.. 15
Mary: :( Noo..
Mary: {6=false, 8=false, 10=true, 21=false, 23=true, 32=false, 45=false, 46=false, 47=true}
John: :) YES!
John: {1=true, 3=true, 4=false, 15=true, 18=false, 25=false, 35=true, 47=true, 49=false}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=false, 10=true, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 6, 7, 8, 9, 11, 13, 14, 16, 17, 18, 20, 21, 22, 24, 25, 26, 27, 29, 30, 32, 34, 37, 38, 39, 43, 45, 46, 48, 49]
## Caller: the number is.. 5
Mary: :( Noo..
Mary: {6=false, 8=false, 10=true, 21=false, 23=true, 32=false, 45=false, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=false, 15=true, 18=false, 25=false, 35=true, 47=true, 49=false}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=false, 10=true, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 6, 7, 8, 9, 11, 13, 14, 16, 17, 18, 20, 21, 22, 24, 25, 26, 27, 29, 30, 32, 34, 37, 38, 43, 45, 46, 48, 49]
## Caller: the number is.. 39
Mary: :( Noo..
Mary: {6=false, 8=false, 10=true, 21=false, 23=true, 32=false, 45=false, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=false, 15=true, 18=false, 25=false, 35=true, 47=true, 49=false}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=false, 10=true, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 6, 7, 8, 9, 11, 13, 14, 16, 17, 18, 20, 21, 22, 24, 25, 26, 27, 29, 30, 32, 34, 37, 38, 43, 46, 48, 49]
## Caller: the number is.. 45
Mary: :) YES!
Mary: {6=false, 8=false, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=false, 15=true, 18=false, 25=false, 35=true, 47=true, 49=false}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=false, 30=false, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=false, 10=true, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 6, 7, 8, 9, 11, 13, 14, 16, 17, 18, 20, 21, 22, 24, 25, 26, 27, 29, 32, 34, 37, 38, 43, 46, 48, 49]
## Caller: the number is.. 30
Mary: :( Noo..
Mary: {6=false, 8=false, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=false, 15=true, 18=false, 25=false, 35=true, 47=true, 49=false}
Mark: :) YES!
Mark: {1=true, 7=false, 12=true, 18=false, 26=false, 30=true, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=false, 10=true, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 6, 7, 8, 9, 11, 13, 14, 16, 17, 18, 20, 21, 22, 24, 25, 26, 29, 32, 34, 37, 38, 43, 46, 48, 49]
## Caller: the number is.. 27
Mary: :( Noo..
Mary: {6=false, 8=false, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=false, 15=true, 18=false, 25=false, 35=true, 47=true, 49=false}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=false, 30=true, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=false, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=false, 10=true, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 7, 8, 9, 11, 13, 14, 16, 17, 18, 20, 21, 22, 24, 25, 26, 29, 32, 34, 37, 38, 43, 46, 48, 49]
## Caller: the number is.. 6
Mary: :) YES!
Mary: {6=true, 8=false, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=false, 15=true, 18=false, 25=false, 35=true, 47=true, 49=false}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=false, 30=true, 37=false, 42=true, 50=true}
Ana: :) YES!
Ana: {6=true, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=true}
Paul: :) YES!
Paul: {1=true, 6=true, 10=true, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 7, 8, 9, 11, 13, 14, 16, 17, 18, 20, 21, 22, 24, 25, 26, 29, 32, 34, 37, 38, 43, 46, 48]
## Caller: the number is.. 49
Mary: :( Noo..
Mary: {6=true, 8=false, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :) YES!
John: {1=true, 3=true, 4=false, 15=true, 18=false, 25=false, 35=true, 47=true, 49=true}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=false, 30=true, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=true, 8=false, 14=false, 16=false, 20=false, 21=false, 34=false, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=true, 10=true, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 7, 8, 9, 11, 13, 14, 16, 17, 18, 20, 21, 22, 24, 25, 26, 29, 32, 37, 38, 43, 46, 48]
## Caller: the number is.. 34
Mary: :( Noo..
Mary: {6=true, 8=false, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=false, 15=true, 18=false, 25=false, 35=true, 47=true, 49=true}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=false, 30=true, 37=false, 42=true, 50=true}
Ana: :) YES!
Ana: {6=true, 8=false, 14=false, 16=false, 20=false, 21=false, 34=true, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=true, 10=true, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 7, 8, 9, 11, 13, 14, 16, 17, 18, 20, 21, 22, 24, 25, 29, 32, 37, 38, 43, 46, 48]
## Caller: the number is.. 26
Mary: :( Noo..
Mary: {6=true, 8=false, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=false, 15=true, 18=false, 25=false, 35=true, 47=true, 49=true}
Mark: :) YES!
Mark: {1=true, 7=false, 12=true, 18=false, 26=true, 30=true, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=true, 8=false, 14=false, 16=false, 20=false, 21=false, 34=true, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=true, 10=true, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 7, 9, 11, 13, 14, 16, 17, 18, 20, 21, 22, 24, 25, 29, 32, 37, 38, 43, 46, 48]
## Caller: the number is.. 8
Mary: :) YES!
Mary: {6=true, 8=true, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=false, 15=true, 18=false, 25=false, 35=true, 47=true, 49=true}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=true, 30=true, 37=false, 42=true, 50=true}
Ana: :) YES!
Ana: {6=true, 8=true, 14=false, 16=false, 20=false, 21=false, 34=true, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=true, 10=true, 11=false, 20=false, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 7, 9, 11, 13, 14, 16, 17, 18, 21, 22, 24, 25, 29, 32, 37, 38, 43, 46, 48]
## Caller: the number is.. 20
Mary: :( Noo..
Mary: {6=true, 8=true, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=false, 15=true, 18=false, 25=false, 35=true, 47=true, 49=true}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=true, 30=true, 37=false, 42=true, 50=true}
Ana: :) YES!
Ana: {6=true, 8=true, 14=false, 16=false, 20=true, 21=false, 34=true, 36=true, 50=true}
Paul: :) YES!
Paul: {1=true, 6=true, 10=true, 11=false, 20=true, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 7, 9, 11, 13, 14, 16, 17, 18, 21, 24, 25, 29, 32, 37, 38, 43, 46, 48]
## Caller: the number is.. 22
Mary: :( Noo..
Mary: {6=true, 8=true, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=false, 15=true, 18=false, 25=false, 35=true, 47=true, 49=true}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=true, 30=true, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=true, 8=true, 14=false, 16=false, 20=true, 21=false, 34=true, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=true, 10=true, 11=false, 20=true, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 7, 9, 11, 13, 14, 16, 18, 21, 24, 25, 29, 32, 37, 38, 43, 46, 48]
## Caller: the number is.. 17
Mary: :( Noo..
Mary: {6=true, 8=true, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=false, 15=true, 18=false, 25=false, 35=true, 47=true, 49=true}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=true, 30=true, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=true, 8=true, 14=false, 16=false, 20=true, 21=false, 34=true, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=true, 10=true, 11=false, 20=true, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 7, 9, 13, 14, 16, 18, 21, 24, 25, 29, 32, 37, 38, 43, 46, 48]
## Caller: the number is.. 11
Mary: :( Noo..
Mary: {6=true, 8=true, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=false, 15=true, 18=false, 25=false, 35=true, 47=true, 49=true}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=true, 30=true, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=true, 8=true, 14=false, 16=false, 20=true, 21=false, 34=true, 36=true, 50=true}
Paul: :) YES!
Paul: {1=true, 6=true, 10=true, 11=true, 20=true, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 7, 9, 13, 14, 18, 21, 24, 25, 29, 32, 37, 38, 43, 46, 48]
## Caller: the number is.. 16
Mary: :( Noo..
Mary: {6=true, 8=true, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=false, 15=true, 18=false, 25=false, 35=true, 47=true, 49=true}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=true, 30=true, 37=false, 42=true, 50=true}
Ana: :) YES!
Ana: {6=true, 8=true, 14=false, 16=true, 20=true, 21=false, 34=true, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=true, 10=true, 11=true, 20=true, 29=false, 32=false, 40=true, 48=false}
Available numbers: [4, 7, 9, 13, 18, 21, 24, 25, 29, 32, 37, 38, 43, 46, 48]
## Caller: the number is.. 14
Mary: :( Noo..
Mary: {6=true, 8=true, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=false, 15=true, 18=false, 25=false, 35=true, 47=true, 49=true}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=true, 30=true, 37=false, 42=true, 50=true}
Ana: :) YES!
Ana: {6=true, 8=true, 14=true, 16=true, 20=true, 21=false, 34=true, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=true, 10=true, 11=true, 20=true, 29=false, 32=false, 40=true, 48=false}
Available numbers: [7, 9, 13, 18, 21, 24, 25, 29, 32, 37, 38, 43, 46, 48]
## Caller: the number is.. 4
Mary: :( Noo..
Mary: {6=true, 8=true, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :) YES!
John: {1=true, 3=true, 4=true, 15=true, 18=false, 25=false, 35=true, 47=true, 49=true}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=true, 30=true, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=true, 8=true, 14=true, 16=true, 20=true, 21=false, 34=true, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=true, 10=true, 11=true, 20=true, 29=false, 32=false, 40=true, 48=false}
Available numbers: [7, 13, 18, 21, 24, 25, 29, 32, 37, 38, 43, 46, 48]
## Caller: the number is.. 9
Mary: :( Noo..
Mary: {6=true, 8=true, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=true, 15=true, 18=false, 25=false, 35=true, 47=true, 49=true}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=true, 30=true, 37=false, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=true, 8=true, 14=true, 16=true, 20=true, 21=false, 34=true, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=true, 10=true, 11=true, 20=true, 29=false, 32=false, 40=true, 48=false}
Available numbers: [7, 13, 18, 21, 24, 25, 29, 32, 38, 43, 46, 48]
## Caller: the number is.. 37
Mary: :( Noo..
Mary: {6=true, 8=true, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=true, 15=true, 18=false, 25=false, 35=true, 47=true, 49=true}
Mark: :) YES!
Mark: {1=true, 7=false, 12=true, 18=false, 26=true, 30=true, 37=true, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=true, 8=true, 14=true, 16=true, 20=true, 21=false, 34=true, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=true, 10=true, 11=true, 20=true, 29=false, 32=false, 40=true, 48=false}
Available numbers: [7, 13, 18, 21, 24, 25, 32, 38, 43, 46, 48]
## Caller: the number is.. 29
Mary: :( Noo..
Mary: {6=true, 8=true, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=true, 15=true, 18=false, 25=false, 35=true, 47=true, 49=true}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=true, 30=true, 37=true, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=true, 8=true, 14=true, 16=true, 20=true, 21=false, 34=true, 36=true, 50=true}
Paul: :) YES!
Paul: {1=true, 6=true, 10=true, 11=true, 20=true, 29=true, 32=false, 40=true, 48=false}
Available numbers: [7, 13, 18, 21, 25, 32, 38, 43, 46, 48]
## Caller: the number is.. 24
Mary: :( Noo..
Mary: {6=true, 8=true, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=true, 15=true, 18=false, 25=false, 35=true, 47=true, 49=true}
Mark: :( Noo..
Mark: {1=true, 7=false, 12=true, 18=false, 26=true, 30=true, 37=true, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=true, 8=true, 14=true, 16=true, 20=true, 21=false, 34=true, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=true, 10=true, 11=true, 20=true, 29=true, 32=false, 40=true, 48=false}
Available numbers: [7, 13, 21, 25, 32, 38, 43, 46, 48]
## Caller: the number is.. 18
Mary: :( Noo..
Mary: {6=true, 8=true, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :) YES!
John: {1=true, 3=true, 4=true, 15=true, 18=true, 25=false, 35=true, 47=true, 49=true}
Mark: :) YES!
Mark: {1=true, 7=false, 12=true, 18=true, 26=true, 30=true, 37=true, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=true, 8=true, 14=true, 16=true, 20=true, 21=false, 34=true, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=true, 10=true, 11=true, 20=true, 29=true, 32=false, 40=true, 48=false}
Available numbers: [13, 21, 25, 32, 38, 43, 46, 48]
## Caller: the number is.. 7
Mary: :( Noo..
Mary: {6=true, 8=true, 10=true, 21=false, 23=true, 32=false, 45=true, 46=false, 47=true}
John: :( Noo..
John: {1=true, 3=true, 4=true, 15=true, 18=true, 25=false, 35=true, 47=true, 49=true}
Mark: :) YES!
Mark: {1=true, 7=true, 12=true, 18=true, 26=true, 30=true, 37=true, 42=true, 50=true}
Ana: :( Noo..
Ana: {6=true, 8=true, 14=true, 16=true, 20=true, 21=false, 34=true, 36=true, 50=true}
Paul: :( Noo..
Paul: {1=true, 6=true, 10=true, 11=true, 20=true, 29=true, 32=false, 40=true, 48=false}
## Caller: THE WINNER IS MARK !!!
```
