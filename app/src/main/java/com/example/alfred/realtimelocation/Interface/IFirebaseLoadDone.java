package com.example.alfred.realtimelocation.Interface;

import java.util.List;

public interface IFirebaseLoadDone {
    void onFirebaseLoadUserNameDone(List<String>lstEmail);
    void onFireBaseLoadFailed(String message);
}
