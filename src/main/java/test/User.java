package test;

import java.util.Objects;

public class User {
  int id;
  String name;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof User)) {
      return false;
    }
    User user = (User) o;
    return id == user.id && Objects.equals(name, user.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }
}
