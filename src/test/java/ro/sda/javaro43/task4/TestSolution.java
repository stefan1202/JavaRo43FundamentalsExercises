package ro.sda.javaro43.task4;

    import org.junit.Test;

    public class TestSolution {
        @Test
        public  void test1(){
            assert(Solution.getVoteCount(13,  0)== 13);
        }

        @Test
        public  void test2(){
            assert(Solution.getVoteCount(  2,  33 )== -31);
        }

        @Test
        public  void test3(){
            assert(Solution.getVoteCount( 132,  132 )== 0);
        }

        @Test
        public  void test4(){
            assert(Solution.getVoteCount(  0,  0 )== 0);
        }

        @Test
        public  void test5(){
            assert(Solution.getVoteCount(  4,  1 )== 3);
        }
}
