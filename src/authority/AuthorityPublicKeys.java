package authority;

import java.util.HashMap;
import java.util.Map;

public class AuthorityPublicKeys {
    // map attribute to authority
    private Map<String,String> tMap ;
    //map authority to authpublicKey
    private Map<String,AuthPublicKey> tMapAPK;

    public AuthorityPublicKeys() {
        tMap=new HashMap<>();
        tMapAPK=new HashMap<>();
    }

    public AuthPublicKey getAPKByAttr(String attribute){
        if(!tMap.containsKey(attribute))
            throw new IllegalArgumentException("属性不存在于属性机构中");
        String authorityID=tMap.get(attribute);
        AuthPublicKey aPK=tMapAPK.get(authorityID);
        return aPK;
    }

    public Map<String, String> getTMap() {
        return tMap;
    }


    public Map<String,AuthPublicKey> gettMapAPK(){
        return tMapAPK;
    }


}
