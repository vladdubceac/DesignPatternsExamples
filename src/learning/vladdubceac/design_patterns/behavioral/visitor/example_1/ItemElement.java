package learning.vladdubceac.design_patterns.behavioral.visitor.example_1;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
