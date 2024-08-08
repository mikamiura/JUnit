package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class SampleTest {
    @Nested //テストのグループ化
    class getColor {//getColorメソッドをテスト
        @Test
        void success() {//成功テスト メソッドが正しい色を返すかどうか
            assertEquals("赤", Sample.getColor(1));
            assertEquals("緑", Sample.getColor(2));
            assertEquals("青", Sample.getColor(3));
        }

        @Test
        @DisplayName("引数エラー")
        void fail() {//失敗テスト
/*            try {
                Sample.getColor(99);//1,2,3以外の値
                fail();
            } catch (IllegalArgumentException e) {//例外が発生すればテストは成功
            }*/
        	//assertThrowsメソッドを使用
        	assertThrows(IllegalArgumentException.class, () -> Sample.getColor(99));
            }
        }
    }

