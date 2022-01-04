package fr.pearl.api.common.configuration.dynamic;

import org.simpleyaml.configuration.comments.CommentType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ConfigurationPath {

    String value();

    String[] comments() default {};

    CommentType commentType() default CommentType.BLOCK;
}
