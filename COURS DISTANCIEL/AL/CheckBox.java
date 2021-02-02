public class CheckBox {
  enum State {
    IDLE_ON, HOVERED_ON, ARMED_ON, ARMED_LEAVED_ON,
    IDLE_OFF, HOVERED_OFF, ARMED_OFF, ARMED_LEAVED_OFF
  }

  private State state = IDLE_OFF;

  public void onButtonPressed(Event e) {
    switch(this.state) {
      case HOVERED_ON : {
        this.state = ARMED_ON;
        break;
      }
      case HOVERED_OFF : {
        this.state = ARMED_OFF;
        break;
      }
    }
  }

  public void onButtonReleased(Event e) {
    switch(this.state) {
      case ARMED_ON : {
        this.toogleCheck();
        this.state = HOVERED_OFF;
        break;
      }
      case ARMED_OFF : {
        this.toogleCheck();
        this.state = HOVERED_ON;
        break;
      }
      case ARMED_LEAVED_ON : {
        this.state = IDLE_ON;
        break;
      }
      case ARMED_LEAVED_OFF : {
        this.state = IDLE_OFF;
        break;
      }
    }
  }

  public void onEnter() {
    switch(this.state) {
      case IDLE_ON : {
        this.state = HOVERED_ON;
        break;
      }
      case IDLE_OFF : {
        this.state = HOVERED_OFF;
        break;
      }
      case ARMED_LEAVED_ON : {
        this.state = ARMED_ON;
        break;
      }
      case ARMED_LEAVED_OFF : {
        this.state = ARMED_OFF;
        break;
      }
    }
  }

  public void onLeave() {
    switch(this.state) {
      case HOVERED_ON : {
        this.state = IDLE_ON;
        break;
      }
      case HOVERED_OFF : {
        this.state = IDLE_OFF;
        break;
      }
      case ARMED_ON : {
        this.state = ARMED_LEAVED_ON;
        break;
      }
      case ARMED_OFF : {
        this.state = ARMED_LEAVED_OFF;
        break;
      }
    }
  }

  public void toogleCheck(){...};
}
