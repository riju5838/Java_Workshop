class animal {
    String dog;

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

}

class dog extends animal {
    String barking;

    public String getBarking() {
        return barking;
    }

    public void setBarking(String barking) {
        this.barking = barking;
    }
}

class Q96 {
    public static void main(String[] args) {
        dog ob = new dog();
        ob.setDog("fucking");
        System.out.println(ob.getDog());
        ob.setBarking("riju");
        System.out.println(ob.getBarking());
    }
}
