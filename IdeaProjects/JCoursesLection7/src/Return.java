
public class Return {
    int a;
    Return(int i){
        a=i;
    }
    Return IncrByTen(){
        Return temp = new Return(a+10);
        return temp;
    }
}
