package com.schaldrac.rxjava.retrofit;


import android.support.annotation.NonNull;

import com.schaldrac.rxjava.model.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IMyAPI {
    @NonNull
    @GET("posts")
    Observable<List<Post>> getPosts();

}
