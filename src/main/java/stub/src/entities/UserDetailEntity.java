package stub.src.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserDetailEntity {
  private final Long id;
  private final String name;
  private final String grade;
  private final String schoolName;
  private final String city;
}
