package com.github.cchacin.immutables.issue;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;
import java.util.UUID;

@Data
@JsonDeserialize(as = SampleInternalBuilder.ImmutableSample.class)
public interface Sample {
    default UUID id() {
        return UUID.fromString("c8b5db4e-b9cf-442d-a4aa-e0c77764513f");
    }

    UUID someId();

    List<UUID> someIds();

    class Builder extends SampleInternalBuilder {
    }

    static Builder builder() {
        return new Builder();
    }
}
