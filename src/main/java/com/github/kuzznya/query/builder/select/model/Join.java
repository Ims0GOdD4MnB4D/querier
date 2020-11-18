package com.github.kuzznya.query.builder.select.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Join {
    private final JoinType type;
    private final String table;
    private final String on;
}
