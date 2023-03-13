package MediatorPattern;
import java.awt.*;
import java.awt.event.*;

public class ColleagueTextField extends TextField implements TextListener, Colleague {
  private Mediator mediator;

  public ColleagueTextField(String caption, int limit) {
      super(caption, limit);
  }
  public void setMediator(Mediator mediator) {
      this.mediator = mediator;
  }
  public void setColleagueEnabled(boolean enabled) {
      setEnabled(enabled);
  }

    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged(this);
    }
}