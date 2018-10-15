package userKey;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Userkeys {
    private static final long serialVersionUID = 1L;
    private String  userID;
    private Map<String,UserAuthorityKey> userAuthKeys;
    private Set<String> attributes;
    private byte[] uUid;


    public Userkeys(String UserId) {
        this.userID=UserId;
        this.userAuthKeys =new HashMap<>();
        this.attributes=new HashSet<>();
    }

    public void addKey(UserAuthorityKey ak){
        userAuthKeys.put(ak.getAuthority(),ak);
    }
    public Set<String> getAuthorities(){
        return userAuthKeys.keySet();
    }
    public String getUserID() {
        return userID;
    }
    public Map<String, UserAuthorityKey> getUserAuthKeys() {
        return userAuthKeys;
    }

    public void addAttributes(Set<String>authAttributes){
            this.attributes.addAll(authAttributes);
    }
    public Set<String> getAttributes(){
        return attributes;
    }

    public byte[] getuUid() {
        return uUid;
    }

    public void setuUid(byte[] uUid) {
        this.uUid = uUid;
    }

}
