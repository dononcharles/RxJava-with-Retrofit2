# RxJava-with-Retrofit2
How to use Retrofit 2 with RxJava to fetch data from REST API

1-Intall first retrofit 2 library :

    implementation 'com.squareup.retrofit2:adapter-rxjava2:2.4.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.4.0'
    implementation 'com.squareup.retrofit2:retrofit:2.4.0'

2-Intall after RxJava library :
    implementation 'io.reactivex.rxjava2:rxandroid:2.1.0'
    implementation 'io.reactivex.rxjava2:rxjava:2.2.0'
    
3- Use https://jsonplaceholder.typicode.com/ for your REST API

Take a look in code, to see, API Interface, RestClient, Model are organised
