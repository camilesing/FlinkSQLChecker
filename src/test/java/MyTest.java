import com.camile.checker.FlinkSqlCheckerTypes;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

public class MyTest {

    @Test
    public void test(){
        for (Field f : FlinkSqlCheckerTypes.class.getFields()){
            System.out.println("public TokenSet "+ f.getName()+" = TokenSet.create(FlinkSqlCheckerTypes."+ f.getName()+");");
        }
    }
}
