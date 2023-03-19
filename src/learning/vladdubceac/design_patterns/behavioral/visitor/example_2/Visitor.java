package learning.vladdubceac.design_patterns.behavioral.visitor.example_2;

public interface Visitor {
    void visit(Book book);
    void visit(CD cd);
    void visit(DVD dvd);
    double getTotalPostage();
}
