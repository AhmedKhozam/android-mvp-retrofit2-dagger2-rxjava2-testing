## Android MVP Demo
This project demonstrates Model-View-Presenter pattern in android. 

There are two screens in this demo app.
First screen shows a list of movies using [The Movie Database](https://www.themoviedb.org/?language=en) open APIs.
Second screen is a detail screen where user can see details about selected movie. This pretty much covers a real world scenario.

Following notable libraries have been used in this project
  1. [Retrofit 2](http://square.github.io/retrofit/) for API interaction
  2. [Dagger 2](https://github.com/google/dagger) for dependency injection
  3. [RxJava 2](https://github.com/ReactiveX/RxJava) for power of reactive programming
  
I have used Dagger `SubComponents` to pass dependencies down in dependency graph.

Here are some nice articles which helped me in learning `Dagger 2` and in building this demo project.
 
 1. [Dependency Injection with Dagger 2- CodePath](https://guides.codepath.com/android/dependency-injection-with-dagger-2)
 2. [Dependency injection with Dagger 2 - the API](http://frogermcs.github.io/dependency-injection-with-dagger-2-the-api/)
 3. [Introduction to Dagger 2, Using Dependency Injection in Android: Part 2](https://blog.mindorks.com/introduction-to-dagger-2-using-dependency-injection-in-android-part-2-b55857911bcd)
 4. [An Introduction to Dagger 2 (Android DI) – Part 1](https://dzone.com/articles/an-introduction-to-dagger-2-android-di-part-1-3)