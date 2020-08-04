package mock;

/**
 * @author gaarahan
 */
public class MockDoorPanel extends DoorPanel {
  private boolean closed = false;

  @Override
  public void close() {
    this.closed = true;
  }

  public boolean isClosed() {
    return closed;
  }
}
