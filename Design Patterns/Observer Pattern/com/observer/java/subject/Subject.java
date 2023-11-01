package com.observer.java.subject;

import com.observer.java.observer.Observer;

public interface Subject {

  //register an subject to a subject
  void register(Observer observer);

  //unregister an subject from a subject
  void unregister(Observer observer);

  //notify all observers for the change in subject's state
  void notifyObservers();

  //method to get update from subject by the observer
  Object getUpdate();

  //post message to observers
  void postMessage(String message);
}