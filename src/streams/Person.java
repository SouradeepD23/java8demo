package streams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {
    private String name;
    private Integer age;
    private Gender gender;

    @Override
    public String toString() {
        return "Person{" +
                "Name: " + getName()
                + ", Age: " + getAge()
                + ", Gender: " + getGender()
                + "}";
    }
}
