/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs6_hashcode;

/**
 *
 * @author jaspr_000
 */
class Hashcode {
    
    private String str;
    Hashcode(String s){
        this.str=s;
    }

    @Override
    public int hashCode() {
        int hs=0;
        for(int i=0;i<str.length();i++){
            hs=hs+(int)(str.charAt(i)*Math.pow(31,str.length()-1-i));
        }
        return hs;
    }
    
}
