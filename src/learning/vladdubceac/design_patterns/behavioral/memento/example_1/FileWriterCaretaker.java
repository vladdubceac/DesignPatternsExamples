package learning.vladdubceac.design_patterns.behavioral.memento.example_1;

public class FileWriterCaretaker {
    private Object obj;

    public void save(FileWriterUtil fileWriterUtil){
        this.obj = fileWriterUtil.save();
    }

    public void undo(FileWriterUtil fileWriterUtil){
        fileWriterUtil.undoToLastSave(obj);
    }
}
