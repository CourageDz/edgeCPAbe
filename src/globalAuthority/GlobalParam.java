package globalAuthority;

import authority.AuthorityPublicKeys;
import it.unisa.dia.gas.jpbc.Element;
import it.unisa.dia.gas.jpbc.PairingParameters;

public class GlobalParam {
    private static final long serialVersionUID = 1L;
    private PairingParameters pairingParameters;
    private AuthorityPublicKeys APKS;
    private Element g;
    private Element a;
    private byte[] ga;

    public GlobalParam() {
        this.APKS =new AuthorityPublicKeys();
    }

    public PairingParameters getPairingParameters(){return  pairingParameters;}

    public void setPairingParameters(PairingParameters pairingParameters) {
        this.pairingParameters = pairingParameters;
    }

    public Element getG() {
        return g;
    }

    public void setG(Element g) {
        this.g = g;
    }

    public byte[] getGa() {
        return ga;
    }

    public void setGa(byte[] ga) {
        this.ga = ga;
    }
    public Element getA() {
        return a;
    }

    public void setA(Element a) {
        this.a = a;
    }

    public AuthorityPublicKeys getAPKS() {
        return APKS;
    }

}
