package mokito;

import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SecurityCenterTest {
  SecurityCenter securityCenter;
  DoorPanel mockedDoorPanel;

    @BeforeEach
    public void setUp() {
      mockedDoorPanel = mock(DoorPanel.class);
      securityCenter = new SecurityCenter(mockedDoorPanel);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
      securityCenter.switchOn();
      verify(mockedDoorPanel).close();
    }
}
