package com.github.kuzznya.querier.builder.syntax.impl;

import com.github.kuzznya.querier.builder.syntax.SelectSyntaxProvider;
import com.github.kuzznya.querier.builder.syntax.SyntaxProvider;

public class DefaultSyntaxProvider implements SyntaxProvider {

    SelectSyntaxProvider selectSyntaxProvider = new DefaultSelectSyntaxProvider();

    @Override
    public SelectSyntaxProvider getSelectSyntaxProvider() {
        return selectSyntaxProvider;
    }

    @Override
    public String and() {
        return "AND";
    }

    @Override
    public String or() {
        return "OR";
    }

    @Override
    public String alias(String value, String alias) {
        return value + " AS " + alias;
    }

    @Override
    public String delimiter() {
        return " ";
    }
}
