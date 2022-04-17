class Hanoi {

    public long toh(int N, int from, int to, int aux) {
        // Your code here
        long c=0;
        if(N==0)
        {
            return 0;
        }
        c+=toh(N-1,from,aux,to);//left call(sdh->shd)
        System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
        c+=toh(N-1,aux,to,from);//right call(sdh->hds)
        return c+1;
    }
}