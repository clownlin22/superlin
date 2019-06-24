package create.abstract_factory.factorysimpl;

import create.abstract_factory.factorys.AbstractFactory;
import create.factory.interfaces.Cpu;
import create.factory.interfaces.Mainboard;
import create.factory.interfacesImpl.IntelCpu;
import create.factory.interfacesImpl.IntelMainboard;

/**
 * @Author: lxy
 * @Date: 2019/6/10 16:57
 */
public class AmdFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        // TODO Auto-generated method stub
        return new IntelCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        // TODO Auto-generated method stub
        return new IntelMainboard(938);
    }

}
