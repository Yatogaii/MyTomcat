public enum  HttpStatus {
    OK(200){
        @Override
        public boolean isSucess(){
            return true;
        }
    },
    Error(404);

    private int value;
    HttpStatus(int value){  //这个构造器虽然没用过，但是若是想要枚举类带有数字就必须有这个
        this.value = value;
    }

    public boolean isSucess(){
        return true;
    }
}
