package wangyu;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


/**
 * Created by admin on 2017/9/10.
 */
@Documented
@Target(ElementType.FIELD)
public @interface MyAnnotation {

    public String value() default "OK";
    public int intValue() default 0;
}
