# :busts_in_silhouette: `bingo-game-publisher-subscriber`

It's a *publisher/subscriber* multi-thread **Bingo simulation game** with 5 players.

`Mary`, `John`, `Mark`, `Ana` and `Paul` try their luck in a Bingo. Who is going to win?

Each player has one card with 8 numbers (randomly selected from **1 to 50**).

Who first fills all the numbers in the card `BINGO!`, wins!

### Steps to run the application:
#### 1. Clone the project:
```
$ https://github.com/wagnerjfr/bingo-game-publisher-subscriber.git
```
#### 2. Get into the directory:
```
$ cd bingo-game-publisher-subscriber
```
#### 3. Run Maven package:
```
$ mvn package
```
#### 4. Launch the application:
```
$ java -jar target/bingo-1.0-SNAPSHOT.jar
```

##### Sample output:
```console
Available numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]
## Caller: the number is.. 20
Mary: :( Noo..
Mary: {5=false, 11=false, 16=false, 31=false, 35=false, 37=false, 43=false, 48=false}
John: :( Noo..
John: {2=false, 3=false, 13=false, 19=false, 23=false, 30=false, 31=false, 48=false}
Mark: :( Noo..
Mark: {3=false, 13=false, 27=false, 28=false, 38=false, 42=false, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=false, 29=false, 32=false, 36=false, 43=false, 45=false}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=false, 31=false, 34=false, 41=false, 47=false}
Available numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 49, 50]
## Caller: the number is.. 48
Mary: :) YES!
Mary: {5=false, 11=false, 16=false, 31=false, 35=false, 37=false, 43=false, 48=true}
John: :) YES!
John: {2=false, 3=false, 13=false, 19=false, 23=false, 30=false, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=false, 13=false, 27=false, 28=false, 38=false, 42=false, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=false, 29=false, 32=false, 36=false, 43=false, 45=false}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=false, 31=false, 34=false, 41=false, 47=false}
Available numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 47, 49, 50]
## Caller: the number is.. 46
Mary: :( Noo..
Mary: {5=false, 11=false, 16=false, 31=false, 35=false, 37=false, 43=false, 48=true}
John: :( Noo..
John: {2=false, 3=false, 13=false, 19=false, 23=false, 30=false, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=false, 13=false, 27=false, 28=false, 38=false, 42=false, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=false, 29=false, 32=false, 36=false, 43=false, 45=false}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=false, 31=false, 34=false, 41=false, 47=false}
Available numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 47, 49, 50]
## Caller: the number is.. 32
Mary: :( Noo..
Mary: {5=false, 11=false, 16=false, 31=false, 35=false, 37=false, 43=false, 48=true}
John: :( Noo..
John: {2=false, 3=false, 13=false, 19=false, 23=false, 30=false, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=false, 13=false, 27=false, 28=false, 38=false, 42=false, 44=false, 50=false}
Ana: :) YES!
Ana: {2=false, 6=false, 16=false, 29=false, 32=true, 36=false, 43=false, 45=false}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=false, 31=false, 34=false, 41=false, 47=false}
Available numbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 44, 45, 47, 49, 50]
## Caller: the number is.. 43
Mary: :) YES!
Mary: {5=false, 11=false, 16=false, 31=false, 35=false, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=false, 13=false, 19=false, 23=false, 30=false, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=false, 13=false, 27=false, 28=false, 38=false, 42=false, 44=false, 50=false}
Ana: :) YES!
Ana: {2=false, 6=false, 16=false, 29=false, 32=true, 36=false, 43=true, 45=false}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=false, 31=false, 34=false, 41=false, 47=false}
Available numbers: [1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 44, 45, 47, 49, 50]
## Caller: the number is.. 3
Mary: :( Noo..
Mary: {5=false, 11=false, 16=false, 31=false, 35=false, 37=false, 43=true, 48=true}
John: :) YES!
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=false, 31=false, 48=true}
Mark: :) YES!
Mark: {3=true, 13=false, 27=false, 28=false, 38=false, 42=false, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=false, 29=false, 32=true, 36=false, 43=true, 45=false}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=false, 31=false, 34=false, 41=false, 47=false}
Available numbers: [1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 44, 47, 49, 50]
## Caller: the number is.. 45
Mary: :( Noo..
Mary: {5=false, 11=false, 16=false, 31=false, 35=false, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=false, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=false, 38=false, 42=false, 44=false, 50=false}
Ana: :) YES!
Ana: {2=false, 6=false, 16=false, 29=false, 32=true, 36=false, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=false, 31=false, 34=false, 41=false, 47=false}
Available numbers: [1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 44, 47, 49, 50]
## Caller: the number is.. 18
Mary: :( Noo..
Mary: {5=false, 11=false, 16=false, 31=false, 35=false, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=false, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=false, 38=false, 42=false, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=false, 29=false, 32=true, 36=false, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=false, 31=false, 34=false, 41=false, 47=false}
Available numbers: [1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 21, 22, 23, 24, 25, 26, 27, 29, 30, 31, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 44, 47, 49, 50]
## Caller: the number is.. 28
Mary: :( Noo..
Mary: {5=false, 11=false, 16=false, 31=false, 35=false, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=false, 31=false, 48=true}
Mark: :) YES!
Mark: {3=true, 13=false, 27=false, 28=true, 38=false, 42=false, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=false, 29=false, 32=true, 36=false, 43=true, 45=true}
Paul: :) YES!
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=false, 41=false, 47=false}
Available numbers: [1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 21, 22, 23, 24, 25, 26, 27, 29, 30, 31, 33, 34, 36, 37, 38, 39, 40, 41, 42, 44, 47, 49, 50]
## Caller: the number is.. 35
Mary: :) YES!
Mary: {5=false, 11=false, 16=false, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=false, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=false, 42=false, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=false, 29=false, 32=true, 36=false, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=false, 41=false, 47=false}
Available numbers: [1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 21, 22, 23, 24, 25, 26, 27, 29, 30, 31, 34, 36, 37, 38, 39, 40, 41, 42, 44, 47, 49, 50]
## Caller: the number is.. 33
Mary: :( Noo..
Mary: {5=false, 11=false, 16=false, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=false, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=false, 42=false, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=false, 29=false, 32=true, 36=false, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=false, 41=false, 47=false}
Available numbers: [1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 21, 22, 23, 24, 25, 26, 27, 29, 30, 31, 36, 37, 38, 39, 40, 41, 42, 44, 47, 49, 50]
## Caller: the number is.. 34
Mary: :( Noo..
Mary: {5=false, 11=false, 16=false, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=false, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=false, 42=false, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=false, 29=false, 32=true, 36=false, 43=true, 45=true}
Paul: :) YES!
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 21, 22, 23, 24, 25, 26, 27, 29, 30, 31, 36, 37, 38, 39, 41, 42, 44, 47, 49, 50]
## Caller: the number is.. 40
Mary: :( Noo..
Mary: {5=false, 11=false, 16=false, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=false, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=false, 42=false, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=false, 29=false, 32=true, 36=false, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 21, 22, 23, 24, 25, 26, 27, 29, 30, 31, 36, 37, 39, 41, 42, 44, 47, 49, 50]
## Caller: the number is.. 38
Mary: :( Noo..
Mary: {5=false, 11=false, 16=false, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=false, 31=false, 48=true}
Mark: :) YES!
Mark: {3=true, 13=false, 27=false, 28=true, 38=true, 42=false, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=false, 29=false, 32=true, 36=false, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 2, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 21, 22, 23, 24, 25, 26, 27, 29, 30, 31, 36, 37, 39, 41, 42, 44, 47, 49, 50]
## Caller: the number is.. 8
Mary: :( Noo..
Mary: {5=false, 11=false, 16=false, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=false, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=true, 42=false, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=false, 29=false, 32=true, 36=false, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 2, 4, 5, 6, 7, 9, 10, 12, 13, 14, 15, 16, 17, 19, 21, 22, 23, 24, 25, 26, 27, 29, 30, 31, 36, 37, 39, 41, 42, 44, 47, 49, 50]
## Caller: the number is.. 11
Mary: :) YES!
Mary: {5=false, 11=true, 16=false, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=false, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=true, 42=false, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=false, 29=false, 32=true, 36=false, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 2, 4, 5, 6, 7, 9, 10, 12, 13, 14, 15, 16, 17, 19, 21, 22, 23, 24, 26, 27, 29, 30, 31, 36, 37, 39, 41, 42, 44, 47, 49, 50]
## Caller: the number is.. 25
Mary: :( Noo..
Mary: {5=false, 11=true, 16=false, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=false, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=true, 42=false, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=false, 29=false, 32=true, 36=false, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 2, 4, 5, 6, 7, 9, 10, 12, 13, 14, 15, 16, 17, 19, 21, 23, 24, 26, 27, 29, 30, 31, 36, 37, 39, 41, 42, 44, 47, 49, 50]
## Caller: the number is.. 22
Mary: :( Noo..
Mary: {5=false, 11=true, 16=false, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=false, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=true, 42=false, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=false, 29=false, 32=true, 36=false, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 2, 4, 5, 6, 7, 9, 10, 12, 13, 14, 15, 16, 17, 19, 21, 23, 24, 26, 27, 29, 31, 36, 37, 39, 41, 42, 44, 47, 49, 50]
## Caller: the number is.. 30
Mary: :( Noo..
Mary: {5=false, 11=true, 16=false, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :) YES!
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=true, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=true, 42=false, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=false, 29=false, 32=true, 36=false, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 2, 4, 5, 6, 7, 9, 10, 13, 14, 15, 16, 17, 19, 21, 23, 24, 26, 27, 29, 31, 36, 37, 39, 41, 42, 44, 47, 49, 50]
## Caller: the number is.. 12
Mary: :( Noo..
Mary: {5=false, 11=true, 16=false, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=true, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=true, 42=false, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=false, 29=false, 32=true, 36=false, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 2, 4, 5, 6, 7, 9, 10, 13, 14, 15, 17, 19, 21, 23, 24, 26, 27, 29, 31, 36, 37, 39, 41, 42, 44, 47, 49, 50]
## Caller: the number is.. 16
Mary: :) YES!
Mary: {5=false, 11=true, 16=true, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=true, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=true, 42=false, 44=false, 50=false}
Ana: :) YES!
Ana: {2=false, 6=false, 16=true, 29=false, 32=true, 36=false, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 2, 4, 5, 6, 7, 9, 10, 13, 14, 15, 17, 19, 21, 23, 24, 26, 27, 29, 31, 37, 39, 41, 42, 44, 47, 49, 50]
## Caller: the number is.. 36
Mary: :( Noo..
Mary: {5=false, 11=true, 16=true, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=true, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=true, 42=false, 44=false, 50=false}
Ana: :) YES!
Ana: {2=false, 6=false, 16=true, 29=false, 32=true, 36=true, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 2, 4, 5, 6, 7, 9, 10, 13, 14, 15, 17, 19, 21, 23, 24, 26, 27, 29, 31, 37, 39, 41, 44, 47, 49, 50]
## Caller: the number is.. 42
Mary: :( Noo..
Mary: {5=false, 11=true, 16=true, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=true, 31=false, 48=true}
Mark: :) YES!
Mark: {3=true, 13=false, 27=false, 28=true, 38=true, 42=true, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=true, 29=false, 32=true, 36=true, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 2, 5, 6, 7, 9, 10, 13, 14, 15, 17, 19, 21, 23, 24, 26, 27, 29, 31, 37, 39, 41, 44, 47, 49, 50]
## Caller: the number is.. 4
Mary: :( Noo..
Mary: {5=false, 11=true, 16=true, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=true, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=true, 42=true, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=true, 29=false, 32=true, 36=true, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 2, 5, 6, 7, 9, 10, 13, 14, 15, 17, 19, 21, 23, 24, 26, 27, 31, 37, 39, 41, 44, 47, 49, 50]
## Caller: the number is.. 29
Mary: :( Noo..
Mary: {5=false, 11=true, 16=true, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=true, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=true, 42=true, 44=false, 50=false}
Ana: :) YES!
Ana: {2=false, 6=false, 16=true, 29=true, 32=true, 36=true, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 2, 5, 6, 7, 10, 13, 14, 15, 17, 19, 21, 23, 24, 26, 27, 31, 37, 39, 41, 44, 47, 49, 50]
## Caller: the number is.. 9
Mary: :( Noo..
Mary: {5=false, 11=true, 16=true, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=true, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=true, 42=true, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=true, 29=true, 32=true, 36=true, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 2, 5, 6, 7, 10, 13, 14, 15, 17, 19, 21, 23, 26, 27, 31, 37, 39, 41, 44, 47, 49, 50]
## Caller: the number is.. 24
Mary: :( Noo..
Mary: {5=false, 11=true, 16=true, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=true, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=true, 42=true, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=true, 29=true, 32=true, 36=true, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 2, 5, 6, 7, 10, 13, 14, 15, 17, 19, 21, 23, 26, 27, 31, 37, 41, 44, 47, 49, 50]
## Caller: the number is.. 39
Mary: :( Noo..
Mary: {5=false, 11=true, 16=true, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=true, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=true, 42=true, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=false, 16=true, 29=true, 32=true, 36=true, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 2, 5, 7, 10, 13, 14, 15, 17, 19, 21, 23, 26, 27, 31, 37, 41, 44, 47, 49, 50]
## Caller: the number is.. 6
Mary: :( Noo..
Mary: {5=false, 11=true, 16=true, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :( Noo..
John: {2=false, 3=true, 13=false, 19=false, 23=false, 30=true, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=true, 42=true, 44=false, 50=false}
Ana: :) YES!
Ana: {2=false, 6=true, 16=true, 29=true, 32=true, 36=true, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 2, 5, 7, 10, 13, 14, 15, 17, 19, 21, 26, 27, 31, 37, 41, 44, 47, 49, 50]
## Caller: the number is.. 23
Mary: :( Noo..
Mary: {5=false, 11=true, 16=true, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :) YES!
John: {2=false, 3=true, 13=false, 19=false, 23=true, 30=true, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=true, 42=true, 44=false, 50=false}
Ana: :( Noo..
Ana: {2=false, 6=true, 16=true, 29=true, 32=true, 36=true, 43=true, 45=true}
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
Available numbers: [1, 5, 7, 10, 13, 14, 15, 17, 19, 21, 26, 27, 31, 37, 41, 44, 47, 49, 50]
## Caller: the number is.. 2
Mary: :( Noo..
Mary: {5=false, 11=true, 16=true, 31=false, 35=true, 37=false, 43=true, 48=true}
John: :) YES!
John: {2=true, 3=true, 13=false, 19=false, 23=true, 30=true, 31=false, 48=true}
Mark: :( Noo..
Mark: {3=true, 13=false, 27=false, 28=true, 38=true, 42=true, 44=false, 50=false}
Ana: :) YES!
Ana: {2=true, 6=true, 16=true, 29=true, 32=true, 36=true, 43=true, 45=true}
Ana: :) BINGOO!!!
Paul: :( Noo..
Paul: {14=false, 21=false, 27=false, 28=true, 31=false, 34=true, 41=false, 47=false}
## Caller: THE WINNER IS ANA !!!
```
