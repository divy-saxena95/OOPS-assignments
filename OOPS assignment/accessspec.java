class accessspec {
    //default member
    void accessspec1() {
        System.out.println("function1");
    }

    //public member
    public void accessspec2() {
        System.out.println("function 2");
    }

    //protected member
    protected void accessspec3() {
        System.out.println("function 3");
    }

    //private member
    private void accessspec4 () {
        System.out.println("function 4");
    }

}

class B extends accessspec {
    accessspec x = new accessspec();
    x.accessspec1();
    x.accessspec2();
    x.accessspec3();
    x.accessspec4();//fail

}

class C {
    accessspec y = new accessspec();
    y.accessspec1();
    y.accessspec2();
    y.accessspec3();
    y.accessspec4();//fail
}
