package RemoteMethodInvocation;

import java.rmi.*;

public interface AddServerIntf {
    double add(double d1, double d2) throws RemoteException;
}
