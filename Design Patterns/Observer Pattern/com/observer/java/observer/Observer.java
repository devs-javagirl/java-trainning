package com.observer.java.observer;

import com.observer.java.subject.Subject;

public interface Observer {

  //Method to check for an update from subject for state change
  void update();

  //Method used by Subject to update Observer for state change
  void update(String message);

  //Attach the observer to a subject
  void setSubject(Subject subject);

}
