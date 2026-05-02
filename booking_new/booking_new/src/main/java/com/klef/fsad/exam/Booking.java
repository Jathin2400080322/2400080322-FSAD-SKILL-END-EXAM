package com.klef.fsad.exam;

import jakarta.persistence.*;

@Entity
@Table(name="booking")
public class Booking {

 @Id
 private int id;   // manual ID

 private String name;
 private String date;
 private String status;

 public Booking(){}

 public int getId(){ return id; }
 public void setId(int id){ this.id=id; }

 public String getName(){ return name; }
 public void setName(String name){ this.name=name; }

 public String getDate(){ return date; }
 public void setDate(String date){ this.date=date; }

 public String getStatus(){ return status; }
 public void setStatus(String status){ this.status=status; }
}