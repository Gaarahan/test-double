package mock;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */
  SecurityCenter securityCenter;
  MockDoorPanel mockDoorPanel;

    @BeforeEach
    public void setUp() {
      mockDoorPanel = new MockDoorPanel();
      securityCenter = new SecurityCenter(mockDoorPanel);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
      securityCenter.switchOn();
      assertTrue(mockDoorPanel.isClosed());
    }
}
