package com.github.cchacin.immutables.issue;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import org.immutables.value.Value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@JsonSerialize
@Value.Style(
        defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        visibility = Value.Style.ImplementationVisibility.PACKAGE,
        builderVisibility = Value.Style.BuilderVisibility.PACKAGE,
        implementationNestedInBuilder = true,
        overshadowImplementation = true
)
public @interface Data {
}
