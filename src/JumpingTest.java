import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class JumpingTest {
      public JumpingTest(){
}
    @Test
    public void testJump() {
      int [][] coord = {{2,0},{1,1}, {0,1}};
      int frogX=0, frogY=0,frogLength=1;
      Kuzne4ik k = new Kuzne4ik (frogX,frogY,frogLength, coord);
      Assertions.assertEquals(3, Kuzne4ik.solve(k));
    }
}