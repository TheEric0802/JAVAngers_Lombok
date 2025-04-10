package org.example;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record Teacher(String id, String name, String subject) {
}
