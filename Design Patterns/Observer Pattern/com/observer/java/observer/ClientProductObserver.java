package com.observer.java.observer;

import com.observer.java.subject.Subject;

public class ClientProductObserver implements Observer{
  String observerEmail;
  Subject subjectSubscribed;
  public ClientProductObserver(String observerEmail) {
    this.observerEmail = observerEmail;
  }

  @Override
  public void update() {
    String newMessage = (String) subjectSubscribed.getUpdate();
    if (newMessage == null) {
      System.out.println(observerEmail + " No products received yet!!!");
    } else {
      System.out.println(observerEmail + " New products received: " + newMessage);
    }
  }

  @Override
  public void update(String newMessage) {
    if (newMessage == null) {
      System.out.println(observerEmail + " No products received yet !!!");
    } else {
      System.out.println(observerEmail + " New products received! " + newMessage);
    }
  }

  @Override
  public void setSubject(Subject subject) {
    subjectSubscribed = subject;
  }

}
