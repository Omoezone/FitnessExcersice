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
    public int montlyFee(boolean isBasic){
        if(this.isBasic){
            return 199;
        }else
            return 299;
    }

    @Override
    public String toString() {
        return "Member{" +
                "isBasic=" + isBasic +
                ", name='" + name + '\'' +
                ", cpr='" + cpr + '\'' +
                ", Member type='" + getMemberType() + '\'' +
                ", Fee='" + montlyFee(isBasic) + '\'' +
                '}';
    }
}
