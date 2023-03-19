package learning.vladdubceac.design_patterns.behavioral.visitor.example_1;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
