package mogo.database.test1.base;


import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class BasedResponse<T> {
    private T payload;
}
