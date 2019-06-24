package create.factory.factorys;

import create.factory.interfaces.Cpu;
import create.factory.interfacesImpl.AmdCpu;
import create.factory.interfacesImpl.IntelCpu;

/**
 * @Author: lxy
 * @Date: 2019/6/10 16:53
 */
public class CpuFactory {
    public static Cpu createCpu(int type){
        Cpu cpu = null;
        if(type == 1){
            cpu = new IntelCpu(755);
        }else if(type == 2){
            cpu = new AmdCpu(938);
        }
        return cpu;
    }
}
