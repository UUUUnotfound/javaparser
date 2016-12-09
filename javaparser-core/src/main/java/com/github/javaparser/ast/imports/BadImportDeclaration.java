package com.github.javaparser.ast.imports;

import com.github.javaparser.Range;
import com.github.javaparser.ast.nodeTypes.BadNode;
import com.github.javaparser.ast.observing.ObservableProperty;
import com.github.javaparser.ast.visitor.GenericVisitor;
import com.github.javaparser.ast.visitor.VoidVisitor;

import static com.github.javaparser.utils.Utils.assertNotNull;

/**
 * An import declaration that failed to parse.
 */
public class BadImportDeclaration extends ImportDeclaration implements
        BadNode<BadImportDeclaration> {

    public BadImportDeclaration() {
        this(null);
    }

    public BadImportDeclaration(Range range) {
        super(range);
    }

    @Override
    public <R, A> R accept(GenericVisitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public <A> void accept(VoidVisitor<A> v, A arg) {
        v.visit(this, arg);
    }

    @Override
    boolean isAsterisk() {
        return false;
    }

    @Override
    boolean isStatic() {
        return false;
    }
}
