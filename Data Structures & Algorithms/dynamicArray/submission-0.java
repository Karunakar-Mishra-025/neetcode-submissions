class DynamicArray {
    private int[] arr;
    private int size;
    private int current;
    public DynamicArray(int capacity) {
        this.arr=new int[capacity];
        this.size=capacity;
        this.current=0;
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if(current == size){
            this.resize();
        }
        this.arr[current]=n;
        current+=1;
    }

    public int popback() {
        if(current ==0) return 0;
        int temp = this.arr[current - 1];
        current--;
        this.arr[current] =0;

        return temp;
    }

    private void resize() {
        size *= 2;
        int temp[]=new int[size];
        for(int i=0;i<current;i++){
            temp[i]=this.arr[i];
        }        
        arr = temp;
    }

    public int getSize() {
        return this.current;
    }

    public int getCapacity() {
        return this.size;
    }
}
