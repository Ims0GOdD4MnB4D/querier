package com.github.kuzznya.querier.builder;

import com.github.kuzznya.querier.builder.select.AfterSelectBuilder;
import com.github.kuzznya.querier.builder.select.SelectBuilder;
import com.github.kuzznya.querier.builder.syntax.impl.DefaultSyntaxProvider;
import com.github.kuzznya.querier.builder.syntax.SyntaxProvider;

public class Querier {

    private final SyntaxProvider syntaxProvider;

    public Querier() {
        this(new DefaultSyntaxProvider());
    }

    public Querier(SyntaxProvider syntaxProvider) {
        this.syntaxProvider = syntaxProvider;
    }

    public AfterSelectBuilder select(String... columns) {
        return SelectBuilder.select(syntaxProvider, columns);
    }

    public AfterSelectBuilder.Aliasable select(String column) {
        return SelectBuilder.select(syntaxProvider, column);
    }

}
