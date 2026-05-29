void main () {

    Scanner sc = new Scanner(System.in);

    int inteiro = sc.nextInt();


    for (int i = 1; i <= inteiro; i++)
        if ( i % 2 != 0) {
            System.out.println(i); }


    sc.close();

}