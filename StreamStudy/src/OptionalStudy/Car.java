package StreamStudy.src.OptionalStudy;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@Getter
@AllArgsConstructor
public class Car {
    String carName;
    int price;
    Optional<Insurance> insurance;
}