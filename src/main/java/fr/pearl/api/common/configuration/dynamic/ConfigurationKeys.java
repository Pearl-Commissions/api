package fr.pearl.api.common.configuration.dynamic;

import org.simpleyaml.configuration.comments.CommentType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ConfigurationKeys {

    String value();

    String[] comments() default {};

    String[] keyComments() default {};

    CommentType commentType() default CommentType.BLOCK;

    String[] defaultKeys() default {};
}
