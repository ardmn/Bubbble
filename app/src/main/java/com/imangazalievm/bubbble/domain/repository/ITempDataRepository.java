package com.imangazalievm.bubbble.domain.repository;


import io.reactivex.Completable;
import io.reactivex.Single;

public interface ITempDataRepository {

    Completable saveToken(String token);
    Single<String> getToken();
    Completable clearToken();

}
