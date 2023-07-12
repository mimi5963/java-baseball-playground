package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ValidationUtilsTest {
    @Test
    @DisplayName("야구_숫자_1_9_검증")
    void 야구_숫자_1_9검증(){
         //이렇게 테스트 케이스 하나 다 완성 한 뒤에 commit하자
         //클래스명 같은거 고민하기 귀찮으면
        assertThat(ValidationUtils.validNo(9)).isTrue();//인풋아웃풋 정의하는것 도 중요
        assertThat(ValidationUtils.validNo(1)).isTrue();
        //경계값을 가지고 테스트하자 (적은 테스트로)
        assertThat(ValidationUtils.validNo(0)).isFalse();
        assertThat(ValidationUtils.validNo(10)).isFalse();

        //TDD연습하기 좋은 것은 알고리즘들! 그리고 유틸성 클래스 메서드들
    }




}
