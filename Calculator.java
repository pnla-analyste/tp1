class Calculator{

    public int add(int a, int b){
        return a+b;
    }

    public int substract(int a, int b){
        return a-b;
    }

    public int divide(int a, int b){

        int r = 0;

        if (b != 0){
            r = a/b;
        }

        return r;
    }

    public static void main(String[] args){

        Calculator calcul = new Calculator();

        int a = 10;
        int b = 10;


        System.out.println(a+" + "+b+" = "+calcul.add(a, b));
        System.out.println(a+" - "+b+" = "+calcul.substract(a, b));
        System.out.println(a+" / "+b+" = "+calcul.divide(a, b));
    }
}
