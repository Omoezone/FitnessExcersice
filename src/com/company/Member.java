package com.company;

public class Member extends Person {
    protected Boolean isBasic;

    public Member(String name, String cpr, Boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public Boolean getBasic() {
        return isBasic;
    }

    public void setBasic(Boolean basic) {
        isBasic = basic;
    }

    public String getMemberType(){
        if(isBasic){
            return "Basic";
        }else
            return "Full";
    }
    public int montlyFee(){
        if(this.isBasic){
            return 199;
        }else
            return 299;
    }
    @Override
    public String toString() {
        return String.format("%-15s\t%-15s\t%-15s\t%-15s",name,cpr,getMemberType(),montlyFee());

    }
}
