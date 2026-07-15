class DynamicArray {

    private int[] list;
    private int size;

    public DynamicArray(int capacity) {
        this.list = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        return this.list[i];
    }

    public void set(int i, int n) {
        this.list[i] = n;
    }

    public void pushback(int n) {
        if (this.size == this.list.length) {
            this.resize();
        }
        this.list[this.size] = n;
        this.size++;
    }

    public int popback() {
        int v = this.list[this.size-1];
        // this.list[this.size-1] = 0;
        this.size--;
        return v;
    }

    private void resize() {
        int[] newList = new int[(this.list.length) * 2];
        for(int i=0; i<this.list.length; i++){
            newList[i] = this.list[i];
        }
        this.list = newList;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.list.length;
    }
}

