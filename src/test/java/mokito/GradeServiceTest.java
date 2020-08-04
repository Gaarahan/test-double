package mokito;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;

import static org.mockito.Mockito.*;

public class GradeServiceTest {
  /* 需求描述：
  编写GradeService类的单元测试，单元测试calculateAverageGrades方法
  * */
  GradeService gradeService;
  GradeSystem mockedGradeSystem;
  @BeforeEach
  void setup () {
    mockedGradeSystem = mock(GradeSystem.class);
    gradeService = new GradeService(mockedGradeSystem);
  }

  @Test
  public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {

    when(mockedGradeSystem.gradesFor(10000)).thenReturn(Arrays.asList(80.0, 90.0, 100.0));

    double result = gradeService.calculateAverageGrades(10000);
    Assertions.assertEquals(90.0, result);
  }
}
