package practice.command.style_3;

public class ShrinkSpell extends Command {

    private Target target;
    private Size oldSize;
    @Override
    public void execute(Target target) {
        oldSize =target.getSize();
        target.setSize(Size.SMALL);
        this.target = target;
    }

    @Override
    public void undo() {
        if(oldSize !=null && target !=null){
            Size temp = target.getSize();
            target.setSize(oldSize);
            oldSize = temp;
        }
    }

    @Override
    public void redo() {
        undo();
    }

    @Override
    public String toString() {
        return "Shrink Spell";
    }
}
