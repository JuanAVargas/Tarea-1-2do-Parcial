public class Series{
    public int serie1(int veces){
        int num=1;
        for(int i=2; i<=veces;i=i){
            num=num+1;
            i=i+1;
            if(i<=veces){
                num=num+2;
                i=i+1;
                if(i<=veces){
                    num = num+3;
                    i=i+1;
                    if(i<=veces){
                        num=num+2;
                        i=i+1;
                    }
                }
            }
        }
        return num;
    }
    public int serie2(int veces){
        int x1=1;
        int x2=1;
        int x3=1;
        int resul=1;
        for(int i=4;i<=veces;i=i+1){
            resul=x1+x2;
            x1=x2;
            x2=x3;
            x3=resul;
        }
        return resul;
    }
}

