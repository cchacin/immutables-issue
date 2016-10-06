package com.github.cchacin.immutables.issue;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import org.immutables.value.Value;

import java.util.List;
import java.util.UUID;

@Data
@JsonDeserialize(as = ClassSampleInternalBuilder.ImmutableClassSample.class)
public abstract class AbstractClassSample {

    @Value.Default
    public UUID id() {
        return UUID.fromString("c8b5db4e-b9cf-442d-a4aa-e0c77764513f");
    }

    public abstract UUID someId();

    public abstract List<UUID> someIds();

    // Commented out beacuse ClassSampleInternalBuilder is final and cannot be extended
    //    class Builder extends ClassSampleInternalBuilder {
    //    }
    //
    //    static Builder builder() {
    //        return new Builder();
    //    }
}
