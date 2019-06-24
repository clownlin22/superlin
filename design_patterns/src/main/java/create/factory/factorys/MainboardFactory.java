package create.factory.factorys;

import create.factory.interfaces.Mainboard;
import create.factory.interfacesImpl.AmdMainboard;
import create.factory.interfacesImpl.IntelMainboard;

/**
 * @Author: lxy
 * @Date: 2019/6/10 16:53
 */
public class MainboardFactory {
    public static Mainboard createMainboard(int type){
        Mainboard mainboard = null;
        if(type == 1){
            mainboard = new IntelMainboard(755);
        }else if(type == 2){
            mainboard = new AmdMainboard(938);
        }
        return mainboard;
    }
}
