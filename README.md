# Polymorphism_Practice_TicketMachine
I was trying to get a better grasp on Polymorphism. 
In this case by using a class as a type and having methods ask specifaclly for an object of a subclass of TicketBase. 
The ticket classes had different variables but the results of the programme were the same.

The other thing I was trying to do was to disconnect logic from I/O. 
This came out of a code review by @ggerritsen on different code for a FilmTicketMachine.
( https://github.com/BraveTea/FilmTicketMachine/issues/1#issuecomment-954482496 )

I realise that the moneyPutIn var could have been handled differently, but I only had limited time to write this
  so I chose to have it be a (global?) variable instead of something handled by a method.
