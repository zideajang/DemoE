package com.example.jangwoo.demoe.api;

import com.example.jangwoo.demoe.models.Repo;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("users/{user}/repos")
    Single<List<Repo>> listRepos(@Path("user") String user);
}
