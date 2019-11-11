package day20;

import java.util.stream.Stream;

public class Person { 
private String name; 
public Person(String str) { 
this.name = str; 
}
@Override 
public String toString() { 
return "Person{name='" + name + "'}"; 
}
public String getName() { 
return name; 
}
public void setName(String name) { 
this.name = name; 
}
} 
