/**
 * 
 */
package cn.qdas.core.db;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author leo.Zhou 周钧
 * 2019年7月15日
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface DataSource {
	String value() default "";
}
